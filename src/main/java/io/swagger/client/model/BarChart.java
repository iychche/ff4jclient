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
import io.swagger.client.model.BarSeries;
import java.util.ArrayList;
import java.util.List;

/**
 * resource representation of a bar chart
 */
@ApiModel(description = "resource representation of a bar chart")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T16:56:05.648-07:00")
public class BarChart {
  @SerializedName("title")
  private String title = null;

  @SerializedName("labels")
  private List<String> labels = null;

  @SerializedName("series")
  private List<BarSeries> series = null;

  public BarChart title(String title) {
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

  public BarChart labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public BarChart addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * labels of the graph
   * @return labels
  **/
  @ApiModelProperty(value = "labels of the graph")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public BarChart series(List<BarSeries> series) {
    this.series = series;
    return this;
  }

  public BarChart addSeriesItem(BarSeries seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<BarSeries>();
    }
    this.series.add(seriesItem);
    return this;
  }

   /**
   * series of the graph
   * @return series
  **/
  @ApiModelProperty(value = "series of the graph")
  public List<BarSeries> getSeries() {
    return series;
  }

  public void setSeries(List<BarSeries> series) {
    this.series = series;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarChart barChart = (BarChart) o;
    return Objects.equals(this.title, barChart.title) &&
        Objects.equals(this.labels, barChart.labels) &&
        Objects.equals(this.series, barChart.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, labels, series);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarChart {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
