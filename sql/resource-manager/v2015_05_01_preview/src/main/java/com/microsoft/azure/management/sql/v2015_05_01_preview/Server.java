/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.ServerInner;

/**
 * Type representing Server.
 */
public interface Server extends HasInner<ServerInner>, Resource, GroupableResourceCore<SqlManager, ServerInner>, HasResourceGroup, Refreshable<Server>, Updatable<Server.Update>, HasManager<SqlManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the administratorLoginPassword value.
     */
    String administratorLoginPassword();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the version value.
     */
    String version();

    /**
     * The entirety of the Server definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Server definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Server definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Server definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the server definition allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             * @param administratorLogin Administrator username for the server. Once created it cannot be changed
             * @return the next definition stage
             */
            WithCreate withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the server definition allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The administrator login password (required for server creation)
             * @return the next definition stage
             */
            WithCreate withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the server definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Azure Active Directory identity of the server
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the server definition allowing to specify Version.
         */
        interface WithVersion {
            /**
             * Specifies version.
             * @param version The version of the server
             * @return the next definition stage
             */
            WithCreate withVersion(String version);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Server>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdministratorLogin, DefinitionStages.WithAdministratorLoginPassword, DefinitionStages.WithIdentity, DefinitionStages.WithVersion {
        }
    }
    /**
     * The template for a Server update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Server>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdministratorLogin, UpdateStages.WithAdministratorLoginPassword, UpdateStages.WithVersion {
    }

    /**
     * Grouping of Server update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the server update allowing to specify AdministratorLogin.
         */
        interface WithAdministratorLogin {
            /**
             * Specifies administratorLogin.
             * @param administratorLogin Administrator username for the server. Once created it cannot be changed
             * @return the next update stage
             */
            Update withAdministratorLogin(String administratorLogin);
        }

        /**
         * The stage of the server update allowing to specify AdministratorLoginPassword.
         */
        interface WithAdministratorLoginPassword {
            /**
             * Specifies administratorLoginPassword.
             * @param administratorLoginPassword The administrator login password (required for server creation)
             * @return the next update stage
             */
            Update withAdministratorLoginPassword(String administratorLoginPassword);
        }

        /**
         * The stage of the server update allowing to specify Version.
         */
        interface WithVersion {
            /**
             * Specifies version.
             * @param version The version of the server
             * @return the next update stage
             */
            Update withVersion(String version);
        }

    }
}
