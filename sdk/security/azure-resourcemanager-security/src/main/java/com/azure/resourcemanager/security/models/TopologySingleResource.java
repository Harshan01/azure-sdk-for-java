// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TopologySingleResource model. */
@Immutable
public final class TopologySingleResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopologySingleResource.class);

    /*
     * Azure resource id
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * The security severity of the resource
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private String severity;

    /*
     * Indicates if the resource has security recommendations
     */
    @JsonProperty(value = "recommendationsExist", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean recommendationsExist;

    /*
     * Indicates the resource connectivity level to the Internet
     * (InternetFacing, Internal ,etc.)
     */
    @JsonProperty(value = "networkZones", access = JsonProperty.Access.WRITE_ONLY)
    private String networkZones;

    /*
     * Score of the resource based on its security severity
     */
    @JsonProperty(value = "topologyScore", access = JsonProperty.Access.WRITE_ONLY)
    private Integer topologyScore;

    /*
     * The location of this resource
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Azure resources connected to this resource which are in higher level in
     * the topology view
     */
    @JsonProperty(value = "parents", access = JsonProperty.Access.WRITE_ONLY)
    private List<TopologySingleResourceParent> parents;

    /*
     * Azure resources connected to this resource which are in lower level in
     * the topology view
     */
    @JsonProperty(value = "children", access = JsonProperty.Access.WRITE_ONLY)
    private List<TopologySingleResourceChild> children;

    /**
     * Get the resourceId property: Azure resource id.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the severity property: The security severity of the resource.
     *
     * @return the severity value.
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Get the recommendationsExist property: Indicates if the resource has security recommendations.
     *
     * @return the recommendationsExist value.
     */
    public Boolean recommendationsExist() {
        return this.recommendationsExist;
    }

    /**
     * Get the networkZones property: Indicates the resource connectivity level to the Internet (InternetFacing,
     * Internal ,etc.).
     *
     * @return the networkZones value.
     */
    public String networkZones() {
        return this.networkZones;
    }

    /**
     * Get the topologyScore property: Score of the resource based on its security severity.
     *
     * @return the topologyScore value.
     */
    public Integer topologyScore() {
        return this.topologyScore;
    }

    /**
     * Get the location property: The location of this resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the parents property: Azure resources connected to this resource which are in higher level in the topology
     * view.
     *
     * @return the parents value.
     */
    public List<TopologySingleResourceParent> parents() {
        return this.parents;
    }

    /**
     * Get the children property: Azure resources connected to this resource which are in lower level in the topology
     * view.
     *
     * @return the children value.
     */
    public List<TopologySingleResourceChild> children() {
        return this.children;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parents() != null) {
            parents().forEach(e -> e.validate());
        }
        if (children() != null) {
            children().forEach(e -> e.validate());
        }
    }
}
