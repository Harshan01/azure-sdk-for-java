// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redhatopenshift.fluent.models.OpenShiftVersionInner;

/**
 * An instance of this class provides access to all the operations defined in OpenShiftVersionsClient.
 */
public interface OpenShiftVersionsClient {
    /**
     * Lists all OpenShift versions available to install in the specified location.
     * 
     * The operation returns the installable OpenShift versions as strings.
     * 
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShiftVersionList represents a List of available versions as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenShiftVersionInner> list(String location);

    /**
     * Lists all OpenShift versions available to install in the specified location.
     * 
     * The operation returns the installable OpenShift versions as strings.
     * 
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return openShiftVersionList represents a List of available versions as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OpenShiftVersionInner> list(String location, Context context);
}
