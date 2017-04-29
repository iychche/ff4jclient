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

/**
 * resource representation of a pie sector
 */
@ApiModel(description = "resource representation of a pie sector")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T16:56:05.648-07:00")
public class PieSector {
  @SerializedName("label")
  private String label = null;

  @SerializedName("value")
  private Double value = null;

  @SerializedName("color")
  private String color = null;

  public PieSector label(String label) {
    this.label = label;
    return this;
  }

   /**
   * label for this sector
   * @return label
  **/
  @ApiModelProperty(value = "label for this sector")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PieSector value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * target value
   * @return value
  **/
  @ApiModelProperty(value = "target value")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public PieSector color(String color) {
    this.color = color;
    return this;
  }

   /**
   * target color
   * @return color
  **/
  @ApiModelProperty(value = "target color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PieSector pieSector = (PieSector) o;
    return Objects.equals(this.label, pieSector.label) &&
        Objects.equals(this.value, pieSector.value) &&
        Objects.equals(this.color, pieSector.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieSector {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
