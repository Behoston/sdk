/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.6
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// PluginDevice : PluginDevice plugin device



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PluginDevice {
    /// description
    #[serde(rename = "Description")]
    pub description: String,
    /// name
    #[serde(rename = "Name")]
    pub name: String,
    /// path
    #[serde(rename = "Path")]
    pub path: String,
    /// settable
    #[serde(rename = "Settable")]
    pub settable: Vec<String>,
}

impl PluginDevice {
    /// PluginDevice plugin device
    pub fn new(description: String, name: String, path: String, settable: Vec<String>) -> PluginDevice {
        PluginDevice {
            description,
            name,
            path,
            settable,
        }
    }
}


