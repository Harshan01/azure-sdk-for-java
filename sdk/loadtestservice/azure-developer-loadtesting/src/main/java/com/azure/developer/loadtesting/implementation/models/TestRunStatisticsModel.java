// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Test run statistics. */
@Immutable
public final class TestRunStatisticsModel {
    /*
     * Transaction name.
     */
    @JsonProperty(value = "transaction", access = JsonProperty.Access.WRITE_ONLY)
    private String transaction;

    /*
     * Sampler count.
     */
    @JsonProperty(value = "sampleCount", access = JsonProperty.Access.WRITE_ONLY)
    private Double sampleCount;

    /*
     * Error count.
     */
    @JsonProperty(value = "errorCount", access = JsonProperty.Access.WRITE_ONLY)
    private Double errorCount;

    /*
     * Error percentage.
     */
    @JsonProperty(value = "errorPct", access = JsonProperty.Access.WRITE_ONLY)
    private Double errorPct;

    /*
     * Mean response time.
     */
    @JsonProperty(value = "meanResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double meanResTime;

    /*
     * Median response time.
     */
    @JsonProperty(value = "medianResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double medianResTime;

    /*
     * Max response time.
     */
    @JsonProperty(value = "maxResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxResTime;

    /*
     * Minimum response time.
     */
    @JsonProperty(value = "minResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double minResTime;

    /*
     * 90 percentile response time.
     */
    @JsonProperty(value = "pct1ResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double pct1ResTime;

    /*
     * 95 percentile response time.
     */
    @JsonProperty(value = "pct2ResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double pct2ResTime;

    /*
     * 99 percentile response time.
     */
    @JsonProperty(value = "pct3ResTime", access = JsonProperty.Access.WRITE_ONLY)
    private Double pct3ResTime;

    /*
     * Throughput.
     */
    @JsonProperty(value = "throughput", access = JsonProperty.Access.WRITE_ONLY)
    private Double throughput;

    /*
     * Received network bytes.
     */
    @JsonProperty(value = "receivedKBytesPerSec", access = JsonProperty.Access.WRITE_ONLY)
    private Double receivedKBytesPerSec;

    /*
     * Sent network bytes.
     */
    @JsonProperty(value = "sentKBytesPerSec", access = JsonProperty.Access.WRITE_ONLY)
    private Double sentKBytesPerSec;

    /**
     * Get the transaction property: Transaction name.
     *
     * @return the transaction value.
     */
    public String getTransaction() {
        return this.transaction;
    }

    /**
     * Get the sampleCount property: Sampler count.
     *
     * @return the sampleCount value.
     */
    public Double getSampleCount() {
        return this.sampleCount;
    }

    /**
     * Get the errorCount property: Error count.
     *
     * @return the errorCount value.
     */
    public Double getErrorCount() {
        return this.errorCount;
    }

    /**
     * Get the errorPct property: Error percentage.
     *
     * @return the errorPct value.
     */
    public Double getErrorPct() {
        return this.errorPct;
    }

    /**
     * Get the meanResTime property: Mean response time.
     *
     * @return the meanResTime value.
     */
    public Double getMeanResTime() {
        return this.meanResTime;
    }

    /**
     * Get the medianResTime property: Median response time.
     *
     * @return the medianResTime value.
     */
    public Double getMedianResTime() {
        return this.medianResTime;
    }

    /**
     * Get the maxResTime property: Max response time.
     *
     * @return the maxResTime value.
     */
    public Double getMaxResTime() {
        return this.maxResTime;
    }

    /**
     * Get the minResTime property: Minimum response time.
     *
     * @return the minResTime value.
     */
    public Double getMinResTime() {
        return this.minResTime;
    }

    /**
     * Get the pct1ResTime property: 90 percentile response time.
     *
     * @return the pct1ResTime value.
     */
    public Double getPct1ResTime() {
        return this.pct1ResTime;
    }

    /**
     * Get the pct2ResTime property: 95 percentile response time.
     *
     * @return the pct2ResTime value.
     */
    public Double getPct2ResTime() {
        return this.pct2ResTime;
    }

    /**
     * Get the pct3ResTime property: 99 percentile response time.
     *
     * @return the pct3ResTime value.
     */
    public Double getPct3ResTime() {
        return this.pct3ResTime;
    }

    /**
     * Get the throughput property: Throughput.
     *
     * @return the throughput value.
     */
    public Double getThroughput() {
        return this.throughput;
    }

    /**
     * Get the receivedKBytesPerSec property: Received network bytes.
     *
     * @return the receivedKBytesPerSec value.
     */
    public Double getReceivedKBytesPerSec() {
        return this.receivedKBytesPerSec;
    }

    /**
     * Get the sentKBytesPerSec property: Sent network bytes.
     *
     * @return the sentKBytesPerSec value.
     */
    public Double getSentKBytesPerSec() {
        return this.sentKBytesPerSec;
    }
}
