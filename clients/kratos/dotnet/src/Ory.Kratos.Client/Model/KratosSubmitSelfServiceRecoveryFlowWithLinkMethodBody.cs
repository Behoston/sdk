/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.8.2-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody
    /// </summary>
    [DataContract(Name = "submitSelfServiceRecoveryFlowWithLinkMethodBody")]
    public partial class KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody : IEquatable<KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody" /> class.
        /// </summary>
        /// <param name="csrfToken">Sending the anti-csrf token is only required for browser login flows..</param>
        /// <param name="email">Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email (required).</param>
        /// <param name="method">Method supports &#x60;link&#x60; only right now. (required).</param>
        public KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody(string csrfToken = default(string), string email = default(string), string method = default(string))
        {
            // to ensure "email" is required (not null)
            if (email == null) {
                throw new ArgumentNullException("email is a required property for KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody and cannot be null");
            }
            this.Email = email;
            // to ensure "method" is required (not null)
            if (method == null) {
                throw new ArgumentNullException("method is a required property for KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody and cannot be null");
            }
            this.Method = method;
            this.CsrfToken = csrfToken;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Sending the anti-csrf token is only required for browser login flows.
        /// </summary>
        /// <value>Sending the anti-csrf token is only required for browser login flows.</value>
        [DataMember(Name = "csrf_token", EmitDefaultValue = false)]
        public string CsrfToken { get; set; }

        /// <summary>
        /// Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
        /// </summary>
        /// <value>Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email</value>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// Method supports &#x60;link&#x60; only right now.
        /// </summary>
        /// <value>Method supports &#x60;link&#x60; only right now.</value>
        [DataMember(Name = "method", IsRequired = true, EmitDefaultValue = false)]
        public string Method { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody {\n");
            sb.Append("  CsrfToken: ").Append(CsrfToken).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody);
        }

        /// <summary>
        /// Returns true if KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosSubmitSelfServiceRecoveryFlowWithLinkMethodBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CsrfToken == input.CsrfToken ||
                    (this.CsrfToken != null &&
                    this.CsrfToken.Equals(input.CsrfToken))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Method == input.Method ||
                    (this.Method != null &&
                    this.Method.Equals(input.Method))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.CsrfToken != null)
                    hashCode = hashCode * 59 + this.CsrfToken.GetHashCode();
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.Method != null)
                    hashCode = hashCode * 59 + this.Method.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
