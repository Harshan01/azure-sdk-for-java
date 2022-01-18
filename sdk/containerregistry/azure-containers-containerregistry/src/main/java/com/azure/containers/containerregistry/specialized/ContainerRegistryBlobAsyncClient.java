// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.containers.containerregistry.specialized;

import com.azure.containers.containerregistry.implementation.AzureContainerRegistryImpl;
import com.azure.containers.containerregistry.implementation.AzureContainerRegistryImplBuilder;
import com.azure.containers.containerregistry.implementation.ContainerRegistriesImpl;
import com.azure.containers.containerregistry.implementation.ContainerRegistryBlobsImpl;
import com.azure.containers.containerregistry.implementation.UtilsImpl;
import com.azure.containers.containerregistry.implementation.models.ContainerRegistriesCreateManifestHeaders;
import com.azure.containers.containerregistry.implementation.models.ContainerRegistryBlobsCompleteUploadHeaders;
import com.azure.containers.containerregistry.implementation.models.ManifestWrapper;
import com.azure.containers.containerregistry.models.DownloadBlobResult;
import com.azure.containers.containerregistry.models.OciManifest;
import com.azure.containers.containerregistry.models.UploadBlobResult;
import com.azure.containers.containerregistry.models.UploadManifestResult;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.ServiceResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerEncoding;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;

/**
 * This class provides a client that exposes operations to push and pull images into container registry.
 * It exposes methods that upload, download and delete artifacts from the registry i.e. images and manifests.
 *
 * <p>View {@link ContainerRegistryBlobClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see ContainerRegistryBlobClientBuilder
 */
@ServiceClient(builder = ContainerRegistryBlobClientBuilder.class, isAsync = true)
public class ContainerRegistryBlobAsyncClient {

    private final AzureContainerRegistryImpl registryImplClient;
    private final ContainerRegistryBlobsImpl blobsImpl;
    private final ContainerRegistriesImpl registriesImpl;
    private final HttpPipeline httpPipeline;
    private final String endpoint;
    private final String apiVersion;
    private final String repositoryName;
    private final String registryLoginServer;

    private final ClientLogger logger = new ClientLogger(ContainerRegistryBlobAsyncClient.class);

    ContainerRegistryBlobAsyncClient(String repositoryName, HttpPipeline httpPipeline, String endpoint, String version) {
        this.repositoryName = repositoryName;
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.registryImplClient = new AzureContainerRegistryImplBuilder()
            .url(endpoint)
            .pipeline(httpPipeline)
            //.apiVersion(version)
            .buildClient();
        this.blobsImpl = this.registryImplClient.getContainerRegistryBlobs();
        this.registriesImpl = this.registryImplClient.getContainerRegistries();
        this.apiVersion = version;
        try {
            URL endpointUrl = new URL(endpoint);
            this.registryLoginServer = endpointUrl.getHost();
        } catch (MalformedURLException ex) {
            // This will not happen.
            throw logger.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL"));
        }
    }

