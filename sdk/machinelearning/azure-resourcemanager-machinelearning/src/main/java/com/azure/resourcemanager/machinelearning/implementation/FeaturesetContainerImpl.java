// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturesetContainerInner;
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainer;
import com.azure.resourcemanager.machinelearning.models.FeaturesetContainerProperties;

public final class FeaturesetContainerImpl
    implements FeaturesetContainer, FeaturesetContainer.Definition, FeaturesetContainer.Update {
    private FeaturesetContainerInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public FeaturesetContainerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FeaturesetContainerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    public FeaturesetContainerImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public FeaturesetContainer create() {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturesetContainers()
            .createOrUpdate(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public FeaturesetContainer create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturesetContainers()
            .createOrUpdate(resourceGroupName, workspaceName, name, this.innerModel(), context);
        return this;
    }

    FeaturesetContainerImpl(String name,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new FeaturesetContainerInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public FeaturesetContainerImpl update() {
        return this;
    }

    public FeaturesetContainer apply() {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturesetContainers()
            .createOrUpdate(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public FeaturesetContainer apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturesetContainers()
            .createOrUpdate(resourceGroupName, workspaceName, name, this.innerModel(), context);
        return this;
    }

    FeaturesetContainerImpl(FeaturesetContainerInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "featuresets");
    }

    public FeaturesetContainer refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturesetContainers()
            .getEntityWithResponse(resourceGroupName, workspaceName, name, Context.NONE)
            .getValue();
        return this;
    }

    public FeaturesetContainer refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturesetContainers()
            .getEntityWithResponse(resourceGroupName, workspaceName, name, context)
            .getValue();
        return this;
    }

    public FeaturesetContainerImpl withProperties(FeaturesetContainerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
