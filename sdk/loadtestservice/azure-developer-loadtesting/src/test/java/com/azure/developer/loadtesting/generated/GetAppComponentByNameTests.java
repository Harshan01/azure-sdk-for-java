// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class GetAppComponentByNameTests extends LoadTestClientTestBase {
    @Test
    @Disabled
    public void testGetAppComponentByNameTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                appComponentClient.getAppComponentByNameWithResponse(
                        "ee843bd9-a6d4-4364-a45c-427a03c39fa7", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"ee843bd9-a6d4-4364-a45c-427a03c39fa7\",\"resourceId\":\"/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplerg/providers/microsoft.loadtestservice/sampleresourcetype/sampleresourcename\",\"testId\":\"12345678-1234-1234-1234-123456789012\",\"testRunId\":\"12316678-1234-1234-1234-122451189012\",\"value\":{\"/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplerg/providers/microsoft.insights/components/appcomponentresource\":{\"displayName\":\"Performance_LoadTest_Insights\",\"kind\":\"web\",\"resourceGroup\":\"samplerg\",\"resourceId\":\"/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplerg/providers/microsoft.insights/components/appcomponentresource\",\"resourceName\":\"appcomponentresource\",\"resourceType\":\"microsoft.insights/components\",\"subscriptionId\":\"00000000-0000-0000-0000-000000000000\"}}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
