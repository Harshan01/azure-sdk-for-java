// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkScopeOperationStatusClient. */
public interface PrivateLinkScopeOperationStatusClient extends InnerSupportsGet<OperationStatusInner> {
    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<OperationStatusInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String asyncOperationId);

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<OperationStatusInner> getByResourceGroupAsync(String resourceGroupName, String asyncOperationId);

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param asyncOperationId The operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner getByResourceGroup(String resourceGroupName, String asyncOperationId);

    /**
     * Get the status of an azure asynchronous operation associated with a private link scope operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param asyncOperationId The operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of an azure asynchronous operation associated with a private link scope operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationStatusInner> getByResourceGroupWithResponse(
        String resourceGroupName, String asyncOperationId, Context context);
}
