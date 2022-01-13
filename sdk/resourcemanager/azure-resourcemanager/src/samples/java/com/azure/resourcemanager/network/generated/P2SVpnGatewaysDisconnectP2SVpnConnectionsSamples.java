// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.P2SVpnConnectionRequest;
import java.util.Arrays;

/** Samples for P2SVpnGateways DisconnectP2SVpnConnections. */
public final class P2SVpnGatewaysDisconnectP2SVpnConnectionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/P2sVpnGatewaysDisconnectP2sVpnConnections.json
     */
    /**
     * Sample code: Disconnect VpnConnections from P2sVpn Gateway.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void disconnectVpnConnectionsFromP2sVpnGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getP2SVpnGateways()
            .disconnectP2SVpnConnections(
                "p2s-vpn-gateway-test",
                "p2svpngateway",
                new P2SVpnConnectionRequest().withVpnConnectionIds(Arrays.asList("vpnconnId1", "vpnconnId2")),
                Context.NONE);
    }
}
