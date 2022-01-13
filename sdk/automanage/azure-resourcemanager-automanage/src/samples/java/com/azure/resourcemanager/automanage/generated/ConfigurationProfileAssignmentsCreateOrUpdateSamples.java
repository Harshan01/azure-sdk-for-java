// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.resourcemanager.automanage.models.ConfigurationProfileAssignmentProperties;

/** Samples for ConfigurationProfileAssignments CreateOrUpdate. */
public final class ConfigurationProfileAssignmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/createOrUpdateConfigurationProfileAssignment.json
     */
    /**
     * Sample code: Create or update configuration profile assignment.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void createOrUpdateConfigurationProfileAssignment(
        com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager
            .configurationProfileAssignments()
            .define("default")
            .withExistingVirtualMachine("myResourceGroupName", "myVMName")
            .withProperties(
                new ConfigurationProfileAssignmentProperties()
                    .withConfigurationProfile(
                        "/providers/Microsoft.Automanage/bestPractices/AzureBestPracticesProduction"))
            .create();
    }
}
