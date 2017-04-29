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

import io.swagger.client.ApiException;
import io.swagger.client.model.EventRepositoryApiBean;
import io.swagger.client.model.FeatureMonitoringApiBean;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Ff4jmonitoringApi
 */
@Ignore
public class Ff4jmonitoringApiTest {

    private final Ff4jmonitoringApi api = new Ff4jmonitoringApi();

    
    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature
     *
     * Each feature will display a pieChart and a barChart for hits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureMonitoringTest() throws ApiException {
        String uid = null;
        Long start = null;
        Long end = null;
        FeatureMonitoringApiBean response = api.getFeatureMonitoring(uid, start, end);

        // TODO: test validations
    }
    
    /**
     * Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features
     *
     * The &lt;b&gt;EventRepository&lt;/b&gt; handle to store audit events is not required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMonitoringStatusTest() throws ApiException {
        Long start = null;
        Long end = null;
        EventRepositoryApiBean response = api.getMonitoringStatus(start, end);

        // TODO: test validations
    }
    
}
