// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

/**
 * Samples for OpenShiftClusters GetByResourceGroup.
 */
public final class OpenShiftClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/redhatopenshift/resource-manager/Microsoft.RedHatOpenShift/openshiftclusters/stable/2023-11-22/
     * examples/OpenShiftClusters_Get.json
     */
    /**
     * Sample code: Gets a OpenShift cluster with the specified subscription, resource group and resource name.
     * 
     * @param manager Entry point to RedHatOpenShiftManager.
     */
    public static void getsAOpenShiftClusterWithTheSpecifiedSubscriptionResourceGroupAndResourceName(
        com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager manager) {
        manager.openShiftClusters()
            .getByResourceGroupWithResponse("resourceGroup", "resourceName", com.azure.core.util.Context.NONE);
    }
}
