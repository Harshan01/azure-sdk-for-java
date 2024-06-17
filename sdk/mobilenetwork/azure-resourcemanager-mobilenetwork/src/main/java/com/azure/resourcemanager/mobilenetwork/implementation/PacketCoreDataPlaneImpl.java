// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlane;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PacketCoreDataPlaneImpl
    implements PacketCoreDataPlane, PacketCoreDataPlane.Definition, PacketCoreDataPlane.Update {
    private PacketCoreDataPlaneInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public InterfaceProperties userPlaneAccessInterface() {
        return this.innerModel().userPlaneAccessInterface();
    }

    public List<String> userPlaneAccessVirtualIpv4Addresses() {
        List<String> inner = this.innerModel().userPlaneAccessVirtualIpv4Addresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PacketCoreDataPlaneInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String packetCoreControlPlaneName;

    private String packetCoreDataPlaneName;

    private TagsObject updateParameters;

    public PacketCoreDataPlaneImpl withExistingPacketCoreControlPlane(String resourceGroupName,
        String packetCoreControlPlaneName) {
        this.resourceGroupName = resourceGroupName;
        this.packetCoreControlPlaneName = packetCoreControlPlaneName;
        return this;
    }

    public PacketCoreDataPlane create() {
        this.innerObject = serviceManager.serviceClient()
            .getPacketCoreDataPlanes()
            .createOrUpdate(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public PacketCoreDataPlane create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPacketCoreDataPlanes()
            .createOrUpdate(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, this.innerModel(),
                context);
        return this;
    }

    PacketCoreDataPlaneImpl(String name, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = new PacketCoreDataPlaneInner();
        this.serviceManager = serviceManager;
        this.packetCoreDataPlaneName = name;
    }

    public PacketCoreDataPlaneImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public PacketCoreDataPlane apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPacketCoreDataPlanes()
            .updateTagsWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName,
                updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public PacketCoreDataPlane apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPacketCoreDataPlanes()
            .updateTagsWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName,
                updateParameters, context)
            .getValue();
        return this;
    }

    PacketCoreDataPlaneImpl(PacketCoreDataPlaneInner innerObject,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.packetCoreControlPlaneName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "packetCoreControlPlanes");
        this.packetCoreDataPlaneName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "packetCoreDataPlanes");
    }

    public PacketCoreDataPlane refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPacketCoreDataPlanes()
            .getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, Context.NONE)
            .getValue();
        return this;
    }

    public PacketCoreDataPlane refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPacketCoreDataPlanes()
            .getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, context)
            .getValue();
        return this;
    }

    public PacketCoreDataPlaneImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PacketCoreDataPlaneImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PacketCoreDataPlaneImpl withUserPlaneAccessInterface(InterfaceProperties userPlaneAccessInterface) {
        this.innerModel().withUserPlaneAccessInterface(userPlaneAccessInterface);
        return this;
    }

    public PacketCoreDataPlaneImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public PacketCoreDataPlaneImpl
        withUserPlaneAccessVirtualIpv4Addresses(List<String> userPlaneAccessVirtualIpv4Addresses) {
        this.innerModel().withUserPlaneAccessVirtualIpv4Addresses(userPlaneAccessVirtualIpv4Addresses);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
