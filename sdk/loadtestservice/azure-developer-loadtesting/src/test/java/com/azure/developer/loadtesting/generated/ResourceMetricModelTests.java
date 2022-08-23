// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.developer.loadtesting.implementation.models.ResourceMetricModel;
import com.azure.developer.loadtesting.implementation.models.ServerMetricName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceMetricModelTests {
    @Test
    public void testDeserialize() {
        ResourceMetricModel model =
                BinaryData.fromString(
                                "{\"id\":\"qrglssainqpjwn\",\"resourceId\":\"lljfmppeeb\",\"metricnamespace\":\"mgxsab\",\"displayDescription\":\"qduujitcjczdz\",\"name\":{\"value\":\"vndhkrwpdapp\",\"localizedValue\":\"sbdkvwr\"},\"aggregation\":\"jfeusnh\",\"unit\":\"je\",\"resourceType\":\"tmrldhugjzzdatq\"}")
                        .toObject(ResourceMetricModel.class);
        Assertions.assertEquals("lljfmppeeb", model.getResourceId());
        Assertions.assertEquals("mgxsab", model.getMetricnamespace());
        Assertions.assertEquals("qduujitcjczdz", model.getDisplayDescription());
        Assertions.assertEquals("vndhkrwpdapp", model.getName().getValue());
        Assertions.assertEquals("sbdkvwr", model.getName().getLocalizedValue());
        Assertions.assertEquals("jfeusnh", model.getAggregation());
        Assertions.assertEquals("je", model.getUnit());
        Assertions.assertEquals("tmrldhugjzzdatq", model.getResourceType());
    }

    @Test
    public void testSerialize() {
        ResourceMetricModel model =
                new ResourceMetricModel(
                                "lljfmppeeb",
                                "mgxsab",
                                new ServerMetricName("vndhkrwpdapp", "sbdkvwr"),
                                "jfeusnh",
                                "tmrldhugjzzdatq")
                        .setDisplayDescription("qduujitcjczdz")
                        .setUnit("je");
        model = BinaryData.fromObject(model).toObject(ResourceMetricModel.class);
        Assertions.assertEquals("lljfmppeeb", model.getResourceId());
        Assertions.assertEquals("mgxsab", model.getMetricnamespace());
        Assertions.assertEquals("qduujitcjczdz", model.getDisplayDescription());
        Assertions.assertEquals("vndhkrwpdapp", model.getName().getValue());
        Assertions.assertEquals("sbdkvwr", model.getName().getLocalizedValue());
        Assertions.assertEquals("jfeusnh", model.getAggregation());
        Assertions.assertEquals("je", model.getUnit());
        Assertions.assertEquals("tmrldhugjzzdatq", model.getResourceType());
    }
}
