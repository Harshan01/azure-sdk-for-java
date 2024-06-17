// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.AzureStackEdgeDeviceResourceId;
import org.junit.jupiter.api.Assertions;

public final class AzureStackEdgeDeviceResourceIdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureStackEdgeDeviceResourceId model
            = BinaryData.fromString("{\"id\":\"sowzxcugi\"}").toObject(AzureStackEdgeDeviceResourceId.class);
        Assertions.assertEquals("sowzxcugi", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureStackEdgeDeviceResourceId model = new AzureStackEdgeDeviceResourceId().withId("sowzxcugi");
        model = BinaryData.fromObject(model).toObject(AzureStackEdgeDeviceResourceId.class);
        Assertions.assertEquals("sowzxcugi", model.id());
    }
}
