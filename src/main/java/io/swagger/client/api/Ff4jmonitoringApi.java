/*
 * FF4J (ff4j.org) WebAPI
 * Administrate and operate all tasks on your features through this api
 *
 * OpenAPI spec version: 1.5.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.EventRepositoryApiBean;
import io.swagger.client.model.FeatureMonitoringApiBean;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ff4jmonitoringApi {
    private ApiClient apiClient;

    public Ff4jmonitoringApi() {
        this(Configuration.getDefaultApiClient());
    }

    public Ff4jmonitoringApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getFeatureMonitoring
     * @param uid Unique identifier of feature (required)
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFeatureMonitoringCall(String uid, Long start, Long end, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ff4j/monitoring/{uid}"
            .replaceAll("\\{" + "uid" + "\\}", apiClient.escapeString(uid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFeatureMonitoringValidateBeforeCall(String uid, Long start, Long end, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new ApiException("Missing the required parameter 'uid' when calling getFeatureMonitoring(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getFeatureMonitoringCall(uid, start, end, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature
     * Each feature will display a pieChart and a barChart for hits
     * @param uid Unique identifier of feature (required)
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @return FeatureMonitoringApiBean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FeatureMonitoringApiBean getFeatureMonitoring(String uid, Long start, Long end) throws ApiException {
        ApiResponse<FeatureMonitoringApiBean> resp = getFeatureMonitoringWithHttpInfo(uid, start, end);
        return resp.getData();
    }

    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature
     * Each feature will display a pieChart and a barChart for hits
     * @param uid Unique identifier of feature (required)
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @return ApiResponse&lt;FeatureMonitoringApiBean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FeatureMonitoringApiBean> getFeatureMonitoringWithHttpInfo(String uid, Long start, Long end) throws ApiException {
        com.squareup.okhttp.Call call = getFeatureMonitoringValidateBeforeCall(uid, start, end, null, null);
        Type localVarReturnType = new TypeToken<FeatureMonitoringApiBean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature (asynchronously)
     * Each feature will display a pieChart and a barChart for hits
     * @param uid Unique identifier of feature (required)
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFeatureMonitoringAsync(String uid, Long start, Long end, final ApiCallback<FeatureMonitoringApiBean> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFeatureMonitoringValidateBeforeCall(uid, start, end, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FeatureMonitoringApiBean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMonitoringStatus
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMonitoringStatusCall(Long start, Long end, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ff4j/monitoring";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMonitoringStatusValidateBeforeCall(Long start, Long end, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getMonitoringStatusCall(start, end, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features
     * The &lt;b&gt;EventRepository&lt;/b&gt; handle to store audit events is not required
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @return EventRepositoryApiBean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventRepositoryApiBean getMonitoringStatus(Long start, Long end) throws ApiException {
        ApiResponse<EventRepositoryApiBean> resp = getMonitoringStatusWithHttpInfo(start, end);
        return resp.getData();
    }

    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features
     * The &lt;b&gt;EventRepository&lt;/b&gt; handle to store audit events is not required
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @return ApiResponse&lt;EventRepositoryApiBean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventRepositoryApiBean> getMonitoringStatusWithHttpInfo(Long start, Long end) throws ApiException {
        com.squareup.okhttp.Call call = getMonitoringStatusValidateBeforeCall(start, end, null, null);
        Type localVarReturnType = new TypeToken<EventRepositoryApiBean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features (asynchronously)
     * The &lt;b&gt;EventRepository&lt;/b&gt; handle to store audit events is not required
     * @param start Start of window &lt;br&gt;(default is today 00:00) (optional)
     * @param end End  of window &lt;br&gt;(default is tomorrow 00:00) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMonitoringStatusAsync(Long start, Long end, final ApiCallback<EventRepositoryApiBean> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMonitoringStatusValidateBeforeCall(start, end, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventRepositoryApiBean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
