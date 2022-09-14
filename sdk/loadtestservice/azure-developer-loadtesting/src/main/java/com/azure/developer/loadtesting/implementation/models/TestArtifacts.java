// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TestArtifacts model. */
@Fluent
public final class TestArtifacts {
    /*
     * The input artifacts for the test.
     */
    @JsonProperty(value = "inputArtifacts", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private InputTestArtifacts inputArtifacts;

    /*
     * The output artifacts for the test run.
     */
    @JsonProperty(value = "outputArtifacts")
    private OutputTestArtifacts outputArtifacts;

    /**
     * Creates an instance of TestArtifacts class.
     *
     * @param inputArtifacts the inputArtifacts value to set.
     */
    @JsonCreator
    public TestArtifacts(
            @JsonProperty(value = "inputArtifacts", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    InputTestArtifacts inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * Get the inputArtifacts property: The input artifacts for the test.
     *
     * @return the inputArtifacts value.
     */
    public InputTestArtifacts getInputArtifacts() {
        return this.inputArtifacts;
    }

    /**
     * Get the outputArtifacts property: The output artifacts for the test run.
     *
     * @return the outputArtifacts value.
     */
    public OutputTestArtifacts getOutputArtifacts() {
        return this.outputArtifacts;
    }

    /**
     * Set the outputArtifacts property: The output artifacts for the test run.
     *
     * @param outputArtifacts the outputArtifacts value to set.
     * @return the TestArtifacts object itself.
     */
    public TestArtifacts setOutputArtifacts(OutputTestArtifacts outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
        return this;
    }
}