    /**
     * This method returns the registry's repository on which operations are being performed.
     *
     * @return The name of the repository
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * This method returns the complete registry endpoint.
     *
     * @return The registry endpoint including the authority.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Upload the Oci manifest to the repository.
     * The upload is done as a single operation.
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     * @param manifest The OciManifest that needs to be uploaded.
     * @return operation result.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code manifest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UploadManifestResult> uploadManifest(OciManifest manifest) {
        if (manifest == null) {
            throw logger.logExceptionAsError(new NullPointerException("'manifest' can't be null."));
        }

        try {
            byte[] bytes = this.registryImplClient.getSerializerAdapter().serializeToBytes(manifest, SerializerEncoding.JSON);
            return withContext(context -> this.uploadManifestWithResponse(Flux.just(ByteBuffer.wrap(bytes)), context)).flatMap(FluxUtil::toMono);
        } catch (IOException exception) {
            return monoError(logger, new RuntimeException(exception.getMessage()));
        }
    }

    /**
     * Uploads a manifest to the repository.
     * The client currently only supports uploading OciManifests to the repository.
     * And this operation makes the assumption that the data provided is a valid OCI manifest.
     * <p>
     * Also, the data is read into memory and then an upload operation is performed as a single operation.
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     * @param data The manifest that needs to be uploaded.
     * @return operation result.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code data} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UploadManifestResult> uploadManifest(BinaryData data) {
        if (data == null) {
            throw logger.logExceptionAsError(new NullPointerException("'data' can't be null."));
        }

        return withContext(context -> this.uploadManifestWithResponse(data.toFluxByteBuffer(), context)).flatMap(FluxUtil::toMono);
    }

    /**
     * Uploads a manifest to the repository.
     * The client currently only supports uploading OciManifests to the repository.
     * And this operation makes the assumption that the data provided is a valid OCI manifest.
     * <p>
     * Also, the data is read into memory and then an upload operation is performed as a single operation.
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     *
     * @param data The manifest that needs to be uploaded.
     * @return The rest response containing the operation result.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code data} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UploadManifestResult>> uploadManifestWithResponse(BinaryData data) {
        if (data == null) {
            throw logger.logExceptionAsError(new NullPointerException("'data' can't be null."));
        }

        return withContext(context -> this.uploadManifestWithResponse(data.toFluxByteBuffer(), context));
    }

    Mono<Response<UploadManifestResult>> uploadManifestWithResponse(Flux<ByteBuffer> data, Context context) {
        if (data == null) {
            throw logger.logExceptionAsError(new NullPointerException("'data' can't be null."));
        }

        BufferedFlux playableFlux = new BufferedFlux();

        return data.concatMap(playableFlux::write)
            .then(Mono.defer(() -> Mono.just(playableFlux.getDigest())))
            .flatMap(dig -> this.registriesImpl.createManifestWithResponseAsync(
                repositoryName,
                dig,
                playableFlux.flush(),
                playableFlux.getSize(),
                UtilsImpl.OCI_MANIFEST_MEDIA_TYPE,
                context))
            .flatMap(response -> {
                Response<UploadManifestResult> res = new ResponseBase<ContainerRegistriesCreateManifestHeaders, UploadManifestResult>(
                    response.getRequest(),
                    response.getStatusCode(),
                    response.getHeaders(),
                    new UploadManifestResult(response.getDeserializedHeaders().getDockerContentDigest()),
                    response.getDeserializedHeaders());

                return Mono.just(res);
            }).onErrorMap(UtilsImpl::mapException);
    }

    /**
     * Uploads a blob to the repository.
     * The client currently uploads the entire blob\layer as a single unit.
     * <p>
     * The blob is read into memory and then an upload operation is performed as a single operation.
     * We currently do not support breaking the layer into multiple chunks and uploading them one at a time
     *
     * @param data The blob\image content that needs to be uploaded.
     * @return The operation result.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code data} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UploadBlobResult> uploadBlob(BinaryData data) {
        if (data == null) {
            throw logger.logExceptionAsError(new NullPointerException("'data' can't be null."));
        }

        return withContext(context -> this.uploadBlobWithResponse(data.toFluxByteBuffer(), context)).flatMap(FluxUtil::toMono);
    }

    /**
     * Uploads a blob to the repository.
     * The client currently uploads the entire blob\layer as a single unit.
     * <p>
     * The blob is read into memory and then an upload operation is performed as a single operation.
     * We currently do not support breaking the layer into multiple chunks and uploading them one at a time
     *
     * @param data The blob\image content that needs to be uploaded.
     * @return The rest response containing the operation result.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code data} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UploadBlobResult>> uploadBlobWithResponse(BinaryData data) {
        return withContext(context -> this.uploadBlobWithResponse(data.toFluxByteBuffer(), context));
    }

    Mono<Response<UploadBlobResult>> uploadBlobWithResponse(Flux<ByteBuffer> data, Context context) {
        if (data == null) {
            throw logger.logExceptionAsError(new NullPointerException("'data' can't be null."));
        }

        BufferedFlux playableFlux = new BufferedFlux();

        AtomicReference<String> digest = new AtomicReference<>();
        return data.concatMap(playableFlux::write)
            .then(Mono.defer(() -> Mono.just(playableFlux.getDigest())))
            .flatMap(dig -> {
                digest.set(dig);
                return this.blobsImpl.startUploadWithResponseAsync(repositoryName, context);
            })
            .flatMap(startUploadResponse -> this.blobsImpl.uploadChunkWithResponseAsync(trimNextLink(startUploadResponse.getDeserializedHeaders().getLocation()), playableFlux.flush(), playableFlux.getSize(), context))
            .flatMap(uploadChunkResponse -> this.blobsImpl.completeUploadWithResponseAsync(digest.get(), trimNextLink(uploadChunkResponse.getDeserializedHeaders().getLocation()), null, 0L, context))
            .flatMap(completeUploadResponse -> {
                Response<UploadBlobResult> res = new ResponseBase<ContainerRegistryBlobsCompleteUploadHeaders, UploadBlobResult>(completeUploadResponse.getRequest(),
                    completeUploadResponse.getStatusCode(),
                    completeUploadResponse.getHeaders(),
                    new UploadBlobResult(completeUploadResponse.getDeserializedHeaders().getDockerContentDigest()),
                    completeUploadResponse.getDeserializedHeaders());

                return Mono.just(res);
            }).onErrorMap(UtilsImpl::mapException);
    }

    private String trimNextLink(String locationHeader) {
        // The location header returned in the nextLink for upload chunk operations starts with a '/'
        // which the service expects us to remove before calling it.
        if (locationHeader.startsWith("/")) {
            return locationHeader.substring(1);
        }

        return locationHeader;
    }

    /**
     * Download the manifest associated with the given tag or digest.
     * We currently only support downloading OCI manifests.
     *
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     *
     * @param tagOrDigest The tag or digest of the manifest.
     * @return The manifest associated with the given tag or digest.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code tagOrDigest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OciManifest> downloadManifest(String tagOrDigest) {
        return this.downloadManifestWithResponse(tagOrDigest).flatMap(FluxUtil::toMono);
    }

    /**
     * Download the manifest associated with the given tag or digest.
     * We currently only support downloading OCI manifests.
     *
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     *
     * @param tagOrDigest The tag or digest of the manifest.
     * @return The response for the manifest associated with the given tag or digest.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code tagOrDigest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OciManifest>> downloadManifestWithResponse(String tagOrDigest) {
        return withContext(context -> this.downloadManifestWithResponse(tagOrDigest, context));
    }

    Mono<Response<OciManifest>> downloadManifestWithResponse(String tagOrDigest, Context context) {
        if (tagOrDigest == null) {
            throw logger.logExceptionAsError(new NullPointerException("'tagOrDigest' can't be null."));
        }

        return this.registriesImpl.getManifestWithResponseAsync(repositoryName, tagOrDigest, UtilsImpl.OCI_MANIFEST_MEDIA_TYPE, context)
            .flatMap(response -> {
                String digest = response.getHeaders().getValue(UtilsImpl.DOCKER_DIGEST_HEADER_NAME);
                ManifestWrapper wrapper = response.getValue();

                // The service wants us to validate the digest here since a lot of customers forget to do it before consuming
                // the contents returned by the service.
                if (Objects.equals(digest, tagOrDigest) || Objects.equals(response.getValue().getTag(), tagOrDigest)) {
                    OciManifest ociManifest = new OciManifest()
                        .setAnnotations(wrapper.getAnnotations())
                        .setConfig(wrapper.getConfig())
                        .setLayers(wrapper.getLayers())
                        .setSchemaVersion(wrapper.getSchemaVersion());

                    Response<OciManifest> res = new ResponseBase<Void, OciManifest>(
                        response.getRequest(),
                        response.getStatusCode(),
                        response.getHeaders(),
                        ociManifest,
                        null);

                    return Mono.just(res);
                } else {
                    return monoError(logger, new ServiceResponseException("The digest in the response does not match the expected digest."));
                }
            }).onErrorMap(UtilsImpl::mapException);
    }

    /**
     * Download the blob associated with the given digest.
     *
     * @param digest The digest for the given image layer.
     * @return The image associated with the given digest.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code digest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DownloadBlobResult> downloadBlob(String digest) {
        return this.downloadBlobWithResponse(digest).flatMap(FluxUtil::toMono);
    }

    /**
     * Download the blob\layer associated with the given digest.
     *
     * @param digest The digest for the given image layer.
     * @return The image associated with the given digest.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code digest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DownloadBlobResult>> downloadBlobWithResponse(String digest) {
        return withContext(context -> this.downloadBlobWithResponse(digest, context));
    }

    Mono<Response<DownloadBlobResult>> downloadBlobWithResponse(String digest, Context context) {
        if (digest == null) {
            throw logger.logExceptionAsError(new NullPointerException("'digest' can't be null."));
        }

        return this.blobsImpl.getBlobWithResponseAsync(repositoryName, digest, context)
            .flatMap(streamResponse -> {
                String resDigest = streamResponse.getHeaders().getValue(UtilsImpl.DOCKER_DIGEST_HEADER_NAME);
                Response<DownloadBlobResult> blobResult = new ResponseBase<>(
                    streamResponse.getRequest(),
                    streamResponse.getStatusCode(),
                    streamResponse.getHeaders(),
                    null,
                    new DownloadBlobResult()
                        .setContent(streamResponse.getValue())
                        .setDigest(resDigest));

                return Mono.just(blobResult);
            }).onErrorMap(UtilsImpl::mapException);
    }

    /**
     * Delete the image associated with the given digest
     *
     * @param digest The digest for the given image layer.
     * @return The completion signal.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code digest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteBlob(String digest) {
        return this.deleteBlobWithResponse(digest).flatMap(FluxUtil::toMono);
    }

    /**
     * Delete the image associated with the given digest
     *
     * @param digest The digest for the given image layer.
     * @return The REST response for the completion.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code digest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteBlobWithResponse(String digest) {
        return withContext(context -> deleteBlobWithResponse(digest, context));
    }

    Mono<Response<Void>> deleteBlobWithResponse(String digest, Context context) {
        if (digest == null) {
            throw logger.logExceptionAsError(new NullPointerException("'digest' can't be null."));
        }

        return this.blobsImpl.deleteBlobWithResponseAsync(repositoryName, digest, context)
            .flatMap(UtilsImpl::deleteResponseToSuccess)
            .onErrorMap(UtilsImpl::mapException);
    }

    /**
     * Delete the manifest associated with the given digest.
     * We currently only support downloading OCI manifests.
     *
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     *
     * @param digest The digest of the manifest.
     * @return The completion.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code digest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteManifest(String digest) {
        return this.deleteManifestWithResponse(digest).flatMap(FluxUtil::toMono);
    }

    /**
     * Delete the manifest associated with the given digest.
     * We currently only support downloading OCI manifests.
     *
     * @see <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">Oci Manifest Specification</a>
     *
     * @param digest The digest of the manifest.
     * @return The REST response for completion.
     * @throws ClientAuthenticationException thrown if the client's credentials do not have access to modify the namespace.
     * @throws NullPointerException thrown if the {@code digest} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteManifestWithResponse(String digest) {
        return withContext(context -> deleteManifestWithResponse(digest, context));
    }

    Mono<Response<Void>> deleteManifestWithResponse(String digest, Context context) {
        return this.registriesImpl.deleteManifestWithResponseAsync(repositoryName, digest, context)
            .flatMap(UtilsImpl::deleteResponseToSuccess)
            .onErrorMap(UtilsImpl::mapException);
    }

    static final class BufferedFlux {
        int size;
        ByteBuffer byteBuffer;

        int getSize() {
            return this.size;
        }

        String getDigest() {
            return UtilsImpl.computeDigest(byteBuffer);
        }

        Flux<Void> write(ByteBuffer buffer) {
            size += buffer.remaining();
            byteBuffer = buffer;
            return Flux.empty();
        }

        Flux<ByteBuffer> flush() {
            return Flux.just(byteBuffer);
        }
    }
}
