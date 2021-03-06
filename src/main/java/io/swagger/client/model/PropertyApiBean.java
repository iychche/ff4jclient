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
import java.util.ArrayList;
import java.util.List;

/**
 * ff4j property representation
 */
@ApiModel(description = "ff4j property representation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T16:56:05.648-07:00")
public class PropertyApiBean {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("fixedValues")
  private List<String> fixedValues = null;

  public PropertyApiBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * unique property name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "unique property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PropertyApiBean description(String description) {
    this.description = description;
    return this;
  }

   /**
   * property description
   * @return description
  **/
  @ApiModelProperty(value = "property description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PropertyApiBean type(String type) {
    this.type = type;
    return this;
  }

   /**
   * classname of implementation
   * @return type
  **/
  @ApiModelProperty(required = true, value = "classname of implementation")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PropertyApiBean value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public PropertyApiBean fixedValues(List<String> fixedValues) {
    this.fixedValues = fixedValues;
    return this;
  }

  public PropertyApiBean addFixedValuesItem(String fixedValuesItem) {
    if (this.fixedValues == null) {
      this.fixedValues = new ArrayList<String>();
    }
    this.fixedValues.add(fixedValuesItem);
    return this;
  }

   /**
   * fixedValues
   * @return fixedValues
  **/
  @ApiModelProperty(value = "fixedValues")
  public List<String> getFixedValues() {
    return fixedValues;
  }

  public void setFixedValues(List<String> fixedValues) {
    this.fixedValues = fixedValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyApiBean propertyApiBean = (PropertyApiBean) o;
    return Objects.equals(this.name, propertyApiBean.name) &&
        Objects.equals(this.description, propertyApiBean.description) &&
        Objects.equals(this.type, propertyApiBean.type) &&
        Objects.equals(this.value, propertyApiBean.value) &&
        Objects.equals(this.fixedValues, propertyApiBean.fixedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, value, fixedValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyApiBean {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    fixedValues: ").append(toIndentedString(fixedValues)).append("\n");
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

