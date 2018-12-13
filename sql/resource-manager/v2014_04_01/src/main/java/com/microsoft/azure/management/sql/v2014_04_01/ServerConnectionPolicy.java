/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ServerConnectionPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;

/**
 * Type representing ServerConnectionPolicy.
 */
public interface ServerConnectionPolicy extends HasInner<ServerConnectionPolicyInner>, Indexable, Refreshable<ServerConnectionPolicy>, Updatable<ServerConnectionPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the connectionType value.
     */
    ServerConnectionType connectionType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ServerConnectionPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithConnectionType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerConnectionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerConnectionPolicy definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the serverconnectionpolicy definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @return the next definition stage
            */
            WithConnectionType withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the serverconnectionpolicy definition allowing to specify ConnectionType.
         */
        interface WithConnectionType {
           /**
            * Specifies connectionType.
            * @param connectionType The server connection type. Possible values include: 'Default', 'Proxy', 'Redirect'
            * @return the next definition stage
            */
            WithCreate withConnectionType(ServerConnectionType connectionType);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerConnectionPolicy> {
        }
    }
    /**
     * The template for a ServerConnectionPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerConnectionPolicy>, UpdateStages.WithConnectionType {
    }

    /**
     * Grouping of ServerConnectionPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serverconnectionpolicy update allowing to specify ConnectionType.
         */
        interface WithConnectionType {
            /**
             * Specifies connectionType.
             * @param connectionType The server connection type. Possible values include: 'Default', 'Proxy', 'Redirect'
             * @return the next update stage
             */
            Update withConnectionType(ServerConnectionType connectionType);
        }

    }
}
