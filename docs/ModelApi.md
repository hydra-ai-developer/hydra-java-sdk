# ModelApi

All URIs are relative to *https://api.hydra.ai/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateModel**](ModelApi.md#activateModel) | **PUT** /workspaces/{workspaceId}/models/{modelId}/activate | Activate model
[**addTrainingData**](ModelApi.md#addTrainingData) | **POST** /workspaces/{workspaceId}/models/{modelId}/data | Add a training data object for a model
[**createModel**](ModelApi.md#createModel) | **POST** /workspaces/{workspaceId}/models | Create a new model in the workspace
[**deactivateModel**](ModelApi.md#deactivateModel) | **PUT** /workspaces/{workspaceId}/models/{modelId}/deactivate | Deactivate model
[**deleteModel**](ModelApi.md#deleteModel) | **DELETE** /workspaces/{workspaceId}/models/{modelId}/delete | Delete model
[**predict**](ModelApi.md#predict) | **POST** /workspaces/{workspaceId}/models/{modelId}/predict | Make a prediction using a model
[**showModelStats**](ModelApi.md#showModelStats) | **POST** /workspaces/{workspaceId}/models/{modelId}/stats | Shows model stats
[**trainModel**](ModelApi.md#trainModel) | **POST** /workspaces/{workspaceId}/models/{modelId}/train | Submit model for training


<a name="activateModel"></a>
# **activateModel**
> ModelApiResponse activateModel(workspaceId, modelId)

Activate model

Activate model

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="addTrainingData"></a>
# **addTrainingData**
> ModelApiResponse addTrainingData(workspaceId, modelId, trainingData)

Add a training data object for a model

Create a new model in the workspace identified in the workspaceId path paramter.

### Example
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
    TrainingData trainingData = new TrainingData(); // TrainingData | 
    try {
      ModelApiResponse result = apiInstance.addTrainingData(workspaceId, modelId, trainingData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#addTrainingData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |
 **trainingData** | [**TrainingData**](TrainingData.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | successful operation |  -  |

<a name="createModel"></a>
# **createModel**
> ModelApiResponse createModel(workspaceId, model)

Create a new model in the workspace

Create a new model in the workspace identified in the workspaceId path paramter.

### Example
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
    Model model = new Model(); // Model | 
    try {
      ModelApiResponse result = apiInstance.createModel(workspaceId, model);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#createModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **model** | [**Model**](Model.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | successful operation |  -  |

<a name="deactivateModel"></a>
# **deactivateModel**
> ModelApiResponse deactivateModel(workspaceId, modelId)

Deactivate model

Deactivate model

### Example
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
      ModelApiResponse result = apiInstance.deactivateModel(workspaceId, modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#deactivateModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="deleteModel"></a>
# **deleteModel**
> ModelApiResponse deleteModel(workspaceId, modelId)

Delete model

Delete model

### Example
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
      ModelApiResponse result = apiInstance.deleteModel(workspaceId, modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#deleteModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="predict"></a>
# **predict**
> ModelApiResponse predict(workspaceId, modelId, predictionRequest)

Make a prediction using a model

Create anew model in the workspace identified in the workspaceId path paramter.

### Example
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
    PredictionRequest predictionRequest = new PredictionRequest(); // PredictionRequest | 
    try {
      ModelApiResponse result = apiInstance.predict(workspaceId, modelId, predictionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#predict");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |
 **predictionRequest** | [**PredictionRequest**](PredictionRequest.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="showModelStats"></a>
# **showModelStats**
> ModelApiResponse showModelStats(workspaceId, modelId)

Shows model stats

Shows the model score and last training time

### Example
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
      ModelApiResponse result = apiInstance.showModelStats(workspaceId, modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#showModelStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="trainModel"></a>
# **trainModel**
> ModelApiResponse trainModel(workspaceId, modelId)

Submit model for training

Submit the model for training using the provided training data

### Example
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
      ModelApiResponse result = apiInstance.trainModel(workspaceId, modelId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelApi#trainModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workspaceId** | **String**| Workspace ID |
 **modelId** | **String**| Model ID |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apiAuth](../README.md#apiAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | successful operation |  -  |

