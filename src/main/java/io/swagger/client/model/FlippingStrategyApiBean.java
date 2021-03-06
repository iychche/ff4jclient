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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ff4j resource representation
 */
@ApiModel(description = "ff4j resource representation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T16:56:05.648-07:00")
public class FlippingStrategyApiBean {
  @SerializedName("type")
  private String type = null;

  @SerializedName("initParams")
  private Map<String, String> initParams = null;

  public FlippingStrategyApiBean type(String type) {
    this.type = type;
    return this;
  }

   /**
   * implementation class
   * @return type
  **/
  @ApiModelProperty(required = true, value = "implementation class")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FlippingStrategyApiBean initParams(Map<String, String> initParams) {
    this.initParams = initParams;
    return this;
  }

  public FlippingStrategyApiBean putInitParamsItem(String key, String initParamsItem) {
    if (this.initParams == null) {
      this.initParams = new HashMap<String, String>();
    }
    this.initParams.put(key, initParamsItem);
    return this;
  }

   /**
   * init parameters
   * @return initParams
  **/
  @ApiModelProperty(value = "init parameters")
  public Map<String, String> getInitParams() {
    return initParams;
  }

  public void setInitParams(Map<String, String> initParams) {
    this.initParams = initParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlippingStrategyApiBean flippingStrategyApiBean = (FlippingStrategyApiBean) o;
    return Objects.equals(this.type, flippingStrategyApiBean.type) &&
        Objects.equals(this.initParams, flippingStrategyApiBean.initParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, initParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlippingStrategyApiBean {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    initParams: ").append(toIndentedString(initParams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

