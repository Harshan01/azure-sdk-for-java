// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appservice.fluent.models.ContainerAppInner;
import com.azure.resourcemanager.appservice.fluent.models.SecretsCollectionInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContainerAppsClient. */
public interface ContainerAppsClient
    extends InnerSupportsGet<ContainerAppInner>, InnerSupportsListing<ContainerAppInner>, InnerSupportsDelete<Void> {
    /**
     * Get the Container Apps in a given subscription.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ContainerAppInner> listAsync();

    /**
     * Get the Container Apps in a given subscription.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> list();

    /**
     * Get the Container Apps in a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> list(Context context);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ContainerAppInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get the Container Apps in a given resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container Apps in a given resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerAppInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ContainerAppInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String name);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerAppInner> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner getByResourceGroup(String resourceGroupName, String name);

    /**
     * Get the properties of a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerAppInner> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ContainerAppInner>, ContainerAppInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ContainerAppInner>, ContainerAppInner> beginCreateOrUpdate(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ContainerAppInner>, ContainerAppInner> beginCreateOrUpdate(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope, Context context);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerAppInner> createOrUpdateAsync(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner createOrUpdate(String resourceGroupName, String name, ContainerAppInner containerAppEnvelope);

    /**
     * Description for Create or update a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param containerAppEnvelope Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner createOrUpdate(
        String resourceGroupName, String name, ContainerAppInner containerAppEnvelope, Context context);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String name);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String name);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name, Context context);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String name);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name);

    /**
     * Description for Delete a Container App.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, Context context);

    /**
     * List secrets for a container app.
     *
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SecretsCollectionInner>> listSecretsWithResponseAsync(String name);

    /**
     * List secrets for a container app.
     *
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SecretsCollectionInner> listSecretsAsync(String name);

    /**
     * List secrets for a container app.
     *
     * @param name Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecretsCollectionInner listSecrets(String name);

    /**
     * List secrets for a container app.
     *
     * @param name Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App Secrets Collection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecretsCollectionInner> listSecretsWithResponse(String name, Context context);
}
