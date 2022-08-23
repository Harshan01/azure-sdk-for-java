// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Configuration;
import com.azure.developer.loadtesting.AppComponentClient;
import com.azure.developer.loadtesting.AppComponentClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DeleteAppComponent {
    public static void main(String[] args) {
        AppComponentClient appComponentClient =
                new AppComponentClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                        .buildClient();
        // BEGIN:com.azure.developer.loadtesting.generated.appcomponentdeleteappcomponent.deleteappcomponent
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                appComponentClient.deleteAppComponentWithResponse(
                        "ee843bd9-a6d4-4364-a45c-427a03c39fa7", requestOptions);
        // END:com.azure.developer.loadtesting.generated.appcomponentdeleteappcomponent.deleteappcomponent
    }
}
