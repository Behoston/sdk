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
pub struct SubmitSelfServiceLoginFlowWithPasswordMethod {
    /// Sending the anti-csrf token is only required for browser login flows.
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Method should be set to \"password\" when logging in using the identifier and password strategy.
    #[serde(rename = "method", skip_serializing_if = "Option::is_none")]
    pub method: Option<String>,
    /// The user's password.
    #[serde(rename = "password", skip_serializing_if = "Option::is_none")]
    pub password: Option<String>,
    /// Identifier is the email or username of the user trying to log in.
    #[serde(rename = "password_identifier", skip_serializing_if = "Option::is_none")]
    pub password_identifier: Option<String>,
}

impl SubmitSelfServiceLoginFlowWithPasswordMethod {
    pub fn new() -> SubmitSelfServiceLoginFlowWithPasswordMethod {
        SubmitSelfServiceLoginFlowWithPasswordMethod {
            csrf_token: None,
            method: None,
            password: None,
            password_identifier: None,
        }
    }
}


