/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The public IP Address configuration of the networking configuration of a
 * Pool.
 */
public class PublicIPAddressConfiguration {
    /**
     * The provisioning type for Public IP Addresses for the Pool.
     * The default value is BatchManaged. Possible values include:
     * 'batchManaged', 'userManaged', 'noPublicIPAddresses'.
     */
    @JsonProperty(value = "provision")
    private IPAddressProvisioningType provision;

    /**
     * The list of public IPs which the Batch service will use when
     * provisioning Compute Nodes.
     * The number of IPs specified here limits the maximum size of the Pool -
     * 100 dedicated nodes or 100 Spot/Low-priority nodes can be allocated for
     * each public IP. For example, a pool needing 250 dedicated VMs would need
     * at least 3 public IPs specified. Each element of this collection is of
     * the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     */
    @JsonProperty(value = "ipAddressIds")
    private List<String> ipAddressIds;

    /**
     * Get the default value is BatchManaged. Possible values include: 'batchManaged', 'userManaged', 'noPublicIPAddresses'.
     *
     * @return the provision value
     */
    public IPAddressProvisioningType provision() {
        return this.provision;
    }

    /**
     * Set the default value is BatchManaged. Possible values include: 'batchManaged', 'userManaged', 'noPublicIPAddresses'.
     *
     * @param provision the provision value to set
     * @return the PublicIPAddressConfiguration object itself.
     */
    public PublicIPAddressConfiguration withProvision(IPAddressProvisioningType provision) {
        this.provision = provision;
        return this;
    }

    /**
     * Get the number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 Spot/Low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @return the ipAddressIds value
     */
    public List<String> ipAddressIds() {
        return this.ipAddressIds;
    }

    /**
     * Set the number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 Spot/Low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @param ipAddressIds the ipAddressIds value to set
     * @return the PublicIPAddressConfiguration object itself.
     */
    public PublicIPAddressConfiguration withIpAddressIds(List<String> ipAddressIds) {
        this.ipAddressIds = ipAddressIds;
        return this;
    }

}
