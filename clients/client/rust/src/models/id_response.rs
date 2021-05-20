/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.6
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// IdResponse : IDResponse Response to an API call that returns just an Id



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdResponse {
    /// The id of the newly created object.
    #[serde(rename = "Id")]
    pub id: String,
}

impl IdResponse {
    /// IDResponse Response to an API call that returns just an Id
    pub fn new(id: String) -> IdResponse {
        IdResponse {
            id,
        }
    }
}


