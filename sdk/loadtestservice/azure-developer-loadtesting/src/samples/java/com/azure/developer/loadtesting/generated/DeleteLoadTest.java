// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Configuration;
import com.azure.developer.loadtesting.TestClient;
import com.azure.developer.loadtesting.TestClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DeleteLoadTest {
    public static void main(String[] args) {
        TestClient testClient =
                new TestClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                        .buildClient();
        // BEGIN:com.azure.developer.loadtesting.generated.testdeleteloadtest.deleteloadtest
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                testClient.deleteLoadTestWithResponse("12345678-1234-1234-1234-123456789012", requestOptions);
        // END:com.azure.developer.loadtesting.generated.testdeleteloadtest.deleteloadtest
    }
}
