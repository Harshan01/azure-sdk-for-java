// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/**
 * Samples for ManagedClusters ListByResourceGroup.
 */
public final class ManagedClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2024-01-01/examples/
     * ManagedClustersListByResourceGroup.json
     */
    /**
     * Sample code: Get Managed Clusters by Resource Group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getManagedClustersByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.kubernetesClusters().manager().serviceClient().getManagedClusters().listByResourceGroup("rg1",
            com.azure.core.util.Context.NONE);
    }
}
