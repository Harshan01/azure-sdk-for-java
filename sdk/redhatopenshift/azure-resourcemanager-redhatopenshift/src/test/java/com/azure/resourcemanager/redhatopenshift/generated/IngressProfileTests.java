// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redhatopenshift.models.IngressProfile;
import com.azure.resourcemanager.redhatopenshift.models.Visibility;
import org.junit.jupiter.api.Assertions;

public final class IngressProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IngressProfile model
            = BinaryData.fromString("{\"name\":\"kvwrwjfeu\",\"visibility\":\"Private\",\"ip\":\"tjelt\"}")
                .toObject(IngressProfile.class);
        Assertions.assertEquals("kvwrwjfeu", model.name());
        Assertions.assertEquals(Visibility.PRIVATE, model.visibility());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IngressProfile model = new IngressProfile().withName("kvwrwjfeu").withVisibility(Visibility.PRIVATE);
        model = BinaryData.fromObject(model).toObject(IngressProfile.class);
        Assertions.assertEquals("kvwrwjfeu", model.name());
        Assertions.assertEquals(Visibility.PRIVATE, model.visibility());
    }
}
