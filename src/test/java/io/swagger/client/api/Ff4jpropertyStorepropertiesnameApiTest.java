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
import io.swagger.client.model.PropertyApiBean;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Ff4jpropertyStorepropertiesnameApi
 */
@Ignore
public class Ff4jpropertyStorepropertiesnameApiTest {

    private final Ff4jpropertyStorepropertiesnameApi api = new Ff4jpropertyStorepropertiesnameApi();

    
    /**
     * Delete a Property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePropertyTest() throws ApiException {
        String name = null;
        api.deleteProperty(name);

        // TODO: test validations
    }
    
    /**
     * Update a property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void operationUpdateTest() throws ApiException {
        String name = null;
        api.operationUpdate(name);

        // TODO: test validations
    }
    
    /**
     * Read information about a Property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTest() throws ApiException {
        String name = null;
        api.read(name);

        // TODO: test validations
    }
    
    /**
     * Create of update a Property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertPropertyTest() throws ApiException {
        String name = null;
        PropertyApiBean body = null;
        api.upsertProperty(name, body);

        // TODO: test validations
    }
    
}
