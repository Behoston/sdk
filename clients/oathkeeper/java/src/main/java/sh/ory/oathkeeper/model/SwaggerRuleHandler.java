/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.55
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.model;

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
 * SwaggerRuleHandler swagger rule handler
 */
@ApiModel(description = "SwaggerRuleHandler swagger rule handler")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-24T11:28:44.213218031Z[Etc/UTC]")
public class SwaggerRuleHandler {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config;

  public static final String SERIALIZED_NAME_HANDLER = "handler";
  @SerializedName(SERIALIZED_NAME_HANDLER)
  private String handler;


  public SwaggerRuleHandler config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Config contains the configuration for the handler. Please read the user guide for a complete list of each handler&#39;s available settings.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Config contains the configuration for the handler. Please read the user guide for a complete list of each handler's available settings.")

  public Object getConfig() {
    return config;
  }


  public void setConfig(Object config) {
    this.config = config;
  }


  public SwaggerRuleHandler handler(String handler) {
    
    this.handler = handler;
    return this;
  }

   /**
   * Handler identifies the implementation which will be used to handle this specific request. Please read the user guide for a complete list of available handlers.
   * @return handler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Handler identifies the implementation which will be used to handle this specific request. Please read the user guide for a complete list of available handlers.")

  public String getHandler() {
    return handler;
  }


  public void setHandler(String handler) {
    this.handler = handler;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerRuleHandler swaggerRuleHandler = (SwaggerRuleHandler) o;
    return Objects.equals(this.config, swaggerRuleHandler.config) &&
        Objects.equals(this.handler, swaggerRuleHandler.handler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, handler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerRuleHandler {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
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

