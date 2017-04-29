# Ff4jstorefeaturesuidApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFeature**](Ff4jstorefeaturesuidApi.md#deleteFeature) | **DELETE** /ff4j/store/features/{uid} | Delete a feature
[**operationAddGroup**](Ff4jstorefeaturesuidApi.md#operationAddGroup) | **POST** /ff4j/store/features/{uid}/addGroup/{groupName} | Define the group of the feature
[**operationDisable**](Ff4jstorefeaturesuidApi.md#operationDisable) | **POST** /ff4j/store/features/{uid}/disable | Disable a feature
[**operationEnable**](Ff4jstorefeaturesuidApi.md#operationEnable) | **POST** /ff4j/store/features/{uid}/enable | Enable a feature
[**operationGrantRole**](Ff4jstorefeaturesuidApi.md#operationGrantRole) | **POST** /ff4j/store/features/{uid}/grantrole/{role} | Grant a permission on a feature
[**operationRemoveGroup**](Ff4jstorefeaturesuidApi.md#operationRemoveGroup) | **POST** /ff4j/store/features/{uid}/removeGroup/{groupName} | Remove the group of the feature
[**operationRemoveRole**](Ff4jstorefeaturesuidApi.md#operationRemoveRole) | **POST** /ff4j/store/features/{uid}/removerole/{role} | Remove a permission on a feature
[**read**](Ff4jstorefeaturesuidApi.md#read) | **GET** /ff4j/store/features/{uid} | Read information about a feature
[**upsertFeature**](Ff4jstorefeaturesuidApi.md#upsertFeature) | **PUT** /ff4j/store/features/{uid} | Create of update a feature


<a name="deleteFeature"></a>
# **deleteFeature**
> deleteFeature(uid)

Delete a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
try {
    apiInstance.deleteFeature(uid);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#deleteFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="operationAddGroup"></a>
# **operationAddGroup**
> operationAddGroup(uid, groupName)

Define the group of the feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
String groupName = "groupName_example"; // String | 
try {
    apiInstance.operationAddGroup(uid, groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#operationAddGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationDisable"></a>
# **operationDisable**
> operationDisable(uid)

Disable a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
try {
    apiInstance.operationDisable(uid);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#operationDisable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationEnable"></a>
# **operationEnable**
> operationEnable(uid)

Enable a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
try {
    apiInstance.operationEnable(uid);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#operationEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationGrantRole"></a>
# **operationGrantRole**
> operationGrantRole(uid, role)

Grant a permission on a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
String role = "role_example"; // String | 
try {
    apiInstance.operationGrantRole(uid, role);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#operationGrantRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **role** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationRemoveGroup"></a>
# **operationRemoveGroup**
> operationRemoveGroup(uid, groupName)

Remove the group of the feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
String groupName = "groupName_example"; // String | 
try {
    apiInstance.operationRemoveGroup(uid, groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#operationRemoveGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationRemoveRole"></a>
# **operationRemoveRole**
> operationRemoveRole(uid, role)

Remove a permission on a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
String role = "role_example"; // String | 
try {
    apiInstance.operationRemoveRole(uid, role);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#operationRemoveRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **role** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> read(uid)

Read information about a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
try {
    apiInstance.read(uid);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upsertFeature"></a>
# **upsertFeature**
> upsertFeature(uid, body)

Create of update a feature



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstorefeaturesuidApi;


Ff4jstorefeaturesuidApi apiInstance = new Ff4jstorefeaturesuidApi();
String uid = "uid_example"; // String | 
FeatureApiBean body = new FeatureApiBean(); // FeatureApiBean | 
try {
    apiInstance.upsertFeature(uid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstorefeaturesuidApi#upsertFeature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**|  |
 **body** | [**FeatureApiBean**](FeatureApiBean.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

