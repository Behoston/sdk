/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.35
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PatchDelta {
    #[serde(rename = "action", skip_serializing_if = "Option::is_none")]
    pub action: Option<ActionEnum>,
    #[serde(rename = "relation_tuple", skip_serializing_if = "Option::is_none")]
    pub relation_tuple: Option<Box<crate::models::RelationTuple>>,
}

impl Default for PatchDelta {
    fn default() -> Self {
        Self::new()
    }
}

impl PatchDelta {
    pub fn new() -> PatchDelta {
        PatchDelta {
                action: None,
                relation_tuple: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ActionEnum {
    #[serde(rename = "insert")]
    Insert,
    #[serde(rename = "delete")]
    Delete,
}

