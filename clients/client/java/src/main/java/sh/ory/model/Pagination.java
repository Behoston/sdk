/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.180
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
 * Pagination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T22:51:10.989995238Z[Etc/UTC]")
public class Pagination {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = 1l;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Long perPage = 250l;

  public Pagination() { 
  }

  public Pagination page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * Pagination Page
   * minimum: 1
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pagination Page")

  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public Pagination perPage(Long perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Items per Page  This is the number of items per page.
   * minimum: 1
   * maximum: 1000
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items per Page  This is the number of items per page.")

  public Long getPerPage() {
    return perPage;
  }


  public void setPerPage(Long perPage) {
    this.perPage = perPage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.page, pagination.page) &&
        Objects.equals(this.perPage, pagination.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

