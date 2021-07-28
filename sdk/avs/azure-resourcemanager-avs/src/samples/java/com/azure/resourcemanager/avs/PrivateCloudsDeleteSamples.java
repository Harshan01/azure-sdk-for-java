// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for PrivateClouds Delete. */
public final class PrivateCloudsDeleteSamples {
    /**
     * Sample code: PrivateClouds_Delete.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void privateCloudsDelete(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.privateClouds().delete("group1", "cloud1", Context.NONE);
    }
}
