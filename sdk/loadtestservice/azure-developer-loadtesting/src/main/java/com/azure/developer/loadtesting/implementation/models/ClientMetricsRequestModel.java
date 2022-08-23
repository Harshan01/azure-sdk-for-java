// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Client metrics request payload. */
@Fluent
public final class ClientMetricsRequestModel {
    /*
     * List of request samplers, maximum supported samplers for queries are 20. In case of empty, it will return
     * metrics for maximum 20 samplers
     */
    @JsonProperty(value = "requestSamplers")
    private List<String> requestSamplers;

    /*
     * List of errors, maximum supported errors for queries are 20. In case of empty, by default will return metrics
     * for maximum 20 errors
     */
    @JsonProperty(value = "errors")
    private List<String> errors;

    /*
     * List of percentiles values for response time, supported values 50,90,99,95. Default value is 50th percentile.
     */
    @JsonProperty(value = "percentiles")
    private List<String> percentiles;

    /*
     * For test duration less than 10 minutes group by time interval can be any one of 5s,10s,1m,5m.\n\nFor test
     * duration greater than 10 minutes, group by time interval can be any one of 1m,5m,1h. Default value is 1m.
     */
    @JsonProperty(value = "groupByInterval")
    private String groupByInterval;

    /*
     * Start time
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * End time
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /**
     * Creates an instance of ClientMetricsRequestModel class.
     *
     * @param startTime the startTime value to set.
     * @param endTime the endTime value to set.
     */
    @JsonCreator
    public ClientMetricsRequestModel(
            @JsonProperty(value = "startTime", required = true) OffsetDateTime startTime,
            @JsonProperty(value = "endTime", required = true) OffsetDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Get the requestSamplers property: List of request samplers, maximum supported samplers for queries are 20. In
     * case of empty, it will return metrics for maximum 20 samplers.
     *
     * @return the requestSamplers value.
     */
    public List<String> getRequestSamplers() {
        return this.requestSamplers;
    }

    /**
     * Set the requestSamplers property: List of request samplers, maximum supported samplers for queries are 20. In
     * case of empty, it will return metrics for maximum 20 samplers.
     *
     * @param requestSamplers the requestSamplers value to set.
     * @return the ClientMetricsRequestModel object itself.
     */
    public ClientMetricsRequestModel setRequestSamplers(List<String> requestSamplers) {
        this.requestSamplers = requestSamplers;
        return this;
    }

    /**
     * Get the errors property: List of errors, maximum supported errors for queries are 20. In case of empty, by
     * default will return metrics for maximum 20 errors.
     *
     * @return the errors value.
     */
    public List<String> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: List of errors, maximum supported errors for queries are 20. In case of empty, by
     * default will return metrics for maximum 20 errors.
     *
     * @param errors the errors value to set.
     * @return the ClientMetricsRequestModel object itself.
     */
    public ClientMetricsRequestModel setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the percentiles property: List of percentiles values for response time, supported values 50,90,99,95. Default
     * value is 50th percentile.
     *
     * @return the percentiles value.
     */
    public List<String> getPercentiles() {
        return this.percentiles;
    }

    /**
     * Set the percentiles property: List of percentiles values for response time, supported values 50,90,99,95. Default
     * value is 50th percentile.
     *
     * @param percentiles the percentiles value to set.
     * @return the ClientMetricsRequestModel object itself.
     */
    public ClientMetricsRequestModel setPercentiles(List<String> percentiles) {
        this.percentiles = percentiles;
        return this;
    }

    /**
     * Get the groupByInterval property: For test duration less than 10 minutes group by time interval can be any one of
     * 5s,10s,1m,5m.\n\nFor test duration greater than 10 minutes, group by time interval can be any one of 1m,5m,1h.
     * Default value is 1m.
     *
     * @return the groupByInterval value.
     */
    public String getGroupByInterval() {
        return this.groupByInterval;
    }

    /**
     * Set the groupByInterval property: For test duration less than 10 minutes group by time interval can be any one of
     * 5s,10s,1m,5m.\n\nFor test duration greater than 10 minutes, group by time interval can be any one of 1m,5m,1h.
     * Default value is 1m.
     *
     * @param groupByInterval the groupByInterval value to set.
     * @return the ClientMetricsRequestModel object itself.
     */
    public ClientMetricsRequestModel setGroupByInterval(String groupByInterval) {
        this.groupByInterval = groupByInterval;
        return this;
    }

    /**
     * Get the startTime property: Start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: End time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }
}
