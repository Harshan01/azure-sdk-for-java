// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworks Delete. */
public final class VirtualNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkDelete.json
     */
    /**
     * Sample code: Delete virtual network.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteVirtualNetwork(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworks().delete("rg1", "test-vnet", Context.NONE);
    }
}
