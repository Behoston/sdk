# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.AdminCreateJsonWebKeySetBody do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :alg,
    :kid,
    :use
  ]

  @type t :: %__MODULE__{
    :alg => String.t,
    :kid => String.t,
    :use => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.AdminCreateJsonWebKeySetBody do
  def decode(value, _options) do
    value
  end
end
