// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.developer.loadtesting;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.developer.loadtesting.implementation.ServerMetricsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous LoadTestClient type. */
@ServiceClient(builder = ServerMetricsClientBuilder.class, isAsync = true)
public final class ServerMetricsAsyncClient {

    @Generated private final ServerMetricsImpl serviceClient;

    /**
     * Initializes an instance of ServerMetricsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ServerMetricsAsyncClient(ServerMetricsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Configure server metrics for a test or test run.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     testId: String (Optional)
     *     testRunId: String (Optional)
     *     metrics (Optional): {
     *         String (Optional): {
     *             id: String (Optional)
     *             resourceId: String (Required)
     *             metricnamespace: String (Required)
     *             displayDescription: String (Optional)
     *             name (Required): {
     *                 value: String (Required)
     *                 localizedValue: String (Required)
     *             }
     *             aggregation: String (Required)
     *             unit: String (Optional)
     *             resourceType: String (Required)
     *         }
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     testId: String (Optional)
     *     testRunId: String (Optional)
     *     metrics (Optional): {
     *         String (Optional): {
     *             id: String (Optional)
     *             resourceId: String (Required)
     *             metricnamespace: String (Required)
     *             displayDescription: String (Optional)
     *             name (Required): {
     *                 value: String (Required)
     *                 localizedValue: String (Required)
     *             }
     *             aggregation: String (Required)
     *             unit: String (Optional)
     *             resourceType: String (Required)
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param name Unique name for server metrics, must be a valid URL character ^[a-z0-9_-]*$.
     * @param body Server metrics configuration model.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return server metrics config model along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateServerMetricsConfigWithResponse(
            String name, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateServerMetricsConfigWithResponseAsync(name, body, requestOptions);
    }

    /**
     * Get server metrics configuration by its name.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     testId: String (Optional)
     *     testRunId: String (Optional)
     *     metrics (Optional): {
     *         String (Optional): {
     *             id: String (Optional)
     *             resourceId: String (Required)
     *             metricnamespace: String (Required)
     *             displayDescription: String (Optional)
     *             name (Required): {
     *                 value: String (Required)
     *                 localizedValue: String (Required)
     *             }
     *             aggregation: String (Required)
     *             unit: String (Optional)
     *             resourceType: String (Required)
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param name Unique name for server metrics, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return server metrics configuration by its name along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getServerMetricsByNameWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.getServerMetricsByNameWithResponseAsync(name, requestOptions);
    }

    /**
     * Delete server metrics configuration by its name.
     *
     * @param name Unique name for server metrics, must be a valid URL character ^[a-z0-9_-]*$.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteServerMetricsWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.deleteServerMetricsWithResponseAsync(name, requestOptions);
    }

    /**
     * Get server metrics configuration for a test or test run by its name.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>testRunId</td><td>String</td><td>No</td><td>[Required, if testId is not provided] Test run Id.</td></tr>
     *     <tr><td>testId</td><td>String</td><td>No</td><td>Unique name for load test, must be a valid URL character ^[a-z0-9_-]*$.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Optional)
     *     testId: String (Optional)
     *     testRunId: String (Optional)
     *     metrics (Optional): {
     *         String (Optional): {
     *             id: String (Optional)
     *             resourceId: String (Required)
     *             metricnamespace: String (Required)
     *             displayDescription: String (Optional)
     *             name (Required): {
     *                 value: String (Required)
     *                 localizedValue: String (Required)
     *             }
     *             aggregation: String (Required)
     *             unit: String (Optional)
     *             resourceType: String (Required)
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return server metrics configuration for a test or test run by its name along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getServerMetricsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getServerMetricsWithResponseAsync(requestOptions);
    }

    /**
     * Get all default server metrics configuration for supported resource types.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultMetrics (Optional): {
     *         String (Optional): [
     *              (Optional){
     *                 metricnamespace: String (Optional)
     *                 aggregation: String (Optional)
     *                 name (Optional): {
     *                     value: String (Optional)
     *                     localizedValue: String (Optional)
     *                 }
     *                 unit: String (Optional)
     *                 displayDescription: String (Optional)
     *             }
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return all default server metrics configuration for supported resource types along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getServerDefaultMetricsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getServerDefaultMetricsWithResponseAsync(requestOptions);
    }

    /**
     * Get all supported resource types for App Components(Azure resource types).
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Optional): [
     *         String (Optional)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return all supported resource types for App Components(Azure resource types) along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> listSupportedResourceTypeWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.listSupportedResourceTypeWithResponseAsync(requestOptions);
    }
}
