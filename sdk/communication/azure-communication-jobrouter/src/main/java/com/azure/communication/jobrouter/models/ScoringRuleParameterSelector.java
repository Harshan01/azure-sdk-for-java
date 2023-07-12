// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScoringRuleParameterSelector. */
public final class ScoringRuleParameterSelector extends ExpandableStringEnum<ScoringRuleParameterSelector> {
    /** Static value jobLabels for ScoringRuleParameterSelector. */
    public static final ScoringRuleParameterSelector JOB_LABELS = fromString("jobLabels");

    /** Static value workerSelectors for ScoringRuleParameterSelector. */
    public static final ScoringRuleParameterSelector WORKER_SELECTORS = fromString("workerSelectors");

    /**
     * Creates or finds a ScoringRuleParameterSelector from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScoringRuleParameterSelector.
     */
    @JsonCreator
    public static ScoringRuleParameterSelector fromString(String name) {
        return fromString(name, ScoringRuleParameterSelector.class);
    }

    /**
     * Gets known ScoringRuleParameterSelector values.
     *
     * @return known ScoringRuleParameterSelector values.
     */
    public static Collection<ScoringRuleParameterSelector> values() {
        return values(ScoringRuleParameterSelector.class);
    }
}
