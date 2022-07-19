/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.1.0-alpha.2
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ProvisionMockSubscriptionPayload {
    #[serde(rename = "identity_id")]
    pub identity_id: String,
    #[serde(rename = "plan_or_price")]
    pub plan_or_price: String,
}

impl ProvisionMockSubscriptionPayload {
    pub fn new(identity_id: String, plan_or_price: String) -> ProvisionMockSubscriptionPayload {
        ProvisionMockSubscriptionPayload {
            identity_id,
            plan_or_price,
        }
    }
}


