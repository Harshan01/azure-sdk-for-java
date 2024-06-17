// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.PdnType;
import com.azure.resourcemanager.mobilenetwork.models.Snssai;
import com.azure.resourcemanager.mobilenetwork.models.UeIpAddress;
import com.azure.resourcemanager.mobilenetwork.models.UeQosFlow;
import com.azure.resourcemanager.mobilenetwork.models.UeSessionInfo5G;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UeSessionInfo5GTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UeSessionInfo5G model = BinaryData.fromString(
            "{\"pduSessionId\":1750029451,\"dnn\":\"sihclafzvaylp\",\"snssai\":{\"sst\":207185331,\"sd\":\"qqwzt\"},\"ueIpAddress\":{\"ipV4Addr\":\"w\"},\"pdnType\":\"IPV4\",\"ambr\":{\"uplink\":\"chcxwaxfewzj\",\"downlink\":\"jexfdeqvhp\"},\"qosFlow\":[{\"qfi\":1297569440,\"fiveqi\":242017566,\"mbr\":{\"uplink\":\"shk\",\"downlink\":\"ffmbmxzjrg\"},\"gbr\":{\"uplink\":\"wpgj\",\"downlink\":\"snptfujgicgaao\"}},{\"qfi\":2031389525,\"fiveqi\":173165571,\"mbr\":{\"uplink\":\"aqutdewemxswvruu\",\"downlink\":\"zzjgehkfki\"},\"gbr\":{\"uplink\":\"tixo\",\"downlink\":\"ffqyinlj\"}},{\"qfi\":980930736,\"fiveqi\":667642909,\"mbr\":{\"uplink\":\"whixmonstsh\",\"downlink\":\"yxgvelfcld\"},\"gbr\":{\"uplink\":\"cb\",\"downlink\":\"rds\"}},{\"qfi\":759362490,\"fiveqi\":1544209565,\"mbr\":{\"uplink\":\"o\",\"downlink\":\"iegstm\"},\"gbr\":{\"uplink\":\"nwjizcilnghgshej\",\"downlink\":\"tbxqmuluxlxq\"}}]}")
            .toObject(UeSessionInfo5G.class);
        Assertions.assertEquals(1750029451, model.pduSessionId());
        Assertions.assertEquals("sihclafzvaylp", model.dnn());
        Assertions.assertEquals(207185331, model.snssai().sst());
        Assertions.assertEquals("qqwzt", model.snssai().sd());
        Assertions.assertEquals("w", model.ueIpAddress().ipV4Addr());
        Assertions.assertEquals(PdnType.IPV4, model.pdnType());
        Assertions.assertEquals("chcxwaxfewzj", model.ambr().uplink());
        Assertions.assertEquals("jexfdeqvhp", model.ambr().downlink());
        Assertions.assertEquals(1297569440, model.qosFlow().get(0).qfi());
        Assertions.assertEquals(242017566, model.qosFlow().get(0).fiveqi());
        Assertions.assertEquals("shk", model.qosFlow().get(0).mbr().uplink());
        Assertions.assertEquals("ffmbmxzjrg", model.qosFlow().get(0).mbr().downlink());
        Assertions.assertEquals("wpgj", model.qosFlow().get(0).gbr().uplink());
        Assertions.assertEquals("snptfujgicgaao", model.qosFlow().get(0).gbr().downlink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UeSessionInfo5G model = new UeSessionInfo5G().withPduSessionId(1750029451)
            .withDnn("sihclafzvaylp")
            .withSnssai(new Snssai().withSst(207185331).withSd("qqwzt"))
            .withUeIpAddress(new UeIpAddress().withIpV4Addr("w"))
            .withPdnType(PdnType.IPV4)
            .withAmbr(new Ambr().withUplink("chcxwaxfewzj").withDownlink("jexfdeqvhp"))
            .withQosFlow(Arrays.asList(
                new UeQosFlow().withQfi(1297569440)
                    .withFiveqi(242017566)
                    .withMbr(new Ambr().withUplink("shk").withDownlink("ffmbmxzjrg"))
                    .withGbr(new Ambr().withUplink("wpgj").withDownlink("snptfujgicgaao")),
                new UeQosFlow().withQfi(2031389525)
                    .withFiveqi(173165571)
                    .withMbr(new Ambr().withUplink("aqutdewemxswvruu").withDownlink("zzjgehkfki"))
                    .withGbr(new Ambr().withUplink("tixo").withDownlink("ffqyinlj")),
                new UeQosFlow().withQfi(980930736)
                    .withFiveqi(667642909)
                    .withMbr(new Ambr().withUplink("whixmonstsh").withDownlink("yxgvelfcld"))
                    .withGbr(new Ambr().withUplink("cb").withDownlink("rds")),
                new UeQosFlow().withQfi(759362490)
                    .withFiveqi(1544209565)
                    .withMbr(new Ambr().withUplink("o").withDownlink("iegstm"))
                    .withGbr(new Ambr().withUplink("nwjizcilnghgshej").withDownlink("tbxqmuluxlxq"))));
        model = BinaryData.fromObject(model).toObject(UeSessionInfo5G.class);
        Assertions.assertEquals(1750029451, model.pduSessionId());
        Assertions.assertEquals("sihclafzvaylp", model.dnn());
        Assertions.assertEquals(207185331, model.snssai().sst());
        Assertions.assertEquals("qqwzt", model.snssai().sd());
        Assertions.assertEquals("w", model.ueIpAddress().ipV4Addr());
        Assertions.assertEquals(PdnType.IPV4, model.pdnType());
        Assertions.assertEquals("chcxwaxfewzj", model.ambr().uplink());
        Assertions.assertEquals("jexfdeqvhp", model.ambr().downlink());
        Assertions.assertEquals(1297569440, model.qosFlow().get(0).qfi());
        Assertions.assertEquals(242017566, model.qosFlow().get(0).fiveqi());
        Assertions.assertEquals("shk", model.qosFlow().get(0).mbr().uplink());
        Assertions.assertEquals("ffmbmxzjrg", model.qosFlow().get(0).mbr().downlink());
        Assertions.assertEquals("wpgj", model.qosFlow().get(0).gbr().uplink());
        Assertions.assertEquals("snptfujgicgaao", model.qosFlow().get(0).gbr().downlink());
    }
}
