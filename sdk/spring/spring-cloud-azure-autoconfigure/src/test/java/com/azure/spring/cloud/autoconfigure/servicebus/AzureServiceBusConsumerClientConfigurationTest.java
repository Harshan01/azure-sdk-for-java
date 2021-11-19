// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.servicebus;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusReceiverClient;
import com.azure.messaging.servicebus.ServiceBusSessionReceiverClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static com.azure.spring.cloud.autoconfigure.servicebus.ServiceBusTestUtils.CONNECTION_STRING;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AzureServiceBusConsumerClientConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(AzureServiceBusConsumerClientConfiguration.class));

    @Test
    void noQueueNameOrTopicNameProvidedShouldNotConfigure() {
        contextRunner.run(context -> assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.class));
    }

    @Test
    void entityTypeProvidedShouldNotConfigure() {
        ServiceBusClientBuilder serviceBusClientBuilder = new ServiceBusClientBuilder();
        serviceBusClientBuilder.connectionString(String.format(CONNECTION_STRING, "test-namespace"));

        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.entity-type=queue",
                "spring.cloud.azure.servicebus.consumer.entity-type=queue"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .withBean(ServiceBusClientBuilder.class, () -> serviceBusClientBuilder)
            .run(context -> {
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.class);
            });
    }

    @Test
    void entityNameProvidedShouldNotConfigure() {
        ServiceBusClientBuilder serviceBusClientBuilder = new ServiceBusClientBuilder();
        serviceBusClientBuilder.connectionString(String.format(CONNECTION_STRING, "test-namespace"));

        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.entity-name=test-queue",
                "spring.cloud.azure.servicebus.consumer.entity-name=test-queue"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .withBean(ServiceBusClientBuilder.class, () -> serviceBusClientBuilder)
            .run(context -> {
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.NoneSessionConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.SessionConsumerClientConfiguration.class);
            });
    }

    @Test
    void queueNameProvidedShouldConfigure() {
        ServiceBusClientBuilder serviceBusClientBuilder = new ServiceBusClientBuilder();
        serviceBusClientBuilder.connectionString(String.format(CONNECTION_STRING, "test-namespace"));

        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.entity-name=test-queue",
                "spring.cloud.azure.servicebus.entity-type=queue"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .withBean(ServiceBusClientBuilder.class, () -> serviceBusClientBuilder)
            .run(context -> {
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.NoneSessionConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.SessionConsumerClientConfiguration.class);
            });
    }

    @Test
    void subscriptionNameProvidedShouldConfigure() {
        ServiceBusClientBuilder serviceBusClientBuilder = new ServiceBusClientBuilder();
        serviceBusClientBuilder.connectionString(String.format(CONNECTION_STRING, "test-namespace"));

        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.consumer.entity-name=test-topic",
                "spring.cloud.azure.servicebus.consumer.subscription-name=test-sub",
                "spring.cloud.azure.servicebus.consumer.entity-type=topic"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .withBean(ServiceBusClientBuilder.class, () -> serviceBusClientBuilder)
            .run(context -> {
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.NoneSessionConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.SessionConsumerClientConfiguration.class);
            });
    }

    @Test
    void subscriptionNameProvidedShouldNotConfigure() {
        ServiceBusClientBuilder serviceBusClientBuilder = new ServiceBusClientBuilder();
        serviceBusClientBuilder.connectionString(String.format(CONNECTION_STRING, "test-namespace"));

        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.consumer.entity-name=test-topic",
                "spring.cloud.azure.servicebus.consumer.entity-type=topic"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .withBean(ServiceBusClientBuilder.class, () -> serviceBusClientBuilder)
            .run(context -> assertThrows(IllegalStateException.class, () -> context.getBean(AzureServiceBusConsumerClientConfiguration.class)));
    }

    @Test
    void dedicatedConnectionInfoProvidedShouldConfigureDedicated() {
        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.consumer.entity-name=test-queue",
                "spring.cloud.azure.servicebus.consumer.entity-type=queue",
                "spring.cloud.azure.servicebus.consumer.connection-string=" + String.format(CONNECTION_STRING, "test-namespace")
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .run(context -> {
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.NoneSessionConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.SessionConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(ServiceBusReceiverClient.class);
            });
    }

    @Test
    void sessionAwareEnabledShouldConfigureSession() {
        ServiceBusClientBuilder serviceBusClientBuilder = new ServiceBusClientBuilder();
        serviceBusClientBuilder.connectionString(String.format(CONNECTION_STRING, "test-namespace"));

        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.entity-name=test-queue",
                "spring.cloud.azure.servicebus.entity-type=queue",
                "spring.cloud.azure.servicebus.consumer.session-enabled=true"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .withBean(ServiceBusClientBuilder.class, () -> serviceBusClientBuilder)
            .run(context -> {
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.SessionConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.NoneSessionConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(ServiceBusSessionReceiverClient.class);
                assertThat(context).doesNotHaveBean(ServiceBusReceiverClient.class);
            });
    }

    @Test
    void sessionAwareEnabledWithDedicatedConnectionShouldConfigureSession() {
        contextRunner
            .withPropertyValues(
                "spring.cloud.azure.servicebus.consumer.entity-name=test-queue",
                "spring.cloud.azure.servicebus.consumer.entity-type=queue",
                "spring.cloud.azure.servicebus.consumer.connection-string=" + String.format(CONNECTION_STRING, "test-namespace"),
                "spring.cloud.azure.servicebus.consumer.session-enabled=true"
            )
            .withUserConfiguration(AzureServiceBusPropertiesTestConfiguration.class)
            .run(context -> {
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(AzureServiceBusConsumerClientConfiguration.SessionConsumerClientConfiguration.class);
                assertThat(context).doesNotHaveBean(AzureServiceBusConsumerClientConfiguration.NoneSessionConsumerClientConfiguration.class);
                assertThat(context).hasSingleBean(ServiceBusSessionReceiverClient.class);
                assertThat(context).doesNotHaveBean(ServiceBusReceiverClient.class);
            });
    }

}
