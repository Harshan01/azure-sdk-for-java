// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.fluent.WebPubSubSharedPrivateLinkResourcesClient;
import com.azure.resourcemanager.webpubsub.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSharedPrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WebPubSubSharedPrivateLinkResourcesImpl implements WebPubSubSharedPrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebPubSubSharedPrivateLinkResourcesImpl.class);

    private final WebPubSubSharedPrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    public WebPubSubSharedPrivateLinkResourcesImpl(
        WebPubSubSharedPrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SharedPrivateLinkResource> list(String resourceGroupName, String resourceName) {
        PagedIterable<SharedPrivateLinkResourceInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new SharedPrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedPrivateLinkResource> list(
        String resourceGroupName, String resourceName, Context context) {
        PagedIterable<SharedPrivateLinkResourceInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new SharedPrivateLinkResourceImpl(inner1, this.manager()));
    }

    public SharedPrivateLinkResource get(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName) {
        SharedPrivateLinkResourceInner inner =
            this.serviceClient().get(sharedPrivateLinkResourceName, resourceGroupName, resourceName);
        if (inner != null) {
            return new SharedPrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SharedPrivateLinkResource> getWithResponse(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName, Context context) {
        Response<SharedPrivateLinkResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(sharedPrivateLinkResourceName, resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SharedPrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName) {
        this.serviceClient().delete(sharedPrivateLinkResourceName, resourceGroupName, resourceName);
    }

    public void delete(
        String sharedPrivateLinkResourceName, String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(sharedPrivateLinkResourceName, resourceGroupName, resourceName, context);
    }

    public SharedPrivateLinkResource getById(String id) {
        String sharedPrivateLinkResourceName = Utils.getValueFromIdByName(id, "sharedPrivateLinkResources");
        if (sharedPrivateLinkResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sharedPrivateLinkResources'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "webPubSub");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webPubSub'.", id)));
        }
        return this
            .getWithResponse(sharedPrivateLinkResourceName, resourceGroupName, resourceName, Context.NONE)
            .getValue();
    }

    public Response<SharedPrivateLinkResource> getByIdWithResponse(String id, Context context) {
        String sharedPrivateLinkResourceName = Utils.getValueFromIdByName(id, "sharedPrivateLinkResources");
        if (sharedPrivateLinkResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sharedPrivateLinkResources'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "webPubSub");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webPubSub'.", id)));
        }
        return this.getWithResponse(sharedPrivateLinkResourceName, resourceGroupName, resourceName, context);
    }

    public void deleteById(String id) {
        String sharedPrivateLinkResourceName = Utils.getValueFromIdByName(id, "sharedPrivateLinkResources");
        if (sharedPrivateLinkResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sharedPrivateLinkResources'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "webPubSub");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webPubSub'.", id)));
        }
        this.delete(sharedPrivateLinkResourceName, resourceGroupName, resourceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String sharedPrivateLinkResourceName = Utils.getValueFromIdByName(id, "sharedPrivateLinkResources");
        if (sharedPrivateLinkResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sharedPrivateLinkResources'.",
                                id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "webPubSub");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webPubSub'.", id)));
        }
        this.delete(sharedPrivateLinkResourceName, resourceGroupName, resourceName, context);
    }

    private WebPubSubSharedPrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }

    public SharedPrivateLinkResourceImpl define(String name) {
        return new SharedPrivateLinkResourceImpl(name, this.manager());
    }
}
