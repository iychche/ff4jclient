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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Ff4jstoregroupsgroupNameApi
 */
@Ignore
public class Ff4jstoregroupsgroupNameApiTest {

    private final Ff4jstoregroupsgroupNameApi api = new Ff4jstoregroupsgroupNameApi();

    
    /**
     * Disable a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationDisableGroupTest() throws ApiException {
        String groupName = null;
        api.operationDisableGroup(groupName);

        // TODO: test validations
    }
    
    /**
     * Enable a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationEnableTest() throws ApiException {
        String groupName = null;
        api.operationEnable(groupName);

        // TODO: test validations
    }
    
    /**
     * Read information about a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTest() throws ApiException {
        String groupName = null;
        api.read(groupName);

        // TODO: test validations
    }
    
}
