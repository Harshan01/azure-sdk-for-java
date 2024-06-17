// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.UeInfoInner;
import com.azure.resourcemanager.mobilenetwork.models.DnnIpPair;
import com.azure.resourcemanager.mobilenetwork.models.RatType;
import com.azure.resourcemanager.mobilenetwork.models.UeInfoPropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.UeIpAddress;
import com.azure.resourcemanager.mobilenetwork.models.UeState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UeInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UeInfoInner model = BinaryData.fromString(
            "{\"properties\":{\"ratType\":\"4G\",\"ueState\":\"Deregistered\",\"ueIpAddresses\":[{\"dnn\":\"yhbxcudchxgs\",\"ueIpAddress\":{\"ipV4Addr\":\"ldforobwj\"}}],\"lastReadAt\":\"2021-02-10T16:46:43Z\"},\"id\":\"bfhfovvacqp\",\"name\":\"tuodxeszabbelaw\",\"type\":\"muaslzkw\"}")
            .toObject(UeInfoInner.class);
        Assertions.assertEquals(RatType.FOURG, model.properties().ratType());
        Assertions.assertEquals(UeState.DEREGISTERED, model.properties().ueState());
        Assertions.assertEquals("yhbxcudchxgs", model.properties().ueIpAddresses().get(0).dnn());
        Assertions.assertEquals("ldforobwj", model.properties().ueIpAddresses().get(0).ueIpAddress().ipV4Addr());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-10T16:46:43Z"), model.properties().lastReadAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UeInfoInner model = new UeInfoInner().withProperties(new UeInfoPropertiesFormat().withRatType(RatType.FOURG)
            .withUeState(UeState.DEREGISTERED)
            .withUeIpAddresses(Arrays.asList(
                new DnnIpPair().withDnn("yhbxcudchxgs").withUeIpAddress(new UeIpAddress().withIpV4Addr("ldforobwj"))))
            .withLastReadAt(OffsetDateTime.parse("2021-02-10T16:46:43Z")));
        model = BinaryData.fromObject(model).toObject(UeInfoInner.class);
        Assertions.assertEquals(RatType.FOURG, model.properties().ratType());
        Assertions.assertEquals(UeState.DEREGISTERED, model.properties().ueState());
        Assertions.assertEquals("yhbxcudchxgs", model.properties().ueIpAddresses().get(0).dnn());
        Assertions.assertEquals("ldforobwj", model.properties().ueIpAddresses().get(0).ueIpAddress().ipV4Addr());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-10T16:46:43Z"), model.properties().lastReadAt());
    }
}
