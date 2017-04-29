# Ff4jApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check**](Ff4jApi.md#check) | **GET** /ff4j/check/{uid} | &lt;b&gt;Simple check&lt;/b&gt; feature toggle
[**checkPOST**](Ff4jApi.md#checkPOST) | **POST** /ff4j/check/{uid} | &lt;b&gt;Advanced check&lt;/b&gt; feature toggle (parameterized)
[**getSecurityStatus**](Ff4jApi.md#getSecurityStatus) | **GET** /ff4j/security | Display &lt;b&gt;Security&lt;/b&gt; informations (permissions manager)
[**getStatus**](Ff4jApi.md#getStatus) | **GET** /ff4j | Display &lt;b&gt;ff4j&lt;/b&gt; status overview


<a name="check"></a>
# **check**
> check(uid)

&lt;b&gt;Simple check&lt;/b&gt; feature toggle



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jApi;


Ff4jApi apiInstance = new Ff4jApi();
String uid = "uid_example"; // String | 
try {
    apiInstance.check(uid);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jApi#check");
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

<a name="checkPOST"></a>
# **checkPOST**
> checkPOST(uid)

&lt;b&gt;Advanced check&lt;/b&gt; feature toggle (parameterized)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jApi;


Ff4jApi apiInstance = new Ff4jApi();
String uid = "uid_example"; // String | 
try {
    apiInstance.checkPOST(uid);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jApi#checkPOST");
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

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

<a name="getSecurityStatus"></a>
# **getSecurityStatus**
> Authorization getSecurityStatus()

Display &lt;b&gt;Security&lt;/b&gt; informations (permissions manager)

Security is implemented through dedicated &lt;b&gt;AuthorizationsManager&lt;/b&gt; but it&#39;s not mandatory

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jApi;


Ff4jApi apiInstance = new Ff4jApi();
try {
    Authorization result = apiInstance.getSecurityStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jApi#getSecurityStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStatus"></a>
# **getStatus**
> Ff4jStatus getStatus()

Display &lt;b&gt;ff4j&lt;/b&gt; status overview

Display informations related to &lt;b&gt;Monitoring&lt;/b&gt;, &lt;b&gt;Security&lt;/b&gt;, &lt;b&gt;Cache&lt;/b&gt; and &lt;b&gt;Store&lt;/b&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jApi;


Ff4jApi apiInstance = new Ff4jApi();
try {
    Ff4jStatus result = apiInstance.getStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jApi#getStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Ff4jStatus**](Ff4jStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

