// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redhatopenshift.fluent.models.SyncSetProperties;
import org.junit.jupiter.api.Assertions;

public final class SyncSetPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SyncSetProperties model
            = BinaryData.fromString("{\"resources\":\"qxhcrmn\"}").toObject(SyncSetProperties.class);
        Assertions.assertEquals("qxhcrmn", model.resources());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SyncSetProperties model = new SyncSetProperties().withResources("qxhcrmn");
        model = BinaryData.fromObject(model).toObject(SyncSetProperties.class);
        Assertions.assertEquals("qxhcrmn", model.resources());
    }
}
