/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.1.0-alpha.2
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// Session : A Session



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct Session {
    /// Active state. If false the session is no longer active.
    #[serde(rename = "active", skip_serializing_if = "Option::is_none")]
    pub active: Option<bool>,
    /// The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
    #[serde(rename = "authenticated_at", skip_serializing_if = "Option::is_none")]
    pub authenticated_at: Option<String>,
    /// A list of authenticators which were used to authenticate the session.
    #[serde(rename = "authentication_methods", skip_serializing_if = "Option::is_none")]
    pub authentication_methods: Option<Vec<crate::models::SessionAuthenticationMethod>>,
    #[serde(rename = "authenticator_assurance_level", skip_serializing_if = "Option::is_none")]
    pub authenticator_assurance_level: Option<crate::models::AuthenticatorAssuranceLevel>,
    /// The Session Expiry  When this session expires at.
    #[serde(rename = "expires_at", skip_serializing_if = "Option::is_none")]
    pub expires_at: Option<String>,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "identity")]
    pub identity: Box<crate::models::Identity>,
    /// The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.
    #[serde(rename = "issued_at", skip_serializing_if = "Option::is_none")]
    pub issued_at: Option<String>,
}

impl Session {
    /// A Session
    pub fn new(id: String, identity: crate::models::Identity) -> Session {
        Session {
            active: None,
            authenticated_at: None,
            authentication_methods: None,
            authenticator_assurance_level: None,
            expires_at: None,
            id,
            identity: Box::new(identity),
            issued_at: None,
        }
    }
}


