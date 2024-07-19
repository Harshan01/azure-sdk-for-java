// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.models.RedisCommonProperties;
import com.azure.resourcemanager.redis.models.RedisConfiguration;
import com.azure.resourcemanager.redis.models.Sku;
import com.azure.resourcemanager.redis.models.TlsVersion;
import com.azure.resourcemanager.redis.models.UpdateChannel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Properties supplied to Create Redis operation.
 */
@Fluent
public class RedisCreateProperties extends RedisCommonProperties {
    /*
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/
     * VirtualNetworks/vnet1/subnets/subnet1
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual
     * Network; auto assigned by default.
     */
    @JsonProperty(value = "staticIP")
    private String staticIp;

    /**
     * Creates an instance of RedisCreateProperties class.
     */
    public RedisCreateProperties() {
    }

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     * 
     * @param sku the sku value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     * 
     * @param subnetId the subnetId value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     * 
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: Static IP address. Optionally, may be specified when deploying a Redis cache inside an
     * existing Azure Virtual Network; auto assigned by default.
     * 
     * @param staticIp the staticIp value to set.
     * @return the RedisCreateProperties object itself.
     */
    public RedisCreateProperties withStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withRedisConfiguration(RedisConfiguration redisConfiguration) {
        super.withRedisConfiguration(redisConfiguration);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withRedisVersion(String redisVersion) {
        super.withRedisVersion(redisVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withEnableNonSslPort(Boolean enableNonSslPort) {
        super.withEnableNonSslPort(enableNonSslPort);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withReplicasPerMaster(Integer replicasPerMaster) {
        super.withReplicasPerMaster(replicasPerMaster);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withReplicasPerPrimary(Integer replicasPerPrimary) {
        super.withReplicasPerPrimary(replicasPerPrimary);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withTenantSettings(Map<String, String> tenantSettings) {
        super.withTenantSettings(tenantSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withShardCount(Integer shardCount) {
        super.withShardCount(shardCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        super.withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withUpdateChannel(UpdateChannel updateChannel) {
        super.withUpdateChannel(updateChannel);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisCreateProperties withDisableAccessKeyAuthentication(Boolean disableAccessKeyAuthentication) {
        super.withDisableAccessKeyAuthentication(disableAccessKeyAuthentication);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sku() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property sku in model RedisCreateProperties"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedisCreateProperties.class);
}
