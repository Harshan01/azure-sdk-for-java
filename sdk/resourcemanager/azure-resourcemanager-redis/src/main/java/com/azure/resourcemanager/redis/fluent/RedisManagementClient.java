// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for RedisManagementClient class.
 */
public interface RedisManagementClient {
    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the RedisClient object to access its operations.
     * 
     * @return the RedisClient object.
     */
    RedisClient getRedis();

    /**
     * Gets the FirewallRulesClient object to access its operations.
     * 
     * @return the FirewallRulesClient object.
     */
    FirewallRulesClient getFirewallRules();

    /**
     * Gets the PatchSchedulesClient object to access its operations.
     * 
     * @return the PatchSchedulesClient object.
     */
    PatchSchedulesClient getPatchSchedules();

    /**
     * Gets the LinkedServersClient object to access its operations.
     * 
     * @return the LinkedServersClient object.
     */
    LinkedServersClient getLinkedServers();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the AsyncOperationStatusClient object to access its operations.
     * 
     * @return the AsyncOperationStatusClient object.
     */
    AsyncOperationStatusClient getAsyncOperationStatus();

    /**
     * Gets the AccessPoliciesClient object to access its operations.
     * 
     * @return the AccessPoliciesClient object.
     */
    AccessPoliciesClient getAccessPolicies();

    /**
     * Gets the AccessPolicyAssignmentsClient object to access its operations.
     * 
     * @return the AccessPolicyAssignmentsClient object.
     */
    AccessPolicyAssignmentsClient getAccessPolicyAssignments();
}
