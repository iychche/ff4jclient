# Ff4jstoreApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clear**](Ff4jstoreApi.md#clear) | **POST** /ff4j/store/cache | Clear Cache
[**clearFeatures**](Ff4jstoreApi.md#clearFeatures) | **POST** /ff4j/store/clear | Delete all &lt;b&gt;Features&lt;/b&gt; in store
[**get**](Ff4jstoreApi.md#get) | **GET** /ff4j/store | Display information regarding to &lt;b&gt;Features&lt;/b&gt;
[**getStatus**](Ff4jstoreApi.md#getStatus) | **GET** /ff4j/store/cache | Display information related to &lt;b&gt;Cache&lt;/b&gt;
[**readFeatures**](Ff4jstoreApi.md#readFeatures) | **GET** /ff4j/store/features | Display information regarding &lt;b&gt;Features&lt;/b&gt;
[**readGroups**](Ff4jstoreApi.md#readGroups) | **GET** /ff4j/store/groups | Display information regarding &lt;b&gt;Groups&lt;/b&gt;


<a name="clear"></a>
# **clear**
> clear()

Clear Cache



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoreApi;


Ff4jstoreApi apiInstance = new Ff4jstoreApi();
try {
    apiInstance.clear();
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoreApi#clear");
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

<a name="clearFeatures"></a>
# **clearFeatures**
> FeatureStoreApiBean clearFeatures()

Delete all &lt;b&gt;Features&lt;/b&gt; in store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoreApi;


Ff4jstoreApi apiInstance = new Ff4jstoreApi();
try {
    FeatureStoreApiBean result = apiInstance.clearFeatures();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoreApi#clearFeatures");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FeatureStoreApiBean**](FeatureStoreApiBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="get"></a>
# **get**
> get()

Display information regarding to &lt;b&gt;Features&lt;/b&gt;

other sub resources to be displayed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoreApi;


Ff4jstoreApi apiInstance = new Ff4jstoreApi();
try {
    apiInstance.get();
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoreApi#get");
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
//import io.swagger.client.api.Ff4jstoreApi;


Ff4jstoreApi apiInstance = new Ff4jstoreApi();
try {
    CacheApiBean result = apiInstance.getStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoreApi#getStatus");
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

<a name="readFeatures"></a>
# **readFeatures**
> readFeatures()

Display information regarding &lt;b&gt;Features&lt;/b&gt;



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoreApi;


Ff4jstoreApi apiInstance = new Ff4jstoreApi();
try {
    apiInstance.readFeatures();
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoreApi#readFeatures");
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

<a name="readGroups"></a>
# **readGroups**
> GroupDescApiBean readGroups()

Display information regarding &lt;b&gt;Groups&lt;/b&gt;



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jstoreApi;


Ff4jstoreApi apiInstance = new Ff4jstoreApi();
try {
    GroupDescApiBean result = apiInstance.readGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jstoreApi#readGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupDescApiBean**](GroupDescApiBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

