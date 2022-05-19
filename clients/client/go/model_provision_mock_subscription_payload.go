/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.180
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ProvisionMockSubscriptionPayload struct for ProvisionMockSubscriptionPayload
type ProvisionMockSubscriptionPayload struct {
	IdentityId string `json:"identity_id"`
	PlanOrPrice string `json:"plan_or_price"`
}

// NewProvisionMockSubscriptionPayload instantiates a new ProvisionMockSubscriptionPayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProvisionMockSubscriptionPayload(identityId string, planOrPrice string) *ProvisionMockSubscriptionPayload {
	this := ProvisionMockSubscriptionPayload{}
	this.IdentityId = identityId
	this.PlanOrPrice = planOrPrice
	return &this
}

// NewProvisionMockSubscriptionPayloadWithDefaults instantiates a new ProvisionMockSubscriptionPayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProvisionMockSubscriptionPayloadWithDefaults() *ProvisionMockSubscriptionPayload {
	this := ProvisionMockSubscriptionPayload{}
	return &this
}

// GetIdentityId returns the IdentityId field value
func (o *ProvisionMockSubscriptionPayload) GetIdentityId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.IdentityId
}

// GetIdentityIdOk returns a tuple with the IdentityId field value
// and a boolean to check if the value has been set.
func (o *ProvisionMockSubscriptionPayload) GetIdentityIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.IdentityId, true
}

// SetIdentityId sets field value
func (o *ProvisionMockSubscriptionPayload) SetIdentityId(v string) {
	o.IdentityId = v
}

// GetPlanOrPrice returns the PlanOrPrice field value
func (o *ProvisionMockSubscriptionPayload) GetPlanOrPrice() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.PlanOrPrice
}

// GetPlanOrPriceOk returns a tuple with the PlanOrPrice field value
// and a boolean to check if the value has been set.
func (o *ProvisionMockSubscriptionPayload) GetPlanOrPriceOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.PlanOrPrice, true
}

// SetPlanOrPrice sets field value
func (o *ProvisionMockSubscriptionPayload) SetPlanOrPrice(v string) {
	o.PlanOrPrice = v
}

func (o ProvisionMockSubscriptionPayload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["identity_id"] = o.IdentityId
	}
	if true {
		toSerialize["plan_or_price"] = o.PlanOrPrice
	}
	return json.Marshal(toSerialize)
}

type NullableProvisionMockSubscriptionPayload struct {
	value *ProvisionMockSubscriptionPayload
	isSet bool
}

func (v NullableProvisionMockSubscriptionPayload) Get() *ProvisionMockSubscriptionPayload {
	return v.value
}

func (v *NullableProvisionMockSubscriptionPayload) Set(val *ProvisionMockSubscriptionPayload) {
	v.value = val
	v.isSet = true
}

func (v NullableProvisionMockSubscriptionPayload) IsSet() bool {
	return v.isSet
}

func (v *NullableProvisionMockSubscriptionPayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProvisionMockSubscriptionPayload(val *ProvisionMockSubscriptionPayload) *NullableProvisionMockSubscriptionPayload {
	return &NullableProvisionMockSubscriptionPayload{value: val, isSet: true}
}

func (v NullableProvisionMockSubscriptionPayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProvisionMockSubscriptionPayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


