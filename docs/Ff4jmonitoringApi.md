# Ff4jmonitoringApi

All URIs are relative to *http://localhost:8282/webapi/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeatureMonitoring**](Ff4jmonitoringApi.md#getFeatureMonitoring) | **GET** /ff4j/monitoring/{uid} | Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature
[**getMonitoringStatus**](Ff4jmonitoringApi.md#getMonitoringStatus) | **GET** /ff4j/monitoring | Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features


<a name="getFeatureMonitoring"></a>
# **getFeatureMonitoring**
> FeatureMonitoringApiBean getFeatureMonitoring(uid, start, end)

Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature

Each feature will display a pieChart and a barChart for hits

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jmonitoringApi;


Ff4jmonitoringApi apiInstance = new Ff4jmonitoringApi();
String uid = "uid_example"; // String | Unique identifier of feature
Long start = 789L; // Long | Start of window <br>(default is today 00:00)
Long end = 789L; // Long | End  of window <br>(default is tomorrow 00:00)
try {
    FeatureMonitoringApiBean result = apiInstance.getFeatureMonitoring(uid, start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jmonitoringApi#getFeatureMonitoring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| Unique identifier of feature |
 **start** | **Long**| Start of window &lt;br&gt;(default is today 00:00) | [optional]
 **end** | **Long**| End  of window &lt;br&gt;(default is tomorrow 00:00) | [optional]

### Return type

[**FeatureMonitoringApiBean**](FeatureMonitoringApiBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMonitoringStatus"></a>
# **getMonitoringStatus**
> EventRepositoryApiBean getMonitoringStatus(start, end)

Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features

The &lt;b&gt;EventRepository&lt;/b&gt; handle to store audit events is not required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.Ff4jmonitoringApi;


Ff4jmonitoringApi apiInstance = new Ff4jmonitoringApi();
Long start = 789L; // Long | Start of window <br>(default is today 00:00)
Long end = 789L; // Long | End  of window <br>(default is tomorrow 00:00)
try {
    EventRepositoryApiBean result = apiInstance.getMonitoringStatus(start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Ff4jmonitoringApi#getMonitoringStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Long**| Start of window &lt;br&gt;(default is today 00:00) | [optional]
 **end** | **Long**| End  of window &lt;br&gt;(default is tomorrow 00:00) | [optional]

### Return type

[**EventRepositoryApiBean**](EventRepositoryApiBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

