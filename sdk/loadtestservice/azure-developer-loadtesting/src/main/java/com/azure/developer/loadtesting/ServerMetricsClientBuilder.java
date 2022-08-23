// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.developer.loadtesting;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.developer.loadtesting.implementation.LoadTestClientImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the ServerMetricsClient type. */
@ServiceClientBuilder(serviceClients = {ServerMetricsClient.class, ServerMetricsAsyncClient.class})
public final class ServerMetricsClientBuilder
        implements HttpTrait<ServerMetricsClientBuilder>,
                ConfigurationTrait<ServerMetricsClientBuilder>,
                TokenCredentialTrait<ServerMetricsClientBuilder>,
                EndpointTrait<ServerMetricsClientBuilder> {

    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private static final String[] DEFAULT_SCOPES = new String[] {"https://loadtest.azure-dev.com/.default"};

    @Generated
    private final Map<String, String> properties = CoreUtils.getProperties("azure-developer-loadtesting.properties");

    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the ServerMetricsClientBuilder. */
    @Generated
    public ServerMetricsClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated private HttpClient httpClient;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated private HttpLogOptions httpLogOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated private ClientOptions clientOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated private RetryOptions retryOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated private Configuration configuration;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    @Generated private TokenCredential tokenCredential;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated private String endpoint;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public ServerMetricsClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    @Generated private LoadTestServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the ServerMetricsClientBuilder.
     */
    @Generated
    public ServerMetricsClientBuilder serviceVersion(LoadTestServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the ServerMetricsClientBuilder.
     */
    @Generated
    public ServerMetricsClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of LoadTestClientImpl with the provided parameters.
     *
     * @return an instance of LoadTestClientImpl.
     */
    @Generated
    private LoadTestClientImpl buildInnerClient() {
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        LoadTestServiceVersion localServiceVersion =
                (serviceVersion != null) ? serviceVersion : LoadTestServiceVersion.getLatest();
        LoadTestClientImpl client =
                new LoadTestClientImpl(
                        localPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, localServiceVersion);
        return client;
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        policies.add(new CookiePolicy());
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .clientOptions(clientOptions)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of ServerMetricsAsyncClient class.
     *
     * @return an instance of ServerMetricsAsyncClient.
     */
    @Generated
    public ServerMetricsAsyncClient buildAsyncClient() {
        return new ServerMetricsAsyncClient(buildInnerClient().getServerMetrics());
    }

    /**
     * Builds an instance of ServerMetricsClient class.
     *
     * @return an instance of ServerMetricsClient.
     */
    @Generated
    public ServerMetricsClient buildClient() {
        return new ServerMetricsClient(new ServerMetricsAsyncClient(buildInnerClient().getServerMetrics()));
    }
}
