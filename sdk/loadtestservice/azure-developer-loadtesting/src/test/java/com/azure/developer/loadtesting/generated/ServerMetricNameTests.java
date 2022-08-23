// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.developer.loadtesting.implementation.models.ServerMetricName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ServerMetricNameTests {
    @Test
    public void testDeserialize() {
        ServerMetricName model =
                BinaryData.fromString("{\"value\":\"hocdgeab\",\"localizedValue\":\"gphuticndvka\"}")
                        .toObject(ServerMetricName.class);
        Assertions.assertEquals("hocdgeab", model.getValue());
        Assertions.assertEquals("gphuticndvka", model.getLocalizedValue());
    }

    @Test
    public void testSerialize() {
        ServerMetricName model = new ServerMetricName("hocdgeab", "gphuticndvka");
        model = BinaryData.fromObject(model).toObject(ServerMetricName.class);
        Assertions.assertEquals("hocdgeab", model.getValue());
        Assertions.assertEquals("gphuticndvka", model.getLocalizedValue());
    }
}
