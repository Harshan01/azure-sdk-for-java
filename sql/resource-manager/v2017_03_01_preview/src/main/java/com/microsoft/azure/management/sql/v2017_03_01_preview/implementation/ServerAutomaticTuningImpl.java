/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerAutomaticTuning;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.AutomaticTuningServerMode;
import java.util.Map;
import com.microsoft.azure.management.sql.v2017_03_01_preview.AutomaticTuningServerOptions;

class ServerAutomaticTuningImpl extends WrapperImpl<ServerAutomaticTuningInner> implements ServerAutomaticTuning {
    private final SqlManager manager;
    ServerAutomaticTuningImpl(ServerAutomaticTuningInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public AutomaticTuningServerMode actualState() {
        return this.inner().actualState();
    }

    @Override
    public AutomaticTuningServerMode desiredState() {
        return this.inner().desiredState();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, AutomaticTuningServerOptions> options() {
        return this.inner().options();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
