/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.AdvisorInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import org.joda.time.DateTime;

/**
 * Type representing ServerAdvisor.
 */
public interface ServerAdvisor extends HasInner<AdvisorInner>, Indexable, Refreshable<ServerAdvisor>, Updatable<ServerAdvisor.Update>, HasManager<SqlManager> {
    /**
     * @return the advisorStatus value.
     */
    AdvisorStatus advisorStatus();

    /**
     * @return the autoExecuteValue value.
     */
    AutoExecuteStatus autoExecuteValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastChecked value.
     */
    DateTime lastChecked();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recommendationsStatus value.
     */
    String recommendationsStatus();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ServerAdvisor definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithAutoExecuteValue, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerAdvisor definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerAdvisor definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the serveradvisor definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @return the next definition stage
            */
            WithAutoExecuteValue withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the serveradvisor definition allowing to specify AutoExecuteValue.
         */
        interface WithAutoExecuteValue {
           /**
            * Specifies autoExecuteValue.
            * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
            * @return the next definition stage
            */
            WithCreate withAutoExecuteValue(AutoExecuteStatus autoExecuteValue);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerAdvisor> {
        }
    }
    /**
     * The template for a ServerAdvisor update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerAdvisor>, UpdateStages.WithAutoExecuteValue {
    }

    /**
     * Grouping of ServerAdvisor update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serveradvisor update allowing to specify AutoExecuteValue.
         */
        interface WithAutoExecuteValue {
            /**
             * Specifies autoExecuteValue.
             * @param autoExecuteValue Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
             * @return the next update stage
             */
            Update withAutoExecuteValue(AutoExecuteStatus autoExecuteValue);
        }

    }
}
