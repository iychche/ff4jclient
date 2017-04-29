# Ff4jstoregroupsgroupNameApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operationDisableGroup**](Ff4jstoregroupsgroupNameApi.md#operationDisableGroup) | **POST** /ff4j/store/groups/{groupName}/disable | Disable a group
[**operationEnable**](Ff4jstoregroupsgroupNameApi.md#operationEnable) | **POST** /ff4j/store/groups/{groupName}/enable | Enable a group
[**read**](Ff4jstoregroupsgroupNameApi.md#read) | **GET** /ff4j/store/groups/{groupName} | Read information about a group


<a name="operationDisableGroup"></a>
# **operationDisableGroup**
> operationDisableGroup(groupName)

Disable a group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoregroupsgroupNameApi;


Ff4jstoregroupsgroupNameApi apiInstance = new Ff4jstoregroupsgroupNameApi();
String groupName = "groupName_example"; // String | 
try {
    apiInstance.operationDisableGroup(groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoregroupsgroupNameApi#operationDisableGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="operationEnable"></a>
# **operationEnable**
> operationEnable(groupName)

Enable a group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoregroupsgroupNameApi;


Ff4jstoregroupsgroupNameApi apiInstance = new Ff4jstoregroupsgroupNameApi();
String groupName = "groupName_example"; // String | 
try {
    apiInstance.operationEnable(groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoregroupsgroupNameApi#operationEnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> read(groupName)

Read information about a group



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoregroupsgroupNameApi;


Ff4jstoregroupsgroupNameApi apiInstance = new Ff4jstoregroupsgroupNameApi();
String groupName = "groupName_example"; // String | 
try {
    apiInstance.read(groupName);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoregroupsgroupNameApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

