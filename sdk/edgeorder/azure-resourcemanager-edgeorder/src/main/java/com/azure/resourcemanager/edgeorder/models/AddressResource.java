// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.edgeorder.fluent.models.AddressResourceInner;
import java.util.Map;

/** An immutable client-side representation of AddressResource. */
public interface AddressResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Represents resource creation and update time.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the shippingAddress property: Shipping details for the address.
     *
     * @return the shippingAddress value.
     */
    ShippingAddress shippingAddress();

    /**
     * Gets the contactDetails property: Contact details for the address.
     *
     * @return the contactDetails value.
     */
    ContactDetails contactDetails();

    /**
     * Gets the addressValidationStatus property: Status of address validation.
     *
     * @return the addressValidationStatus value.
     */
    AddressValidationStatus addressValidationStatus();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.edgeorder.fluent.models.AddressResourceInner object.
     *
     * @return the inner object.
     */
    AddressResourceInner innerModel();

    /** The entirety of the AddressResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithContactDetails,
            DefinitionStages.WithCreate {
    }
    /** The AddressResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the AddressResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AddressResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the AddressResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithContactDetails withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the AddressResource definition allowing to specify contactDetails. */
        interface WithContactDetails {
            /**
             * Specifies the contactDetails property: Contact details for the address.
             *
             * @param contactDetails Contact details for the address.
             * @return the next definition stage.
             */
            WithCreate withContactDetails(ContactDetails contactDetails);
        }
        /**
         * The stage of the AddressResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithShippingAddress {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AddressResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AddressResource create(Context context);
        }
        /** The stage of the AddressResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AddressResource definition allowing to specify shippingAddress. */
        interface WithShippingAddress {
            /**
             * Specifies the shippingAddress property: Shipping details for the address.
             *
             * @param shippingAddress Shipping details for the address.
             * @return the next definition stage.
             */
            WithCreate withShippingAddress(ShippingAddress shippingAddress);
        }
    }
    /**
     * Begins update for the AddressResource resource.
     *
     * @return the stage of resource update.
     */
    AddressResource.Update update();

    /** The template for AddressResource update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithShippingAddress,
            UpdateStages.WithContactDetails,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AddressResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AddressResource apply(Context context);
    }
    /** The AddressResource update stages. */
    interface UpdateStages {
        /** The stage of the AddressResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The list of key value pairs that describe the resource. These tags can be
             * used in viewing and grouping this resource (across resource groups)..
             *
             * @param tags The list of key value pairs that describe the resource. These tags can be used in viewing and
             *     grouping this resource (across resource groups).
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AddressResource update allowing to specify shippingAddress. */
        interface WithShippingAddress {
            /**
             * Specifies the shippingAddress property: Shipping details for the address.
             *
             * @param shippingAddress Shipping details for the address.
             * @return the next definition stage.
             */
            Update withShippingAddress(ShippingAddress shippingAddress);
        }
        /** The stage of the AddressResource update allowing to specify contactDetails. */
        interface WithContactDetails {
            /**
             * Specifies the contactDetails property: Contact details for the address.
             *
             * @param contactDetails Contact details for the address.
             * @return the next definition stage.
             */
            Update withContactDetails(ContactDetails contactDetails);
        }
        /** The stage of the AddressResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: Defines the If-Match condition. The patch will be performed only if the
             * ETag of the job on the server matches this value..
             *
             * @param ifMatch Defines the If-Match condition. The patch will be performed only if the ETag of the job on
             *     the server matches this value.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AddressResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AddressResource refresh(Context context);
}
