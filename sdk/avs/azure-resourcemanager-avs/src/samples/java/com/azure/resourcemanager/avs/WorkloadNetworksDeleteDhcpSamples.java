// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks DeleteDhcp. */
public final class WorkloadNetworksDeleteDhcpSamples {
    /**
     * Sample code: WorkloadNetworks_DeleteDhcp.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksDeleteDhcp(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().deleteDhcp("group1", "cloud1", "dhcp1", Context.NONE);
    }
}
