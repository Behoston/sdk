/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.6
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SubmitSelfServiceRecoveryFlowWithLinkMethod {
    /// Sending the anti-csrf token is only required for browser login flows.
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Email to Recover  Needs to be set when initiating the flow. If the email is a registered recovery email, a recovery link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email in: body
    #[serde(rename = "email", skip_serializing_if = "Option::is_none")]
    pub email: Option<String>,
}

impl SubmitSelfServiceRecoveryFlowWithLinkMethod {
    pub fn new() -> SubmitSelfServiceRecoveryFlowWithLinkMethod {
        SubmitSelfServiceRecoveryFlowWithLinkMethod {
            csrf_token: None,
            email: None,
        }
    }
}


