// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redhatopenshift.models.SyncIdentityProviderUpdate;
import org.junit.jupiter.api.Assertions;

public final class SyncIdentityProviderUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SyncIdentityProviderUpdate model = BinaryData.fromString("{\"properties\":{\"resources\":\"mmajtjaodx\"}}")
            .toObject(SyncIdentityProviderUpdate.class);
        Assertions.assertEquals("mmajtjaodx", model.resources());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SyncIdentityProviderUpdate model = new SyncIdentityProviderUpdate().withResources("mmajtjaodx");
        model = BinaryData.fromObject(model).toObject(SyncIdentityProviderUpdate.class);
        Assertions.assertEquals("mmajtjaodx", model.resources());
    }
}
