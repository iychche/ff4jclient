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
import io.swagger.client.model.PieSector;
import java.util.ArrayList;
import java.util.List;

/**
 * resource representation of a pie chart
 */
@ApiModel(description = "resource representation of a pie chart")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T16:56:05.648-07:00")
public class PieChart {
  @SerializedName("title")
  private String title = null;

  @SerializedName("sectors")
  private List<PieSector> sectors = null;

  public PieChart title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the graph
   * @return title
  **/
  @ApiModelProperty(value = "title of the graph")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PieChart sectors(List<PieSector> sectors) {
    this.sectors = sectors;
    return this;
  }

  public PieChart addSectorsItem(PieSector sectorsItem) {
    if (this.sectors == null) {
      this.sectors = new ArrayList<PieSector>();
    }
    this.sectors.add(sectorsItem);
    return this;
  }

   /**
   * sectors of the pie graph
   * @return sectors
  **/
  @ApiModelProperty(value = "sectors of the pie graph")
  public List<PieSector> getSectors() {
    return sectors;
  }

  public void setSectors(List<PieSector> sectors) {
    this.sectors = sectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PieChart pieChart = (PieChart) o;
    return Objects.equals(this.title, pieChart.title) &&
        Objects.equals(this.sectors, pieChart.sectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, sectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieChart {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
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

