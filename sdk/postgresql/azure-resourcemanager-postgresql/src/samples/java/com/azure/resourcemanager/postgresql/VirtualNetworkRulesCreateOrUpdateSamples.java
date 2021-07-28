// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql;

/** Samples for VirtualNetworkRules CreateOrUpdate. */
public final class VirtualNetworkRulesCreateOrUpdateSamples {
    /**
     * Sample code: Create or update a virtual network rule.
     *
     * @param postgreSqlManager Entry point to PostgreSqlManager. The Microsoft Azure management API provides create,
     *     read, update, and delete functionality for Azure PostgreSQL resources including servers, databases, firewall
     *     rules, VNET rules, security alert policies, log files and configurations with new business model.
     */
    public static void createOrUpdateAVirtualNetworkRule(
        com.azure.resourcemanager.postgresql.PostgreSqlManager postgreSqlManager) {
        postgreSqlManager
            .virtualNetworkRules()
            .define("vnet-firewall-rule")
            .withExistingServer("TestGroup", "vnet-test-svr")
            .withVirtualNetworkSubnetId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.Network/virtualNetworks/testvnet/subnets/testsubnet")
            .withIgnoreMissingVnetServiceEndpoint(false)
            .create();
    }
}
