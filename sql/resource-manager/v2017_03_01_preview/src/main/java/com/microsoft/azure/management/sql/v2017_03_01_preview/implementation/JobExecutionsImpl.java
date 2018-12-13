/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobExecutions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobAgentServerJobExecution;
import rx.Completable;
import java.util.UUID;

class JobExecutionsImpl extends WrapperImpl<JobExecutionsInner> implements JobExecutions {
    private final SqlManager manager;

    JobExecutionsImpl(SqlManager manager) {
        super(manager.inner().jobExecutions());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public JobAgentServerJobExecutionImpl defineExecution(String name) {
        return wrapExecutionModel(name);
    }

    private JobAgentServerJobExecutionImpl wrapExecutionModel(String name) {
        return new JobAgentServerJobExecutionImpl(name, this.manager());
    }

    private JobAgentServerJobExecutionImpl wrapJobAgentServerJobExecutionModel(JobExecutionInner inner) {
        return  new JobAgentServerJobExecutionImpl(inner, manager());
    }

    @Override
    public Observable<JobAgentServerJobExecution> listByAgentAsync(final String resourceGroupName, final String serverName, final String jobAgentName) {
        JobExecutionsInner client = this.inner();
        return client.listByAgentAsync(resourceGroupName, serverName, jobAgentName)
        .flatMapIterable(new Func1<Page<JobExecutionInner>, Iterable<JobExecutionInner>>() {
            @Override
            public Iterable<JobExecutionInner> call(Page<JobExecutionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobExecutionInner, JobAgentServerJobExecution>() {
            @Override
            public JobAgentServerJobExecution call(JobExecutionInner inner) {
                return wrapJobAgentServerJobExecutionModel(inner);
            }
        });
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        JobExecutionsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId).toCompletable();
    }

    @Override
    public Observable<JobAgentServerJobExecution> listByJobAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName) {
        JobExecutionsInner client = this.inner();
        return client.listByJobAsync(resourceGroupName, serverName, jobAgentName, jobName)
        .flatMapIterable(new Func1<Page<JobExecutionInner>, Iterable<JobExecutionInner>>() {
            @Override
            public Iterable<JobExecutionInner> call(Page<JobExecutionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobExecutionInner, JobAgentServerJobExecution>() {
            @Override
            public JobAgentServerJobExecution call(JobExecutionInner inner) {
                return new JobAgentServerJobExecutionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<JobAgentServerJobExecution> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        JobExecutionsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId)
        .map(new Func1<JobExecutionInner, JobAgentServerJobExecution>() {
            @Override
            public JobAgentServerJobExecution call(JobExecutionInner inner) {
                return new JobAgentServerJobExecutionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<JobAgentServerJobExecution> createAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        JobExecutionsInner client = this.inner();
        return client.createAsync(resourceGroupName, serverName, jobAgentName, jobName)
        .map(new Func1<JobExecutionInner, JobAgentServerJobExecution>() {
            @Override
            public JobAgentServerJobExecution call(JobExecutionInner inner) {
                return new JobAgentServerJobExecutionImpl(inner, manager());
            }
        });
    }

}
