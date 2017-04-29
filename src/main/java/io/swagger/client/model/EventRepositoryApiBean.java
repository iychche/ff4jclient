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
import io.swagger.client.model.BarChart;
import io.swagger.client.model.PieChart;

/**
 * resource representation of monitoring resources
 */
@ApiModel(description = "resource representation of monitoring resources")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T16:56:05.648-07:00")
public class EventRepositoryApiBean {
  @SerializedName("type")
  private String type = null;

  @SerializedName("hitCount")
  private Integer hitCount = null;

  @SerializedName("eventsPie")
  private PieChart eventsPie = null;

  @SerializedName("barChart")
  private BarChart barChart = null;

  public EventRepositoryApiBean type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of the repository
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type of the repository")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EventRepositoryApiBean hitCount(Integer hitCount) {
    this.hitCount = hitCount;
    return this;
  }

   /**
   * total hit of the monitoring
   * @return hitCount
  **/
  @ApiModelProperty(required = true, value = "total hit of the monitoring")
  public Integer getHitCount() {
    return hitCount;
  }

  public void setHitCount(Integer hitCount) {
    this.hitCount = hitCount;
  }

  public EventRepositoryApiBean eventsPie(PieChart eventsPie) {
    this.eventsPie = eventsPie;
    return this;
  }

   /**
   * pie of features
   * @return eventsPie
  **/
  @ApiModelProperty(required = true, value = "pie of features")
  public PieChart getEventsPie() {
    return eventsPie;
  }

  public void setEventsPie(PieChart eventsPie) {
    this.eventsPie = eventsPie;
  }

  public EventRepositoryApiBean barChart(BarChart barChart) {
    this.barChart = barChart;
    return this;
  }

   /**
   * barChart for activity
   * @return barChart
  **/
  @ApiModelProperty(required = true, value = "barChart for activity")
  public BarChart getBarChart() {
    return barChart;
  }

  public void setBarChart(BarChart barChart) {
    this.barChart = barChart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRepositoryApiBean eventRepositoryApiBean = (EventRepositoryApiBean) o;
    return Objects.equals(this.type, eventRepositoryApiBean.type) &&
        Objects.equals(this.hitCount, eventRepositoryApiBean.hitCount) &&
        Objects.equals(this.eventsPie, eventRepositoryApiBean.eventsPie) &&
        Objects.equals(this.barChart, eventRepositoryApiBean.barChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hitCount, eventsPie, barChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRepositoryApiBean {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
    sb.append("    eventsPie: ").append(toIndentedString(eventsPie)).append("\n");
    sb.append("    barChart: ").append(toIndentedString(barChart)).append("\n");
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

