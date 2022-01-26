// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.botservice.fluent.BotsClient;
import com.azure.resourcemanager.botservice.fluent.models.BotInner;
import com.azure.resourcemanager.botservice.fluent.models.CheckNameAvailabilityResponseBodyInner;
import com.azure.resourcemanager.botservice.models.Bot;
import com.azure.resourcemanager.botservice.models.Bots;
import com.azure.resourcemanager.botservice.models.CheckNameAvailabilityRequestBody;
import com.azure.resourcemanager.botservice.models.CheckNameAvailabilityResponseBody;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BotsImpl implements Bots {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BotsImpl.class);

    private final BotsClient innerClient;

    private final com.azure.resourcemanager.botservice.BotServiceManager serviceManager;

    public BotsImpl(BotsClient innerClient, com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, context);
    }

    public Bot getByResourceGroup(String resourceGroupName, String resourceName) {
        BotInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new BotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Bot> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<BotInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BotImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Bot> listByResourceGroup(String resourceGroupName) {
        PagedIterable<BotInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new BotImpl(inner1, this.manager()));
    }

    public PagedIterable<Bot> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<BotInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new BotImpl(inner1, this.manager()));
    }

    public PagedIterable<Bot> list() {
        PagedIterable<BotInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new BotImpl(inner1, this.manager()));
    }

    public PagedIterable<Bot> list(Context context) {
        PagedIterable<BotInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new BotImpl(inner1, this.manager()));
    }

    public CheckNameAvailabilityResponseBody getCheckNameAvailability(CheckNameAvailabilityRequestBody parameters) {
        CheckNameAvailabilityResponseBodyInner inner = this.serviceClient().getCheckNameAvailability(parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResponseBodyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponseBody> getCheckNameAvailabilityWithResponse(
        CheckNameAvailabilityRequestBody parameters, Context context) {
        Response<CheckNameAvailabilityResponseBodyInner> inner =
            this.serviceClient().getCheckNameAvailabilityWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResponseBodyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Bot getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<Bot> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "botServices");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'botServices'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, context);
    }

    private BotsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.botservice.BotServiceManager manager() {
        return this.serviceManager;
    }

    public BotImpl define(String name) {
        return new BotImpl(name, this.manager());
    }
}
