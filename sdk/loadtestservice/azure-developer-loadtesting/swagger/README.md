## Generate autorest code

```yaml
input-file: https://raw.githubusercontent.com/Azure/azure-rest-api-specs/main/specification/loadtestservice/data-plane/Microsoft.LoadTestService/preview/2022-06-01-preview/loadtestservice.json
java: true
output-folder: ..\
generate-client-as-impl: true
namespace: com.azure.developer.loadtesting
generate-client-interfaces: false
sync-methods: all
license-header: MICROSOFT_MIT_SMALL
add-context-parameter: true
context-client-method-parameter: true
service-interface-as-public: true
custom-strongly-typed-header-deserialization: true
generic-response-type: true
custom-types-subpackage: models
```
