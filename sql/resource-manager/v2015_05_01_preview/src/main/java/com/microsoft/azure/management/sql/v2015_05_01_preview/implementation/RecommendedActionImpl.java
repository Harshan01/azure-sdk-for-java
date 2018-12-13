/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedAction;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionStateInfo;
import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionErrorInfo;
import java.util.List;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionImpactRecord;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionInitiatedBy;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionImplementationInfo;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionMetricInfo;
import rx.functions.Func1;

class RecommendedActionImpl extends CreatableUpdatableImpl<RecommendedAction, RecommendedActionInner, RecommendedActionImpl> implements RecommendedAction, RecommendedAction.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private String advisorName;
    private String recommendedActionName;
    private RecommendedActionStateInfo ustate;

    RecommendedActionImpl(String name, SqlManager manager) {
        super(name, new RecommendedActionInner());
        this.manager = manager;
        // Set resource name
        this.recommendedActionName = name;
        //
        this.ustate = new RecommendedActionStateInfo();
    }

    RecommendedActionImpl(RecommendedActionInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.recommendedActionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        this.advisorName = IdParsingUtils.getValueFromIdByName(inner.id(), "advisors");
        this.recommendedActionName = IdParsingUtils.getValueFromIdByName(inner.id(), "recommendedActions");
        //
        this.ustate = new RecommendedActionStateInfo();
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RecommendedAction> createResourceAsync() {
        DatabaseRecommendedActionsInner client = this.manager().inner().databaseRecommendedActions();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<RecommendedAction> updateResourceAsync() {
        DatabaseRecommendedActionsInner client = this.manager().inner().databaseRecommendedActions();
        return client.updateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.advisorName, this.recommendedActionName, this.ustate)
            .map(new Func1<RecommendedActionInner, RecommendedActionInner>() {
               @Override
               public RecommendedActionInner call(RecommendedActionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RecommendedActionInner> getInnerAsync() {
        DatabaseRecommendedActionsInner client = this.manager().inner().databaseRecommendedActions();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName, this.advisorName, this.recommendedActionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.ustate = new RecommendedActionStateInfo();
    }

    @Override
    public Map<String, Object> details() {
        return this.inner().details();
    }

    @Override
    public RecommendedActionErrorInfo errorDetails() {
        return this.inner().errorDetails();
    }

    @Override
    public List<RecommendedActionImpactRecord> estimatedImpact() {
        return this.inner().estimatedImpact();
    }

    @Override
    public String executeActionDuration() {
        return this.inner().executeActionDuration();
    }

    @Override
    public RecommendedActionInitiatedBy executeActionInitiatedBy() {
        return this.inner().executeActionInitiatedBy();
    }

    @Override
    public DateTime executeActionInitiatedTime() {
        return this.inner().executeActionInitiatedTime();
    }

    @Override
    public DateTime executeActionStartTime() {
        return this.inner().executeActionStartTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public RecommendedActionImplementationInfo implementationDetails() {
        return this.inner().implementationDetails();
    }

    @Override
    public Boolean isArchivedAction() {
        return this.inner().isArchivedAction();
    }

    @Override
    public Boolean isExecutableAction() {
        return this.inner().isExecutableAction();
    }

    @Override
    public Boolean isRevertableAction() {
        return this.inner().isRevertableAction();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastRefresh() {
        return this.inner().lastRefresh();
    }

    @Override
    public List<String> linkedObjects() {
        return this.inner().linkedObjects();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<RecommendedActionImpactRecord> observedImpact() {
        return this.inner().observedImpact();
    }

    @Override
    public String recommendationReason() {
        return this.inner().recommendationReason();
    }

    @Override
    public String revertActionDuration() {
        return this.inner().revertActionDuration();
    }

    @Override
    public RecommendedActionInitiatedBy revertActionInitiatedBy() {
        return this.inner().revertActionInitiatedBy();
    }

    @Override
    public DateTime revertActionInitiatedTime() {
        return this.inner().revertActionInitiatedTime();
    }

    @Override
    public DateTime revertActionStartTime() {
        return this.inner().revertActionStartTime();
    }

    @Override
    public Integer score() {
        return this.inner().score();
    }

    @Override
    public RecommendedActionStateInfo state() {
        return this.inner().state();
    }

    @Override
    public List<RecommendedActionMetricInfo> timeSeries() {
        return this.inner().timeSeries();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime validSince() {
        return this.inner().validSince();
    }

    @Override
    public RecommendedActionImpl withState(RecommendedActionStateInfo state) {
        this.ustate = state;
        return this;
    }

}
