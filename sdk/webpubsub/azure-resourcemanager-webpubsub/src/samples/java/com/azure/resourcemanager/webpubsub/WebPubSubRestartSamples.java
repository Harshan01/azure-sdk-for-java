// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.util.Context;

/** Samples for WebPubSub Restart. */
public final class WebPubSubRestartSamples {
    /**
     * Sample code: WebPubSub_Restart.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void webPubSubRestart(com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager.webPubSubs().restart("myResourceGroup", "myWebPubSubService", Context.NONE);
    }
}
