# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.VerifiableIdentityAddress do
  @moduledoc """
  VerifiableAddress is an identity's verifiable address
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :id,
    :status,
    :updated_at,
    :value,
    :verified,
    :verified_at,
    :via
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t | nil,
    :id => String.t | nil,
    :status => String.t,
    :updated_at => DateTime.t | nil,
    :value => String.t,
    :verified => boolean(),
    :verified_at => DateTime.t | nil,
    :via => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.VerifiableIdentityAddress do
  def decode(value, _options) do
    value
  end
end

