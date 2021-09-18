/*
 * hydra.ai API
 * hydra.ai makes it easy to use A.I. inside workflows and your apps. You can use hydra.ai for text classification, named entity recognition and senitment analysis. You can create your own A.I. models or use some of our pre-built models.  This API supports creating, training and invoking A.I. models hosted in your hydra.ai workspace. Create an account at https://build.hydra.ai to get started. You get get your API key in the settings section.    
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: hello@hydra.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A prdiction request
 */
@ApiModel(description = "A prdiction request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-07T21:14:11.959007Z[Etc/UTC]")
public class PredictionRequest {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;


  public PredictionRequest data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * data string or object json string
   * @return data
  **/
  @ApiModelProperty(required = true, value = "data string or object json string")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionRequest predictionRequest = (PredictionRequest) o;
    return Objects.equals(this.data, predictionRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

