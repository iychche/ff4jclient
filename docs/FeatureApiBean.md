
# FeatureApiBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** | unique feature identifier | 
**enable** | **Boolean** | status of feature | 
**description** | **String** | description of feature |  [optional]
**group** | **String** | Group of the feature if exists, it&#39;s single |  [optional]
**permissions** | **List&lt;String&gt;** | Role and profiles authorized on feature |  [optional]
**flippingStrategy** | [**FlippingStrategyApiBean**](FlippingStrategyApiBean.md) | Flipping strategy if exist |  [optional]
**customProperties** | [**Map&lt;String, PropertyApiBean&gt;**](PropertyApiBean.md) | Custom properties if they exist |  [optional]



