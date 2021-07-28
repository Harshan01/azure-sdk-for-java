// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks ListGateways. */
public final class WorkloadNetworksListGatewaysSamples {
    /**
     * Sample code: WorkloadNetworks_ListGateways.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksListGateways(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().listGateways("group1", "cloud1", Context.NONE);
    }
}
