/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.47
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

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
 * SessionDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-17T15:12:24.872115049Z[Etc/UTC]")
public class SessionDevice {
  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private String userAgent;


  public SessionDevice userAgent(String userAgent) {
    
    this.userAgent = userAgent;
    return this;
  }

   /**
   * UserAgent of this device
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UserAgent of this device")

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionDevice sessionDevice = (SessionDevice) o;
    return Objects.equals(this.userAgent, sessionDevice.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionDevice {\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

