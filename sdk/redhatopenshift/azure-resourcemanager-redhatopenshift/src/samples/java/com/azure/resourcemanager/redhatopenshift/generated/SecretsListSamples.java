// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

/**
 * Samples for Secrets List.
 */
public final class SecretsListSamples {
    /*
     * x-ms-original-file:
     * specification/redhatopenshift/resource-manager/Microsoft.RedHatOpenShift/openshiftclusters/stable/2023-11-22/
     * examples/Secrets_List.json
     */
    /**
     * Sample code: Lists Secrets that belong to that Azure Red Hat OpenShift Cluster.
     * 
     * @param manager Entry point to RedHatOpenShiftManager.
     */
    public static void listsSecretsThatBelongToThatAzureRedHatOpenShiftCluster(
        com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager manager) {
        manager.secrets().list("resourceGroup", "resourceName", com.azure.core.util.Context.NONE);
    }
}
