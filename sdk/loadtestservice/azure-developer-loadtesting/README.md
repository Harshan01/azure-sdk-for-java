# Azure Developer LoadTesting client library for Java

Azure Developer LoadTesting client library for Java.

This package contains Microsoft Azure Developer LoadTesting client library.

## Documentation

Various documentation is available to help you get started

- [API reference documentation][docs]
- [Product documentation][product_documentation]

## Getting started

### Prerequisites

- [Java Development Kit (JDK)][jdk] with version 8 or above
- [Azure Subscription][azure_subscription]

### Adding the package to your product

[//]: # ({x-version-update-start;com.azure:azure-developer-loadtesting;current})
```xml
<dependency>
    <groupId>com.azure</groupId>
    <artifactId>azure-developer-loadtesting</artifactId>
    <version>1.0.0-beta.1</version>
</dependency>
```
[//]: # ({x-version-update-end})

### Authentication

[Azure Identity][azure_identity] package provides the default implementation for authenticating the client.

By default, Azure Active Directory token authentication depends on correct configure of following environment variables.

- `AZURE_CLIENT_ID` for Azure client ID.
- `AZURE_TENANT_ID` for Azure tenant ID.
- `AZURE_CLIENT_SECRET` or `AZURE_CLIENT_CERTIFICATE_PATH` for client secret or client certificate.

In addition, Azure subscription ID can be configured via environment variable `AZURE_SUBSCRIPTION_ID`.

With above configuration, `azure` client can be authenticated by following code:

```java
AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);
TokenCredential credential = new DefaultAzureCredentialBuilder()
    .authorityHost(profile.getEnvironment().getActiveDirectoryEndpoint())
    .build();
TestClientBuilder testClientBuilder = new TestClientBuilder();
TestClient testClient = testClientBuilder
    .credential(credential)
    .endpoint("<Enter Azure Load Testing Data-Plane URL>")
    .buildClient();
```

The sample code assumes global Azure. Please change `AzureEnvironment.AZURE` variable if otherwise.

Authentication in this SDK is similar to Azure Management Libraries. See [Authentication][authenticate] for more options.

An important distinction is that Azure Management libraries use `authenticate` method to accept credential along with Azure profile, where this SDK uses `credential` method and only accept the credential parameter.

## Key concepts

The following components make up the Azure Load Testing Service. The Azure Load Test client library for Python allows you to interact with each of these components through the use of a dedicated client object.

### Load testing resource

The Load testing resource is the top-level resource for your load-testing activities. This resource provides a centralized place to view and manage load tests, test results, and related artifacts. A load testing resource contains zero or more load tests.

### Test

A test specifies the test script, and configuration settings for running a load test. You can create one or more tests in an Azure Load Testing resource.

### Test Engine

A test engine is computing infrastructure that runs the Apache JMeter test script. You can scale out your load test by configuring the number of test engines. The test script runs in parallel across the specified number of test engines.

### Test Run

A test run represents one execution of a load test. It collects the logs associated with running the Apache JMeter script, the load test YAML configuration, the list of app components to monitor, and the results of the test.

### App Component

When you run a load test for an Azure-hosted application, you can monitor resource metrics for the different Azure application components (server-side metrics). While the load test runs, and after completion of the test, you can monitor and analyze the resource metrics in the Azure Load Testing dashboard.

### Metrics

During a load test, Azure Load Testing collects metrics about the test execution. There are two types of metrics:

1. Client-side metrics give you details reported by the test engine. These metrics include the number of virtual users, the request response time, the number of failed requests, or the number of requests per second.

2. Server-side metrics are available for Azure-hosted applications and provide information about your Azure application components. Metrics can be for the number of database reads, the type of HTTP responses, or container resource consumption.

## Examples

### Creating a Load Test

```java com.azure.developer.loadtesting.readme
import java.util.HashMap;
import java.util.Map;
import com.azure.identity.*;
import com.azure.developer.loadtesting.*;
import com.azure.developer.loadtesting.models.*;

public class CreateTest {
    public static void main( String[] args )
    {
        TestClientBuilder testClientBuilder = new TestClientBuilder();
        TestClient testClient = testClientBuilder
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint("<endpoint>")
            .buildClient();
        
        TestModel test = new TestModel()
            .setDisplayName("Sample Display Name")
            .setDescription("Sample Test Description")
            .setLoadTestConfig(new LoadTestConfig()
                .setEngineInstances(1))
            .setEnvironmentVariables(new HashMap<String, String>(
                Map.of("k1", "v1", "k2", "v2")
            ));

        TestModel testOut = testClient.createOrUpdateTest("test12345", test, null);
        System.out.println(testOut.getTestId());
    }
}
```

### Uploading .jmx file to a Test

```java com.azure.developer.loadtesting.readme
import java.io.File;
import com.azure.identity.*;
import com.azure.core.util.*;
import com.azure.developer.loadtesting.*;
import com.azure.developer.loadtesting.models.*;

public class UploadTestFile {
    public static void main(String[] args) {
        TestClientBuilder testClientBuilder = new TestClientBuilder();
        TestClient testClient = testClientBuilder
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint("<endpoint>")
            .buildClient();
        
        BinaryData fileData = BinaryData.fromFile(new File("path/to/file").toPath());

        FileUrl fileUrlOut = testClient.uploadTestFile("test12345", "file12345", "sample-file.jmx", fileData, null);
        System.out.println(fileUrlOut.getValidationStatus());
    }
}

```

### Running a Test

```java com.azure.developer.loadtesting.readme
import com.azure.identity.*;
import com.azure.developer.loadtesting.*;
import com.azure.developer.loadtesting.models.*;

public class CreateTestRun {
    public static void main( String[] args )
    {
        TestRunClientBuilder testRunClientBuilder = new TestRunClientBuilder();
        TestRunClient testRunClient = testRunClientBuilder
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint("<endpoint>")
            .buildClient();
        
        TestRunModel testRun = new TestRunModel()
            .setTestId("test12345")
            .setDisplayName("Sample Test Run")
            .setLoadTestConfig(new LoadTestConfig()
                .setEngineInstances(2)
            );

        TestRunModel testRunOut = testRunClient.createAndUpdateTest("testrun12345", testRun, null);
        System.out.println(testRunOut.getStatus());
    }
}
```

## Troubleshooting

## Next steps

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Azure/azure-sdk-for-java/blob/main/CONTRIBUTING.md).

1. Fork it
1. Create your feature branch (`git checkout -b my-new-feature`)
1. Commit your changes (`git commit -am 'Add some feature'`)
1. Push to the branch (`git push origin my-new-feature`)
1. Create new Pull Request

<!-- LINKS -->
[product_documentation]: https://azure.microsoft.com/services/
[docs]: https://azure.github.io/azure-sdk-for-java/
[jdk]: https://docs.microsoft.com/java/azure/jdk/
[azure_subscription]: https://azure.microsoft.com/free/
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/identity/azure-identity
[authenticate]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/resourcemanager/docs/AUTH.md
