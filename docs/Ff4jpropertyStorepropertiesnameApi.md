# Ff4jpropertyStorepropertiesnameApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProperty**](Ff4jpropertyStorepropertiesnameApi.md#deleteProperty) | **DELETE** /ff4j/propertyStore/properties/{name} | Delete a Property
[**operationUpdate**](Ff4jpropertyStorepropertiesnameApi.md#operationUpdate) | **POST** /ff4j/propertyStore/properties/{name}/update | Update a property
[**read**](Ff4jpropertyStorepropertiesnameApi.md#read) | **GET** /ff4j/propertyStore/properties/{name} | Read information about a Property
[**upsertProperty**](Ff4jpropertyStorepropertiesnameApi.md#upsertProperty) | **PUT** /ff4j/propertyStore/properties/{name} | Create of update a Property


<a name="deleteProperty"></a>
# **deleteProperty**
> deleteProperty(name)

Delete a Property



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStorepropertiesnameApi;


Ff4jpropertyStorepropertiesnameApi apiInstance = new Ff4jpropertyStorepropertiesnameApi();
String name = "name_example"; // String | 
try {
    apiInstance.deleteProperty(name);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStorepropertiesnameApi#deleteProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="operationUpdate"></a>
# **operationUpdate**
> operationUpdate(name)

Update a property



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStorepropertiesnameApi;


Ff4jpropertyStorepropertiesnameApi apiInstance = new Ff4jpropertyStorepropertiesnameApi();
String name = "name_example"; // String | 
try {
    apiInstance.operationUpdate(name);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStorepropertiesnameApi#operationUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> read(name)

Read information about a Property



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStorepropertiesnameApi;


Ff4jpropertyStorepropertiesnameApi apiInstance = new Ff4jpropertyStorepropertiesnameApi();
String name = "name_example"; // String | 
try {
    apiInstance.read(name);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStorepropertiesnameApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upsertProperty"></a>
# **upsertProperty**
> upsertProperty(name, body)

Create of update a Property



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStorepropertiesnameApi;


Ff4jpropertyStorepropertiesnameApi apiInstance = new Ff4jpropertyStorepropertiesnameApi();
String name = "name_example"; // String | 
PropertyApiBean body = new PropertyApiBean(); // PropertyApiBean | 
try {
    apiInstance.upsertProperty(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStorepropertiesnameApi#upsertProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**PropertyApiBean**](PropertyApiBean.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

