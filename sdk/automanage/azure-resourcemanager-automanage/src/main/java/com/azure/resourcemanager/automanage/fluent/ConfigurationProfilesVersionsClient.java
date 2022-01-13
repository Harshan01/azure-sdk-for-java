// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileInner;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileUpdate;

/** An instance of this class provides access to all the operations defined in ConfigurationProfilesVersionsClient. */
public interface ConfigurationProfilesVersionsClient {
    /**
     * Creates a configuration profile version.
     *
     * @param configurationProfileName Name of the configuration profile.
     * @param versionName The configuration profile version name.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to create or update configuration profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the configuration profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationProfileInner createOrUpdate(
        String configurationProfileName,
        String versionName,
        String resourceGroupName,
        ConfigurationProfileInner parameters);

    /**
     * Creates a configuration profile version.
     *
     * @param configurationProfileName Name of the configuration profile.
     * @param versionName The configuration profile version name.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to create or update configuration profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the configuration profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationProfileInner> createOrUpdateWithResponse(
        String configurationProfileName,
        String versionName,
        String resourceGroupName,
        ConfigurationProfileInner parameters,
        Context context);

    /**
     * Get information about a configuration profile version.
     *
     * @param configurationProfileName The configuration profile name.
     * @param versionName The configuration profile version name.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration profile version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationProfileInner get(String configurationProfileName, String versionName, String resourceGroupName);

    /**
     * Get information about a configuration profile version.
     *
     * @param configurationProfileName The configuration profile name.
     * @param versionName The configuration profile version name.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a configuration profile version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationProfileInner> getWithResponse(
        String configurationProfileName, String versionName, String resourceGroupName, Context context);

    /**
     * Delete a configuration profile version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configurationProfileName Name of the configuration profile.
     * @param versionName The configuration profile version name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String configurationProfileName, String versionName);

    /**
     * Delete a configuration profile version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param configurationProfileName Name of the configuration profile.
     * @param versionName The configuration profile version name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String configurationProfileName, String versionName, Context context);

    /**
     * Updates a configuration profile version.
     *
     * @param configurationProfileName Name of the configuration profile.
     * @param versionName The configuration profile version name.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to update configuration profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the configuration profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConfigurationProfileInner update(
        String configurationProfileName,
        String versionName,
        String resourceGroupName,
        ConfigurationProfileUpdate parameters);

    /**
     * Updates a configuration profile version.
     *
     * @param configurationProfileName Name of the configuration profile.
     * @param versionName The configuration profile version name.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters Parameters supplied to update configuration profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the configuration profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConfigurationProfileInner> updateWithResponse(
        String configurationProfileName,
        String versionName,
        String resourceGroupName,
        ConfigurationProfileUpdate parameters,
        Context context);

    /**
     * Retrieve a list of configuration profile version for a configuration profile.
     *
     * @param configurationProfileName Name of the configuration profile.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list configuration profile operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationProfileInner> listChildResources(
        String configurationProfileName, String resourceGroupName);

    /**
     * Retrieve a list of configuration profile version for a configuration profile.
     *
     * @param configurationProfileName Name of the configuration profile.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the list configuration profile operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConfigurationProfileInner> listChildResources(
        String configurationProfileName, String resourceGroupName, Context context);
}
