/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.6-alpha.6
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.kratos.model.UiText;

/**
 * InputAttributes represents the attributes of an input node
 */
@ApiModel(description = "InputAttributes represents the attributes of an input node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T08:07:10.726149286Z[Etc/UTC]")
public class UiNodeInputAttributes {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private UiText label;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;


  public UiNodeInputAttributes disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Sets the input&#39;s disabled field to true or false.
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Sets the input's disabled field to true or false.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public UiNodeInputAttributes label(UiText label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UiText getLabel() {
    return label;
  }


  public void setLabel(UiText label) {
    this.label = label;
  }


  public UiNodeInputAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The input&#39;s element name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The input's element name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UiNodeInputAttributes pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * The input&#39;s pattern.
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input's pattern.")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public UiNodeInputAttributes required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Mark this input field as required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mark this input field as required.")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public UiNodeInputAttributes type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UiNodeInputAttributes value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The input&#39;s value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input's value.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeInputAttributes uiNodeInputAttributes = (UiNodeInputAttributes) o;
    return Objects.equals(this.disabled, uiNodeInputAttributes.disabled) &&
        Objects.equals(this.label, uiNodeInputAttributes.label) &&
        Objects.equals(this.name, uiNodeInputAttributes.name) &&
        Objects.equals(this.pattern, uiNodeInputAttributes.pattern) &&
        Objects.equals(this.required, uiNodeInputAttributes.required) &&
        Objects.equals(this.type, uiNodeInputAttributes.type) &&
        Objects.equals(this.value, uiNodeInputAttributes.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, label, name, pattern, required, type, value);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeInputAttributes {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

