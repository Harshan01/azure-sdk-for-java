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
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PacketCoreControlPlanesRollbackMockTests {
    @Test
    public void testRollback() throws Exception {
        String responseStr
            = "{\"id\":\"qagnepzwakl\",\"name\":\"sbq\",\"status\":\"qagwwrxaomz\",\"resourceId\":\"glrrczez\",\"startTime\":\"2021-08-08T05:26:55Z\",\"endTime\":\"2021-07-10T01:34:25Z\",\"percentComplete\":55.682278161179354,\"properties\":\"datahqo\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MobileNetworkManager manager = MobileNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AsyncOperationStatus response
            = manager.packetCoreControlPlanes().rollback("s", "bxrblmliowxihspn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qagnepzwakl", response.id());
        Assertions.assertEquals("sbq", response.name());
        Assertions.assertEquals("qagwwrxaomz", response.status());
        Assertions.assertEquals("glrrczez", response.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-08T05:26:55Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-10T01:34:25Z"), response.endTime());
        Assertions.assertEquals(55.682278161179354D, response.percentComplete());
    }
}
