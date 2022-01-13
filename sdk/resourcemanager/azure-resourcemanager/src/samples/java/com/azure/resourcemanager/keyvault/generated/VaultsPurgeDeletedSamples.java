// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

import com.azure.core.util.Context;

/** Samples for Vaults PurgeDeleted. */
public final class VaultsPurgeDeletedSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2019-09-01/examples/purgeDeletedVault.json
     */
    /**
     * Sample code: Purge a deleted vault.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void purgeADeletedVault(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults().manager().serviceClient().getVaults().purgeDeleted("sample-vault", "westus", Context.NONE);
    }
}
