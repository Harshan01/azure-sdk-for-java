// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Server metrics config model. */
@Fluent
public final class ServerMetricsModel {
    /*
     * Server metrics config name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * [Required, if testRunId is not given] Load test unique identifier
     */
    @JsonProperty(value = "testId")
    private String testId;

    /*
     * [Required, if testId is not given] Load test run unique identifier
     */
    @JsonProperty(value = "testRunId")
    private String testRunId;

    /*
     * Metrics map {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition for metric id).
     */
    @JsonProperty(value = "metrics")
    private Map<String, ResourceMetricModel> metrics;

    /**
     * Get the name property: Server metrics config name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the testId property: [Required, if testRunId is not given] Load test unique identifier.
     *
     * @return the testId value.
     */
    public String getTestId() {
        return this.testId;
    }

    /**
     * Set the testId property: [Required, if testRunId is not given] Load test unique identifier.
     *
     * @param testId the testId value to set.
     * @return the ServerMetricsModel object itself.
     */
    public ServerMetricsModel setTestId(String testId) {
        this.testId = testId;
        return this;
    }

    /**
     * Get the testRunId property: [Required, if testId is not given] Load test run unique identifier.
     *
     * @return the testRunId value.
     */
    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * Set the testRunId property: [Required, if testId is not given] Load test run unique identifier.
     *
     * @param testRunId the testRunId value to set.
     * @return the ServerMetricsModel object itself.
     */
    public ServerMetricsModel setTestRunId(String testRunId) {
        this.testRunId = testRunId;
        return this;
    }

    /**
     * Get the metrics property: Metrics map {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition for metric id).
     *
     * @return the metrics value.
     */
    public Map<String, ResourceMetricModel> getMetrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Metrics map {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition for metric id).
     *
     * @param metrics the metrics value to set.
     * @return the ServerMetricsModel object itself.
     */
    public ServerMetricsModel setMetrics(Map<String, ResourceMetricModel> metrics) {
        this.metrics = metrics;
        return this;
    }
}
