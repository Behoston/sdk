/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.24
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SelfServiceVerificationFlow : Used to verify an out-of-band communication channel such as an email address or a phone number.  For more information head over to: https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SelfServiceVerificationFlow {
    /// Active, if set, contains the registration method that is being used. It is initially not set.
    #[serde(rename = "active", skip_serializing_if = "Option::is_none")]
    pub active: Option<String>,
    /// ExpiresAt is the time (UTC) when the request expires. If the user still wishes to verify the address, a new request has to be initiated.
    #[serde(rename = "expires_at", skip_serializing_if = "Option::is_none")]
    pub expires_at: Option<String>,
    #[serde(rename = "id")]
    pub id: String,
    /// IssuedAt is the time (UTC) when the request occurred.
    #[serde(rename = "issued_at", skip_serializing_if = "Option::is_none")]
    pub issued_at: Option<String>,
    /// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
    #[serde(rename = "request_url", skip_serializing_if = "Option::is_none")]
    pub request_url: Option<String>,
    /// ReturnTo contains the requested return_to URL.
    #[serde(rename = "return_to", skip_serializing_if = "Option::is_none")]
    pub return_to: Option<String>,
    #[serde(rename = "state")]
    pub state: crate::models::SelfServiceVerificationFlowState,
    /// The flow type can either be `api` or `browser`.
    #[serde(rename = "type")]
    pub _type: String,
    #[serde(rename = "ui")]
    pub ui: Box<crate::models::UiContainer>,
}


impl SelfServiceVerificationFlow {
    /// Used to verify an out-of-band communication channel such as an email address or a phone number.  For more information head over to: https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation
    pub fn new(id: String, state: crate::models::SelfServiceVerificationFlowState, _type: String, ui: crate::models::UiContainer) -> SelfServiceVerificationFlow {
        SelfServiceVerificationFlow {
                active: None,
                expires_at: None,
                id,
                issued_at: None,
                request_url: None,
                return_to: None,
                state,
                _type,
                ui: Box::new(ui),
        }
    }
}


