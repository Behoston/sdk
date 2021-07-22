/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.16
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SelfServiceLogoutUrl {
    /// LogoutURL can be opened in a browser to  format: uri
    #[serde(rename = "logout_url", skip_serializing_if = "Option::is_none")]
    pub logout_url: Option<String>,
}

impl SelfServiceLogoutUrl {
    pub fn new() -> SelfServiceLogoutUrl {
        SelfServiceLogoutUrl {
            logout_url: None,
        }
    }
}

