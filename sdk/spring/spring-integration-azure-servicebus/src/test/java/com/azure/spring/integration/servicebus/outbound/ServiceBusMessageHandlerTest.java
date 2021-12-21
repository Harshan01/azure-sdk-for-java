// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus.outbound;

import com.azure.spring.integration.handler.DefaultMessageHandler;
import com.azure.spring.integration.handler.DefaultMessageHandlerTests;
import com.azure.spring.messaging.PartitionSupplier;
import com.azure.spring.servicebus.core.ServiceBusTemplate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.springframework.messaging.Message;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceBusMessageHandlerTest extends DefaultMessageHandlerTests<ServiceBusTemplate> {

    private AutoCloseable closeable;

    @BeforeEach
    @Override
    @SuppressWarnings("unchecked")
    public void setUp() {
        this.closeable = MockitoAnnotations.openMocks(this);
        this.sendOperation = mock(ServiceBusTemplate.class);
        when(this.sendOperation.sendAsync(eq(this.destination), isA(Message.class),
                                          isA(PartitionSupplier.class))).thenReturn(mono);
        when(
            this.sendOperation.sendAsync(eq(this.dynamicDestination), isA(Message.class), isA(PartitionSupplier.class)))
            .thenReturn(mono);
        this.handler = new DefaultMessageHandler(this.destination, this.sendOperation);
    }

    @AfterEach
    public void close() throws Exception {
        closeable.close();
    }
}
