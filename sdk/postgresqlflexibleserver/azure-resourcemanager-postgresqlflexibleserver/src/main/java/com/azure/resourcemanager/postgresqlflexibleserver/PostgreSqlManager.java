// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.PostgreSqlManagementClient;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.CheckNameAvailabilitiesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ConfigurationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.DatabasesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.FirewallRulesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.GetPrivateDnsZoneSuffixesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.LocationBasedCapabilitiesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.OperationsImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.PostgreSqlManagementClientBuilder;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.ServersImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.implementation.VirtualNetworkSubnetUsagesImpl;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilities;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Configurations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Databases;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FirewallRules;
import com.azure.resourcemanager.postgresqlflexibleserver.models.GetPrivateDnsZoneSuffixes;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LocationBasedCapabilities;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Servers;
import com.azure.resourcemanager.postgresqlflexibleserver.models.VirtualNetworkSubnetUsages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to PostgreSqlManager. The Microsoft Azure management API provides create, read, update, and delete
 * functionality for Azure PostgreSQL resources including servers, databases, firewall rules, VNET rules, security alert
 * policies, log files and configurations with new business model.
 */
public final class PostgreSqlManager {
    private Servers servers;

    private FirewallRules firewallRules;

    private Configurations configurations;

    private CheckNameAvailabilities checkNameAvailabilities;

    private LocationBasedCapabilities locationBasedCapabilities;

    private VirtualNetworkSubnetUsages virtualNetworkSubnetUsages;

    private Operations operations;

    private Databases databases;

    private GetPrivateDnsZoneSuffixes getPrivateDnsZoneSuffixes;

    private final PostgreSqlManagementClient clientObject;

    private PostgreSqlManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new PostgreSqlManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of PostgreSql service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the PostgreSql service API instance.
     */
    public static PostgreSqlManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create PostgreSqlManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new PostgreSqlManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of PostgreSql service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the PostgreSql service API instance.
         */
        public PostgreSqlManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.postgresqlflexibleserver")
                .append("/")
                .append("1.0.0-beta.4");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new PostgreSqlManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Servers. */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(clientObject.getServers(), this);
        }
        return servers;
    }

    /** @return Resource collection API of FirewallRules. */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(clientObject.getFirewallRules(), this);
        }
        return firewallRules;
    }

    /** @return Resource collection API of Configurations. */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(clientObject.getConfigurations(), this);
        }
        return configurations;
    }

    /** @return Resource collection API of CheckNameAvailabilities. */
    public CheckNameAvailabilities checkNameAvailabilities() {
        if (this.checkNameAvailabilities == null) {
            this.checkNameAvailabilities =
                new CheckNameAvailabilitiesImpl(clientObject.getCheckNameAvailabilities(), this);
        }
        return checkNameAvailabilities;
    }

    /** @return Resource collection API of LocationBasedCapabilities. */
    public LocationBasedCapabilities locationBasedCapabilities() {
        if (this.locationBasedCapabilities == null) {
            this.locationBasedCapabilities =
                new LocationBasedCapabilitiesImpl(clientObject.getLocationBasedCapabilities(), this);
        }
        return locationBasedCapabilities;
    }

    /** @return Resource collection API of VirtualNetworkSubnetUsages. */
    public VirtualNetworkSubnetUsages virtualNetworkSubnetUsages() {
        if (this.virtualNetworkSubnetUsages == null) {
            this.virtualNetworkSubnetUsages =
                new VirtualNetworkSubnetUsagesImpl(clientObject.getVirtualNetworkSubnetUsages(), this);
        }
        return virtualNetworkSubnetUsages;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Databases. */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /** @return Resource collection API of GetPrivateDnsZoneSuffixes. */
    public GetPrivateDnsZoneSuffixes getPrivateDnsZoneSuffixes() {
        if (this.getPrivateDnsZoneSuffixes == null) {
            this.getPrivateDnsZoneSuffixes =
                new GetPrivateDnsZoneSuffixesImpl(clientObject.getGetPrivateDnsZoneSuffixes(), this);
        }
        return getPrivateDnsZoneSuffixes;
    }

    /**
     * @return Wrapped service client PostgreSqlManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public PostgreSqlManagementClient serviceClient() {
        return this.clientObject;
    }
}
