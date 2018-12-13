/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseConnectionPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2014_04_01.DatabaseConnectionPolicy;

class DatabaseConnectionPoliciesImpl extends WrapperImpl<DatabaseConnectionPoliciesInner> implements DatabaseConnectionPolicies {
    private final SqlManager manager;

    DatabaseConnectionPoliciesImpl(SqlManager manager) {
        super(manager.inner().databaseConnectionPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public DatabaseConnectionPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private DatabaseConnectionPolicyImpl wrapModel(DatabaseConnectionPolicyInner inner) {
        return  new DatabaseConnectionPolicyImpl(inner, manager());
    }

    private DatabaseConnectionPolicyImpl wrapModel(String name) {
        return new DatabaseConnectionPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<DatabaseConnectionPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabaseConnectionPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<DatabaseConnectionPolicyInner, DatabaseConnectionPolicy>() {
            @Override
            public DatabaseConnectionPolicy call(DatabaseConnectionPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
