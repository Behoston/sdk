# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SessionDevice do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :user_agent
  ]

  @type t :: %__MODULE__{
    :user_agent => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.SessionDevice do
  def decode(value, _options) do
    value
  end
end

