=begin
#Ory Kratos API

#Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 

The version of the OpenAPI document: v0.7.6-alpha.6
Contact: hi@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'date'
require 'time'

module OryKratosClient
  class SelfServiceSettingsFlowState
    SHOW_FORM = "show_form".freeze
    SUCCESS = "success".freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = SelfServiceSettingsFlowState.constants.select { |c| SelfServiceSettingsFlowState::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #SelfServiceSettingsFlowState" if constantValues.empty?
      value
    end
  end
end
