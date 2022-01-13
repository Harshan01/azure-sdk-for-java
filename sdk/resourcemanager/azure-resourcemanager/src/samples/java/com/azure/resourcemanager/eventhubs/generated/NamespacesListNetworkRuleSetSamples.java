// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

import com.azure.core.util.Context;

/** Samples for Namespaces ListNetworkRuleSet. */
public final class NamespacesListNetworkRuleSetSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/stable/2021-11-01/examples/NameSpaces/VirtualNetworkRule/EHNetworkRuleSetList.json
     */
    /**
     * Sample code: NameSpaceNetworkRuleSetList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpaceNetworkRuleSetList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .eventHubs()
            .manager()
            .serviceClient()
            .getNamespaces()
            .listNetworkRuleSetWithResponse("ResourceGroup", "sdk-Namespace-6019", Context.NONE);
    }
}
