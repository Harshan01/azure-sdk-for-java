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
import com.microsoft.azure.management.sql.v2014_04_01.ServerAzureADAdministrators;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.ServerAzureADAdministrator;

class ServerAzureADAdministratorsImpl extends WrapperImpl<ServerAzureADAdministratorsInner> implements ServerAzureADAdministrators {
    private final SqlManager manager;

    ServerAzureADAdministratorsImpl(SqlManager manager) {
        super(manager.inner().serverAzureADAdministrators());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ServerAzureADAdministratorImpl define(String name) {
        return wrapModel(name);
    }

    private ServerAzureADAdministratorImpl wrapModel(ServerAzureADAdministratorInner inner) {
        return  new ServerAzureADAdministratorImpl(inner, manager());
    }

    private ServerAzureADAdministratorImpl wrapModel(String name) {
        return new ServerAzureADAdministratorImpl(name, this.manager());
    }

    @Override
    public Observable<ServerAzureADAdministrator> listByServerAsync(String resourceGroupName, String serverName) {
        ServerAzureADAdministratorsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ServerAzureADAdministratorInner>, Observable<ServerAzureADAdministratorInner>>() {
            @Override
            public Observable<ServerAzureADAdministratorInner> call(List<ServerAzureADAdministratorInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ServerAzureADAdministratorInner, ServerAzureADAdministrator>() {
            @Override
            public ServerAzureADAdministrator call(ServerAzureADAdministratorInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServerAzureADAdministrator> getAsync(String resourceGroupName, String serverName) {
        ServerAzureADAdministratorsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName)
        .map(new Func1<ServerAzureADAdministratorInner, ServerAzureADAdministrator>() {
            @Override
            public ServerAzureADAdministrator call(ServerAzureADAdministratorInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName) {
        ServerAzureADAdministratorsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName).toCompletable();
    }

}
