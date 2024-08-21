// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redhatopenshift.fluent.models.SyncSetInner;
import org.junit.jupiter.api.Assertions;

public final class SyncSetInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SyncSetInner model = BinaryData.fromString(
            "{\"properties\":{\"resources\":\"newmdwzjeiachbo\"},\"id\":\"flnrosfqpteehzz\",\"name\":\"ypyqrimzinp\",\"type\":\"swjdkirso\"}")
            .toObject(SyncSetInner.class);
        Assertions.assertEquals("newmdwzjeiachbo", model.resources());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SyncSetInner model = new SyncSetInner().withResources("newmdwzjeiachbo");
        model = BinaryData.fromObject(model).toObject(SyncSetInner.class);
        Assertions.assertEquals("newmdwzjeiachbo", model.resources());
    }
}
