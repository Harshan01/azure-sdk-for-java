// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for P2SVpnGateways Reset. */
public final class P2SVpnGatewaysResetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/P2SVpnGatewayReset.json
     */
    /**
     * Sample code: ResetP2SVpnGateway.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resetP2SVpnGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getP2SVpnGateways().reset("rg1", "p2sVpnGateway1", Context.NONE);
    }
}
