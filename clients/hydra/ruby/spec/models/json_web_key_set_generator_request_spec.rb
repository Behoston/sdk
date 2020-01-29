=begin
#ORY Hydra

#Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.

The version of the OpenAPI document: v0.0.0-alpha.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryHydraClient::JsonWebKeySetGeneratorRequest
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'JsonWebKeySetGeneratorRequest' do
  before do
    # run before each test
    @instance = OryHydraClient::JsonWebKeySetGeneratorRequest.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of JsonWebKeySetGeneratorRequest' do
    it 'should create an instance of JsonWebKeySetGeneratorRequest' do
      expect(@instance).to be_instance_of(OryHydraClient::JsonWebKeySetGeneratorRequest)
    end
  end
  describe 'test attribute "alg"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "kid"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "use"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end