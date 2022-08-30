/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.24
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.ory.model.Headers;
import sh.ory.model.IDTokenClaims;
import sh.ory.model.OAuth2ConsentSessionExpiresAt;

/**
 * OAuth2ConsentSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T11:32:43.925337871Z[Etc/UTC]")
public class OAuth2ConsentSession {
  public static final String SERIALIZED_NAME_ALLOWED_TOP_LEVEL_CLAIMS = "allowed_top_level_claims";
  @SerializedName(SERIALIZED_NAME_ALLOWED_TOP_LEVEL_CLAIMS)
  private List<String> allowedTopLevelClaims = null;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CONSENT_CHALLENGE = "consent_challenge";
  @SerializedName(SERIALIZED_NAME_CONSENT_CHALLENGE)
  private String consentChallenge;

  public static final String SERIALIZED_NAME_EXCLUDE_NOT_BEFORE_CLAIM = "exclude_not_before_claim";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_NOT_BEFORE_CLAIM)
  private Boolean excludeNotBeforeClaim;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OAuth2ConsentSessionExpiresAt expiresAt;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, Object> extra = null;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Headers headers;

  public static final String SERIALIZED_NAME_ID_TOKEN_CLAIMS = "id_token_claims";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN_CLAIMS)
  private IDTokenClaims idTokenClaims;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public OAuth2ConsentSession() { 
  }

  public OAuth2ConsentSession allowedTopLevelClaims(List<String> allowedTopLevelClaims) {
    
    this.allowedTopLevelClaims = allowedTopLevelClaims;
    return this;
  }

  public OAuth2ConsentSession addAllowedTopLevelClaimsItem(String allowedTopLevelClaimsItem) {
    if (this.allowedTopLevelClaims == null) {
      this.allowedTopLevelClaims = new ArrayList<>();
    }
    this.allowedTopLevelClaims.add(allowedTopLevelClaimsItem);
    return this;
  }

   /**
   * Get allowedTopLevelClaims
   * @return allowedTopLevelClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedTopLevelClaims() {
    return allowedTopLevelClaims;
  }


  public void setAllowedTopLevelClaims(List<String> allowedTopLevelClaims) {
    this.allowedTopLevelClaims = allowedTopLevelClaims;
  }


  public OAuth2ConsentSession clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OAuth2ConsentSession consentChallenge(String consentChallenge) {
    
    this.consentChallenge = consentChallenge;
    return this;
  }

   /**
   * Get consentChallenge
   * @return consentChallenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentChallenge() {
    return consentChallenge;
  }


  public void setConsentChallenge(String consentChallenge) {
    this.consentChallenge = consentChallenge;
  }


  public OAuth2ConsentSession excludeNotBeforeClaim(Boolean excludeNotBeforeClaim) {
    
    this.excludeNotBeforeClaim = excludeNotBeforeClaim;
    return this;
  }

   /**
   * Get excludeNotBeforeClaim
   * @return excludeNotBeforeClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExcludeNotBeforeClaim() {
    return excludeNotBeforeClaim;
  }


  public void setExcludeNotBeforeClaim(Boolean excludeNotBeforeClaim) {
    this.excludeNotBeforeClaim = excludeNotBeforeClaim;
  }


  public OAuth2ConsentSession expiresAt(OAuth2ConsentSessionExpiresAt expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2ConsentSessionExpiresAt getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OAuth2ConsentSessionExpiresAt expiresAt) {
    this.expiresAt = expiresAt;
  }


  public OAuth2ConsentSession extra(Map<String, Object> extra) {
    
    this.extra = extra;
    return this;
  }

  public OAuth2ConsentSession putExtraItem(String key, Object extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getExtra() {
    return extra;
  }


  public void setExtra(Map<String, Object> extra) {
    this.extra = extra;
  }


  public OAuth2ConsentSession headers(Headers headers) {
    
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Headers getHeaders() {
    return headers;
  }


  public void setHeaders(Headers headers) {
    this.headers = headers;
  }


  public OAuth2ConsentSession idTokenClaims(IDTokenClaims idTokenClaims) {
    
    this.idTokenClaims = idTokenClaims;
    return this;
  }

   /**
   * Get idTokenClaims
   * @return idTokenClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IDTokenClaims getIdTokenClaims() {
    return idTokenClaims;
  }


  public void setIdTokenClaims(IDTokenClaims idTokenClaims) {
    this.idTokenClaims = idTokenClaims;
  }


  public OAuth2ConsentSession kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * Get kid
   * @return kid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public OAuth2ConsentSession subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public OAuth2ConsentSession username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ConsentSession oAuth2ConsentSession = (OAuth2ConsentSession) o;
    return Objects.equals(this.allowedTopLevelClaims, oAuth2ConsentSession.allowedTopLevelClaims) &&
        Objects.equals(this.clientId, oAuth2ConsentSession.clientId) &&
        Objects.equals(this.consentChallenge, oAuth2ConsentSession.consentChallenge) &&
        Objects.equals(this.excludeNotBeforeClaim, oAuth2ConsentSession.excludeNotBeforeClaim) &&
        Objects.equals(this.expiresAt, oAuth2ConsentSession.expiresAt) &&
        Objects.equals(this.extra, oAuth2ConsentSession.extra) &&
        Objects.equals(this.headers, oAuth2ConsentSession.headers) &&
        Objects.equals(this.idTokenClaims, oAuth2ConsentSession.idTokenClaims) &&
        Objects.equals(this.kid, oAuth2ConsentSession.kid) &&
        Objects.equals(this.subject, oAuth2ConsentSession.subject) &&
        Objects.equals(this.username, oAuth2ConsentSession.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedTopLevelClaims, clientId, consentChallenge, excludeNotBeforeClaim, expiresAt, extra, headers, idTokenClaims, kid, subject, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ConsentSession {\n");
    sb.append("    allowedTopLevelClaims: ").append(toIndentedString(allowedTopLevelClaims)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    consentChallenge: ").append(toIndentedString(consentChallenge)).append("\n");
    sb.append("    excludeNotBeforeClaim: ").append(toIndentedString(excludeNotBeforeClaim)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    idTokenClaims: ").append(toIndentedString(idTokenClaims)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

