// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolution List. */
public final class IotSecuritySolutionListSamples {
    /**
     * Sample code: List IoT Security solutions by subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void listIoTSecuritySolutionsBySubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotSecuritySolutions().list(null, Context.NONE);
    }

    /**
     * Sample code: List IoT Security solutions by IoT Hub.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void listIoTSecuritySolutionsByIoTHub(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotSecuritySolutions()
            .list(
                "properties.iotHubs/any(i eq"
                    + " \"/subscriptions/075423e9-7d33-4166-8bdf-3920b04e3735/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/FirstIotHub\")",
                Context.NONE);
    }
}
