// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager;
import com.azure.resourcemanager.redhatopenshift.models.OpenShiftVersion;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OpenShiftVersionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"version\":\"ofmx\"},\"id\":\"c\",\"name\":\"jpgd\",\"type\":\"toc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RedHatOpenShiftManager manager = RedHatOpenShiftManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<OpenShiftVersion> response
            = manager.openShiftVersions().list("bkbfkgukdkex", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ofmx", response.iterator().next().version());
    }
}
