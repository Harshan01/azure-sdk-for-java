// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.developer.loadtesting.AppComponentClient;
import com.azure.developer.loadtesting.AppComponentClientBuilder;
import com.azure.developer.loadtesting.ServerMetricsClient;
import com.azure.developer.loadtesting.ServerMetricsClientBuilder;
import com.azure.developer.loadtesting.TestClient;
import com.azure.developer.loadtesting.TestClientBuilder;
import com.azure.developer.loadtesting.TestRunClient;
import com.azure.developer.loadtesting.TestRunClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

class LoadTestClientTestBase extends TestBase {
    protected AppComponentClient appComponentClient;

    protected ServerMetricsClient serverMetricsClient;

    protected TestClient testClient;

    protected TestRunClient testRunClient;

    @Override
    protected void beforeTest() {
        AppComponentClientBuilder appComponentClientbuilder =
                new AppComponentClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            appComponentClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            appComponentClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            appComponentClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        appComponentClient = appComponentClientbuilder.buildClient();

        ServerMetricsClientBuilder serverMetricsClientbuilder =
                new ServerMetricsClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            serverMetricsClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            serverMetricsClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            serverMetricsClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        serverMetricsClient = serverMetricsClientbuilder.buildClient();

        TestClientBuilder testClientbuilder =
                new TestClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            testClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            testClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            testClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        testClient = testClientbuilder.buildClient();

        TestRunClientBuilder testRunClientbuilder =
                new TestRunClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            testRunClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            testRunClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            testRunClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        testRunClient = testRunClientbuilder.buildClient();
    }
}
