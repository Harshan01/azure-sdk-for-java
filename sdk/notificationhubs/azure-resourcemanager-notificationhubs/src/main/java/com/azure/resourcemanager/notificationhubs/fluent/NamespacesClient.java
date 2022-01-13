// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.notificationhubs.fluent.models.CheckAvailabilityResultInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.NamespaceResourceInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.ResourceListKeysInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleResourceInner;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityParameters;
import com.azure.resourcemanager.notificationhubs.models.NamespaceCreateOrUpdateParameters;
import com.azure.resourcemanager.notificationhubs.models.NamespacePatchParameters;
import com.azure.resourcemanager.notificationhubs.models.PolicykeyResource;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleCreateOrUpdateParameters;

/** An instance of this class provides access to all the operations defined in NamespacesClient. */
public interface NamespacesClient {
    /**
     * Checks the availability of the given service namespace across all Azure subscriptions. This is useful because the
     * domain name is created based on the service namespace name.
     *
     * @param parameters The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a CheckAvailability resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckAvailabilityResultInner checkAvailability(CheckAvailabilityParameters parameters);

    /**
     * Checks the availability of the given service namespace across all Azure subscriptions. This is useful because the
     * domain name is created based on the service namespace name.
     *
     * @param parameters The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a CheckAvailability resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckAvailabilityResultInner> checkAvailabilityWithResponse(
        CheckAvailabilityParameters parameters, Context context);

    /**
     * Creates/Updates a service namespace. Once created, this namespace's resource manifest is immutable. This
     * operation is idempotent.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param parameters Parameters supplied to create a Namespace Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceResourceInner createOrUpdate(
        String resourceGroupName, String namespaceName, NamespaceCreateOrUpdateParameters parameters);

    /**
     * Creates/Updates a service namespace. Once created, this namespace's resource manifest is immutable. This
     * operation is idempotent.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param parameters Parameters supplied to create a Namespace Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NamespaceResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String namespaceName, NamespaceCreateOrUpdateParameters parameters, Context context);

    /**
     * Patches the existing namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param parameters Parameters supplied to patch a Namespace Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceResourceInner patch(String resourceGroupName, String namespaceName, NamespacePatchParameters parameters);

    /**
     * Patches the existing namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param parameters Parameters supplied to patch a Namespace Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NamespaceResourceInner> patchWithResponse(
        String resourceGroupName, String namespaceName, NamespacePatchParameters parameters, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated notificationHubs under the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated notificationHubs under the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated notificationHubs under the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated notificationHubs under the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, Context context);

    /**
     * Returns the description for the specified namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NamespaceResourceInner getByResourceGroup(String resourceGroupName, String namespaceName);

    /**
     * Returns the description for the specified namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NamespaceResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Creates an authorization rule for a namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization Rule Name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace AuthorizationRules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedAccessAuthorizationRuleResourceInner createOrUpdateAuthorizationRule(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        SharedAccessAuthorizationRuleCreateOrUpdateParameters parameters);

    /**
     * Creates an authorization rule for a namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization Rule Name.
     * @param parameters The shared access authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a Namespace AuthorizationRules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedAccessAuthorizationRuleResourceInner> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        SharedAccessAuthorizationRuleCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization Rule Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization Rule Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Gets an authorization rule for a namespace by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a namespace by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedAccessAuthorizationRuleResourceInner getAuthorizationRule(
        String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a namespace by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a namespace by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedAccessAuthorizationRuleResourceInner> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Lists the available namespaces within a resourceGroup.
     *
     * @param resourceGroupName The name of the resource group. If resourceGroupName value is null the method lists all
     *     the namespaces within subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamespaceResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the available namespaces within a resourceGroup.
     *
     * @param resourceGroupName The name of the resource group. If resourceGroupName value is null the method lists all
     *     the namespaces within subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamespaceResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the available namespaces within the subscription irrespective of the resourceGroups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamespaceResourceInner> list();

    /**
     * Lists all the available namespaces within the subscription irrespective of the resourceGroups.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NamespaceResourceInner> list(Context context);

    /**
     * Gets the authorization rules for a namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization rules for a namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedAccessAuthorizationRuleResourceInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName);

    /**
     * Gets the authorization rules for a namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization rules for a namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedAccessAuthorizationRuleResourceInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, Context context);

    /**
     * Gets the Primary and Secondary ConnectionStrings to the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The connection string of the namespace for the specified authorizationRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Primary and Secondary ConnectionStrings to the namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceListKeysInner listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the Primary and Secondary ConnectionStrings to the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The connection string of the namespace for the specified authorizationRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Primary and Secondary ConnectionStrings to the namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceListKeysInner> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context);

    /**
     * Regenerates the Primary/Secondary Keys to the Namespace Authorization Rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The connection string of the namespace for the specified authorizationRule.
     * @param parameters Parameters supplied to regenerate the Namespace Authorization Rule Key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/NotificationHub Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceListKeysInner regenerateKeys(
        String resourceGroupName, String namespaceName, String authorizationRuleName, PolicykeyResource parameters);

    /**
     * Regenerates the Primary/Secondary Keys to the Namespace Authorization Rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The connection string of the namespace for the specified authorizationRule.
     * @param parameters Parameters supplied to regenerate the Namespace Authorization Rule Key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/NotificationHub Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourceListKeysInner> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        PolicykeyResource parameters,
        Context context);
}
