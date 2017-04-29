# Ff4jpropertyStoreApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clear**](Ff4jpropertyStoreApi.md#clear) | **POST** /ff4j/propertyStore/cache | Clear Cache
[**clearProperties**](Ff4jpropertyStoreApi.md#clearProperties) | **POST** /ff4j/propertyStore/clear | Delete all &lt;b&gt;Properties&lt;/b&gt; in store
[**get**](Ff4jpropertyStoreApi.md#get) | **GET** /ff4j/propertyStore | Display information regarding to &lt;b&gt;Properties&lt;/b&gt;
[**getStatus**](Ff4jpropertyStoreApi.md#getStatus) | **GET** /ff4j/propertyStore/cache | Display information related to &lt;b&gt;Cache&lt;/b&gt;
[**readProperties**](Ff4jpropertyStoreApi.md#readProperties) | **GET** /ff4j/propertyStore/properties | Display information regarding &lt;b&gt;Properties&lt;/b&gt;


<a name="clear"></a>
# **clear**
> clear()

Clear Cache



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStoreApi;


Ff4jpropertyStoreApi apiInstance = new Ff4jpropertyStoreApi();
try {
    apiInstance.clear();
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStoreApi#clear");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="clearProperties"></a>
# **clearProperties**
> FpropertyStoreApiBean clearProperties()

Delete all &lt;b&gt;Properties&lt;/b&gt; in store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStoreApi;


Ff4jpropertyStoreApi apiInstance = new Ff4jpropertyStoreApi();
try {
    FpropertyStoreApiBean result = apiInstance.clearProperties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStoreApi#clearProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FpropertyStoreApiBean**](FpropertyStoreApiBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="get"></a>
# **get**
> get()

Display information regarding to &lt;b&gt;Properties&lt;/b&gt;

other sub resources to be displayed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStoreApi;


Ff4jpropertyStoreApi apiInstance = new Ff4jpropertyStoreApi();
try {
    apiInstance.get();
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStoreApi#get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> CacheApiBean getStatus()

Display information related to &lt;b&gt;Cache&lt;/b&gt;



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStoreApi;


Ff4jpropertyStoreApi apiInstance = new Ff4jpropertyStoreApi();
try {
    CacheApiBean result = apiInstance.getStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStoreApi#getStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CacheApiBean**](CacheApiBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readProperties"></a>
# **readProperties**
> readProperties()

Display information regarding &lt;b&gt;Properties&lt;/b&gt;



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jpropertyStoreApi;


Ff4jpropertyStoreApi apiInstance = new Ff4jpropertyStoreApi();
try {
    apiInstance.readProperties();
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jpropertyStoreApi#readProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

