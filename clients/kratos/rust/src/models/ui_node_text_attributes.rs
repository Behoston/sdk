/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.8.2-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UiNodeTextAttributes {
    /// A unique identifier
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "node_type")]
    pub node_type: String,
    #[serde(rename = "text")]
    pub text: Box<crate::models::UiText>,
}

impl UiNodeTextAttributes {
    pub fn new(id: String, node_type: String, text: crate::models::UiText) -> UiNodeTextAttributes {
        UiNodeTextAttributes {
            id,
            node_type,
            text: Box::new(text),
        }
    }
}


