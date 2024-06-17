// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.Slice;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SlicesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"snssai\":{\"sst\":1082836943,\"sd\":\"xcxscvslxlh\"},\"description\":\"vkrmukmyjmkx\"},\"location\":\"tcsloj\",\"tags\":{\"qtoqxjhqxcsq\":\"id\"},\"id\":\"tkbtnqlrngl\",\"name\":\"mbiipsnawwlqk\",\"type\":\"nxhhl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MobileNetworkManager manager = MobileNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Slice response = manager.slices()
            .getWithResponse("mwynefxexlfciatx", "jrr", "kmdskjhhxd", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("tcsloj", response.location());
        Assertions.assertEquals("id", response.tags().get("qtoqxjhqxcsq"));
        Assertions.assertEquals(1082836943, response.snssai().sst());
        Assertions.assertEquals("xcxscvslxlh", response.snssai().sd());
        Assertions.assertEquals("vkrmukmyjmkx", response.description());
    }
}
