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

public final class GetTestRunClientMetricsTests extends LoadTestClientTestBase {
    @Test
    @Disabled
    public void testGetTestRunClientMetricsTests() {
        BinaryData body =
                BinaryData.fromString(
                        "{\"endTime\":\"2021-12-05T16:43:49.590Z\",\"errors\":[\"500\"],\"groupByInterval\":\"10s\",\"percentiles\":[\"95\"],\"requestSamplers\":[\"Homepage\"],\"startTime\":\"2021-12-05T16:43:49.590Z\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                testRunClient.getTestRunClientMetricsWithResponse(
                        "12316678-1234-1234-1234-122451189012", body, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"testRunId\":\"12316678-1234-1234-1234-122451189012\",\"timeSeries\":{\"activeUsers\":{\"Homepage\":[{\"timestamp\":\"2021-12-05T16:43:49.320Z\",\"value\":1}]},\"errors\":{\"500\":[{\"timestamp\":\"2021-12-05T16:43:49.320Z\",\"value\":1}]},\"responseTime\":{\"Homepage Pct 95\":[{\"timestamp\":\"2021-12-05T16:43:49.320Z\",\"value\":1}]},\"throughput\":{\"Homepage\":[{\"timestamp\":\"2021-12-05T16:43:49.320Z\",\"value\":2}]}}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
