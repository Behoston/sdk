/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.85
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// StripeCustomerResponse struct for StripeCustomerResponse
type StripeCustomerResponse struct {
	Id *string `json:"id,omitempty"`
}

// NewStripeCustomerResponse instantiates a new StripeCustomerResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewStripeCustomerResponse() *StripeCustomerResponse {
	this := StripeCustomerResponse{}
	return &this
}

// NewStripeCustomerResponseWithDefaults instantiates a new StripeCustomerResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewStripeCustomerResponseWithDefaults() *StripeCustomerResponse {
	this := StripeCustomerResponse{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *StripeCustomerResponse) GetId() string {
	if o == nil || o.Id == nil {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *StripeCustomerResponse) GetIdOk() (*string, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *StripeCustomerResponse) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *StripeCustomerResponse) SetId(v string) {
	o.Id = &v
}

func (o StripeCustomerResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	return json.Marshal(toSerialize)
}

type NullableStripeCustomerResponse struct {
	value *StripeCustomerResponse
	isSet bool
}

func (v NullableStripeCustomerResponse) Get() *StripeCustomerResponse {
	return v.value
}

func (v *NullableStripeCustomerResponse) Set(val *StripeCustomerResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableStripeCustomerResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableStripeCustomerResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableStripeCustomerResponse(val *StripeCustomerResponse) *NullableStripeCustomerResponse {
	return &NullableStripeCustomerResponse{value: val, isSet: true}
}

func (v NullableStripeCustomerResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableStripeCustomerResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


