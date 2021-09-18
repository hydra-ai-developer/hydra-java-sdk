# hydra-java-sdk

hydra.ai API
- API version: 1.0.0
  - Build date: 2021-09-18T20:44:59.687577Z[Etc/UTC]

hydra.ai makes it easy to use A.I. inside workflows and your apps. You can use hydra.ai for text classification, named entity recognition and senitment analysis. You can create your own A.I. models or use some of our pre-built models.

This API supports creating, training and invoking A.I. models hosted in your hydra.ai workspace. Create an account at https://build.hydra.ai to get started. You get get your API key in the settings section.    

  For more information, please visit [https://www.hydra.ai](https://www.hydra.ai)

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>ai.hydra</groupId>
  <artifactId>hydra-java-sdk</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ai.hydra:hydra-java-sdk:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hydra-java-sdk-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import ai.hydra.client.ApiClient;
import ai.hydra.client.ApiException;
import ai.hydra.client.Configuration;
import ai.hydra.client.auth.*;
import ai.hydra.client.models.*;
import ai.hydra.api.ModelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hydra.ai/v1");
    
    // Configure API key authorization: apiAuth
    ApiKeyAuth apiAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiAuth");
    apiAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiAuth.setApiKeyPrefix("Token");

    ModelApi apiInstance = new ModelApi(defaultClient);
    String workspaceId = "workspaceId_example"; // String | Workspace ID
    String modelId = "modelId_example"; // String | Model ID
    try {
      ModelApiResponse result = apiInstance.activateModel(workspaceId, modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#activateModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.hydra.ai/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ModelApi* | [**activateModel**](docs/ModelApi.md#activateModel) | **PUT** /workspaces/{workspaceId}/models/{modelId}/activate | Activate model
*ModelApi* | [**addTrainingData**](docs/ModelApi.md#addTrainingData) | **POST** /workspaces/{workspaceId}/models/{modelId}/data | Add a training data object for a model
*ModelApi* | [**createModel**](docs/ModelApi.md#createModel) | **POST** /workspaces/{workspaceId}/models | Create a new model in the workspace
*ModelApi* | [**deactivateModel**](docs/ModelApi.md#deactivateModel) | **PUT** /workspaces/{workspaceId}/models/{modelId}/deactivate | Deactivate model
*ModelApi* | [**deleteModel**](docs/ModelApi.md#deleteModel) | **DELETE** /workspaces/{workspaceId}/models/{modelId}/delete | Delete model
*ModelApi* | [**predict**](docs/ModelApi.md#predict) | **POST** /workspaces/{workspaceId}/models/{modelId}/predict | Make a prediction using a model
*ModelApi* | [**showModelStats**](docs/ModelApi.md#showModelStats) | **POST** /workspaces/{workspaceId}/models/{modelId}/stats | Shows model stats
*ModelApi* | [**trainModel**](docs/ModelApi.md#trainModel) | **POST** /workspaces/{workspaceId}/models/{modelId}/train | Submit model for training


## Documentation for Models

 - [Label](docs/Label.md)
 - [LabelConfig](docs/LabelConfig.md)
 - [Model](docs/Model.md)
 - [ModelApiResponse](docs/ModelApiResponse.md)
 - [PredictionRequest](docs/PredictionRequest.md)
 - [TrainingData](docs/TrainingData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@hydra.ai

