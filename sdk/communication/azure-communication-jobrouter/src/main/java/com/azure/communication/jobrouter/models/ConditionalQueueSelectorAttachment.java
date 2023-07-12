// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/** Describes a set of queue selectors that will be attached if the given condition resolves to true. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("conditional")
@Fluent
public final class ConditionalQueueSelectorAttachment extends QueueSelectorAttachment {
    /*
     * A rule of one of the following types:
     *
     * StaticRule:  A rule providing static rules that always return the same
     * result, regardless of input.
     * DirectMapRule:  A rule that return the same labels as the input labels.
     * ExpressionRule: A rule providing inline expression rules.
     * AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure
     * Function.
     * WebhookRule: A rule providing a binding to a webserver following
     * OAuth2.0 authentication protocol.
     */
    @JsonProperty(value = "condition", required = true)
    private RouterRule condition;

    /*
     * The queue selectors to attach
     */
    @JsonProperty(value = "queueSelectors", required = true)
    private List<RouterQueueSelector> queueSelectors;

    /**
     * Get the condition property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule:
     * A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @return the condition value.
     */
    public RouterRule getCondition() {
        return this.condition;
    }

    /**
     * Set the condition property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule:
     * A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @param condition the condition value to set.
     * @return the ConditionalQueueSelectorAttachment object itself.
     */
    public ConditionalQueueSelectorAttachment setCondition(RouterRule condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the queueSelectors property: The queue selectors to attach.
     *
     * @return the queueSelectors value.
     */
    public List<RouterQueueSelector> getQueueSelectors() {
        return this.queueSelectors;
    }

    /**
     * Set the queueSelectors property: The queue selectors to attach.
     *
     * @param queueSelectors the queueSelectors value to set.
     * @return the ConditionalQueueSelectorAttachment object itself.
     */
    public ConditionalQueueSelectorAttachment setQueueSelectors(List<RouterQueueSelector> queueSelectors) {
        this.queueSelectors = queueSelectors;
        return this;
    }
}
