// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr;

import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.models.KeyType;
import com.azure.resourcemanager.signalr.models.RegenerateKeyParameters;

/** Samples for SignalR RegenerateKey. */
public final class SignalRRegenerateKeySamples {
    /**
     * Sample code: SignalR_RegenerateKey.
     *
     * @param signalRManager Entry point to SignalRManager. REST API for Azure SignalR Service.
     */
    public static void signalRRegenerateKey(com.azure.resourcemanager.signalr.SignalRManager signalRManager) {
        signalRManager
            .signalRs()
            .regenerateKey(
                "myResourceGroup",
                "mySignalRService",
                new RegenerateKeyParameters().withKeyType(KeyType.PRIMARY),
                Context.NONE);
    }
}
