# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Client.Model.IdentitySchemaLocation do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"location"
  ]

  @type t :: %__MODULE__{
    :"location" => String.t | nil
  }
end

defimpl Poison.Decoder, for: Client.Model.IdentitySchemaLocation do
  def decode(value, _options) do
    value
  end
end
