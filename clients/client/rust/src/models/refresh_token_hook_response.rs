/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.24
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct RefreshTokenHookResponse {
    #[serde(rename = "session", skip_serializing_if = "Option::is_none")]
    pub session: Option<Box<crate::models::AcceptOAuth2ConsentRequestSession>>,
}

impl Default for RefreshTokenHookResponse {
    fn default() -> Self {
        Self::new()
    }
}

impl RefreshTokenHookResponse {
    pub fn new() -> RefreshTokenHookResponse {
        RefreshTokenHookResponse {
                session: None,
        }
    }
}


