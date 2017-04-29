# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.Ff4jApi;

import java.io.File;
import java.util.*;

public class Ff4jApiExample {

    public static void main(String[] args) {
        
        Ff4jApi apiInstance = new Ff4jApi();
        String uid = "uid_example"; // String | 
        try {
            apiInstance.check(uid);
        } catch (ApiException e) {
            System.err.println("Exception when calling Ff4jApi#check");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8282/webapi/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Ff4jApi* | [**check**](docs/Ff4jApi.md#check) | **GET** /ff4j/check/{uid} | &lt;b&gt;Simple check&lt;/b&gt; feature toggle
*Ff4jApi* | [**checkPOST**](docs/Ff4jApi.md#checkPOST) | **POST** /ff4j/check/{uid} | &lt;b&gt;Advanced check&lt;/b&gt; feature toggle (parameterized)
*Ff4jApi* | [**getSecurityStatus**](docs/Ff4jApi.md#getSecurityStatus) | **GET** /ff4j/security | Display &lt;b&gt;Security&lt;/b&gt; informations (permissions manager)
*Ff4jApi* | [**getStatus**](docs/Ff4jApi.md#getStatus) | **GET** /ff4j | Display &lt;b&gt;ff4j&lt;/b&gt; status overview
*Ff4jmonitoringApi* | [**getFeatureMonitoring**](docs/Ff4jmonitoringApi.md#getFeatureMonitoring) | **GET** /ff4j/monitoring/{uid} | Display &lt;b&gt;Monitoring&lt;/b&gt; for a &lt;b&gt;&lt;u&gt;single&lt;/u&gt;&lt;/b&gt; feature
*Ff4jmonitoringApi* | [**getMonitoringStatus**](docs/Ff4jmonitoringApi.md#getMonitoringStatus) | **GET** /ff4j/monitoring | Display &lt;b&gt;Monitoring&lt;/b&gt; information for &lt;b&gt;&lt;u&gt;all&lt;/u&gt;&lt;/b&gt; features
*Ff4jpropertyStoreApi* | [**clear**](docs/Ff4jpropertyStoreApi.md#clear) | **POST** /ff4j/propertyStore/cache | Clear Cache
*Ff4jpropertyStoreApi* | [**clearProperties**](docs/Ff4jpropertyStoreApi.md#clearProperties) | **POST** /ff4j/propertyStore/clear | Delete all &lt;b&gt;Properties&lt;/b&gt; in store
*Ff4jpropertyStoreApi* | [**get**](docs/Ff4jpropertyStoreApi.md#get) | **GET** /ff4j/propertyStore | Display information regarding to &lt;b&gt;Properties&lt;/b&gt;
*Ff4jpropertyStoreApi* | [**getStatus**](docs/Ff4jpropertyStoreApi.md#getStatus) | **GET** /ff4j/propertyStore/cache | Display information related to &lt;b&gt;Cache&lt;/b&gt;
*Ff4jpropertyStoreApi* | [**readProperties**](docs/Ff4jpropertyStoreApi.md#readProperties) | **GET** /ff4j/propertyStore/properties | Display information regarding &lt;b&gt;Properties&lt;/b&gt;
*Ff4jpropertyStorepropertiesnameApi* | [**deleteProperty**](docs/Ff4jpropertyStorepropertiesnameApi.md#deleteProperty) | **DELETE** /ff4j/propertyStore/properties/{name} | Delete a Property
*Ff4jpropertyStorepropertiesnameApi* | [**operationUpdate**](docs/Ff4jpropertyStorepropertiesnameApi.md#operationUpdate) | **POST** /ff4j/propertyStore/properties/{name}/update | Update a property
*Ff4jpropertyStorepropertiesnameApi* | [**read**](docs/Ff4jpropertyStorepropertiesnameApi.md#read) | **GET** /ff4j/propertyStore/properties/{name} | Read information about a Property
*Ff4jpropertyStorepropertiesnameApi* | [**upsertProperty**](docs/Ff4jpropertyStorepropertiesnameApi.md#upsertProperty) | **PUT** /ff4j/propertyStore/properties/{name} | Create of update a Property
*Ff4jstoreApi* | [**clear**](docs/Ff4jstoreApi.md#clear) | **POST** /ff4j/store/cache | Clear Cache
*Ff4jstoreApi* | [**clearFeatures**](docs/Ff4jstoreApi.md#clearFeatures) | **POST** /ff4j/store/clear | Delete all &lt;b&gt;Features&lt;/b&gt; in store
*Ff4jstoreApi* | [**get**](docs/Ff4jstoreApi.md#get) | **GET** /ff4j/store | Display information regarding to &lt;b&gt;Features&lt;/b&gt;
*Ff4jstoreApi* | [**getStatus**](docs/Ff4jstoreApi.md#getStatus) | **GET** /ff4j/store/cache | Display information related to &lt;b&gt;Cache&lt;/b&gt;
*Ff4jstoreApi* | [**readFeatures**](docs/Ff4jstoreApi.md#readFeatures) | **GET** /ff4j/store/features | Display information regarding &lt;b&gt;Features&lt;/b&gt;
*Ff4jstoreApi* | [**readGroups**](docs/Ff4jstoreApi.md#readGroups) | **GET** /ff4j/store/groups | Display information regarding &lt;b&gt;Groups&lt;/b&gt;
*Ff4jstorefeaturesuidApi* | [**deleteFeature**](docs/Ff4jstorefeaturesuidApi.md#deleteFeature) | **DELETE** /ff4j/store/features/{uid} | Delete a feature
*Ff4jstorefeaturesuidApi* | [**operationAddGroup**](docs/Ff4jstorefeaturesuidApi.md#operationAddGroup) | **POST** /ff4j/store/features/{uid}/addGroup/{groupName} | Define the group of the feature
*Ff4jstorefeaturesuidApi* | [**operationDisable**](docs/Ff4jstorefeaturesuidApi.md#operationDisable) | **POST** /ff4j/store/features/{uid}/disable | Disable a feature
*Ff4jstorefeaturesuidApi* | [**operationEnable**](docs/Ff4jstorefeaturesuidApi.md#operationEnable) | **POST** /ff4j/store/features/{uid}/enable | Enable a feature
*Ff4jstorefeaturesuidApi* | [**operationGrantRole**](docs/Ff4jstorefeaturesuidApi.md#operationGrantRole) | **POST** /ff4j/store/features/{uid}/grantrole/{role} | Grant a permission on a feature
*Ff4jstorefeaturesuidApi* | [**operationRemoveGroup**](docs/Ff4jstorefeaturesuidApi.md#operationRemoveGroup) | **POST** /ff4j/store/features/{uid}/removeGroup/{groupName} | Remove the group of the feature
*Ff4jstorefeaturesuidApi* | [**operationRemoveRole**](docs/Ff4jstorefeaturesuidApi.md#operationRemoveRole) | **POST** /ff4j/store/features/{uid}/removerole/{role} | Remove a permission on a feature
*Ff4jstorefeaturesuidApi* | [**read**](docs/Ff4jstorefeaturesuidApi.md#read) | **GET** /ff4j/store/features/{uid} | Read information about a feature
*Ff4jstorefeaturesuidApi* | [**upsertFeature**](docs/Ff4jstorefeaturesuidApi.md#upsertFeature) | **PUT** /ff4j/store/features/{uid} | Create of update a feature
*Ff4jstoregroupsgroupNameApi* | [**operationDisableGroup**](docs/Ff4jstoregroupsgroupNameApi.md#operationDisableGroup) | **POST** /ff4j/store/groups/{groupName}/disable | Disable a group
*Ff4jstoregroupsgroupNameApi* | [**operationEnable**](docs/Ff4jstoregroupsgroupNameApi.md#operationEnable) | **POST** /ff4j/store/groups/{groupName}/enable | Enable a group
*Ff4jstoregroupsgroupNameApi* | [**read**](docs/Ff4jstoregroupsgroupNameApi.md#read) | **GET** /ff4j/store/groups/{groupName} | Read information about a group


## Documentation for Models

 - [Authorization](docs/Authorization.md)
 - [BarChart](docs/BarChart.md)
 - [BarSeries](docs/BarSeries.md)
 - [CacheApiBean](docs/CacheApiBean.md)
 - [EventRepositoryApiBean](docs/EventRepositoryApiBean.md)
 - [FeatureApiBean](docs/FeatureApiBean.md)
 - [FeatureMonitoringApiBean](docs/FeatureMonitoringApiBean.md)
 - [FeatureStoreApiBean](docs/FeatureStoreApiBean.md)
 - [Ff4jStatus](docs/Ff4jStatus.md)
 - [FlippingStrategyApiBean](docs/FlippingStrategyApiBean.md)
 - [FpropertyStoreApiBean](docs/FpropertyStoreApiBean.md)
 - [GroupDescApiBean](docs/GroupDescApiBean.md)
 - [PieChart](docs/PieChart.md)
 - [PieSector](docs/PieSector.md)
 - [PropertyApiBean](docs/PropertyApiBean.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



