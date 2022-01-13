// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.GlobalAdministratorsClient;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GlobalAdministratorsClient. */
public final class GlobalAdministratorsClientImpl implements GlobalAdministratorsClient {
    private final ClientLogger logger = new ClientLogger(GlobalAdministratorsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GlobalAdministratorsService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of GlobalAdministratorsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GlobalAdministratorsClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(GlobalAdministratorsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientGlobalAdministrators to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface GlobalAdministratorsService {
        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.Authorization/elevateAccess")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> elevateAccess(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> elevateAccessWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-07-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.elevateAccess(this.client.getEndpoint(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> elevateAccessWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-07-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.elevateAccess(this.client.getEndpoint(), apiVersion, accept, context);
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> elevateAccessAsync() {
        return elevateAccessWithResponseAsync().flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void elevateAccess() {
        elevateAccessAsync().block();
    }

    /**
     * Elevates access for a Global Administrator.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> elevateAccessWithResponse(Context context) {
        return elevateAccessWithResponseAsync(context).block();
    }
}
