# ory_client.model.ProjectRevision

## Load the model package
```dart
import 'package:ory_client/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiUrl** | **String** | The Project API URL  The URL where the Project's APIs are available. | 
**applicationUrl** | **String** | Your Application URL  The URL where your application is available. Your users will be redirected to this URL when they successfully complete a login, logout, verification, recovery, or registration flow.  More fine-grained redirection patterns are available for the individual flows. | 
**createdAt** | [**DateTime**](DateTime.md) | The Project's Revision Creation Date | 
**defaultIdentitySchemaUrl** | **String** | Default Identity Schema URL  This represents your Ory Kratos Default Identity Schema. It is your identity's default schema. This allows setting custom fields such as \"address\", specifying whether you want to log in using email or a username, and more. For more information on this topic, please check out the identity documentation.  The value of this field can be either any \"https://\" URL - for example a file hosted at GitHub, or a `preset://`-prefixed string. Available profiles are:  profile://email profile://username | 
**errorUiUrl** | **String** | Self-Service Error UI URL  Sets the UI URL for the error UI. If left empty, this will use Ory's hosted pages. | [optional] 
**hosts** | **BuiltList<String>** |  | 
**id** | **String** |  | 
**kratosConfigVersion** | **String** | The Project's Kratos Config Version | [optional] 
**kratosCustomSchemaId** | [**NullUUID**](NullUUID.md) |  | [optional] 
**loginUiUrl** | **String** | Self-Service Login UI URL  Sets the UI URL for the login UI. If left empty, this will use Ory's hosted pages. | [optional] 
**lookupSecret** | [**ProjectLookupSecretConfig**](ProjectLookupSecretConfig.md) |  | [optional] 
**name** | **String** | The project's name. | 
**oidcProviders** | [**BuiltList<ProjectOidcConfig>**](ProjectOidcConfig.md) |  | [optional] 
**password** | [**ProjectPasswordConfig**](ProjectPasswordConfig.md) |  | [optional] 
**projectId** | **String** |  | 
**recovery** | [**ProjectRecoveryConfig**](ProjectRecoveryConfig.md) |  | [optional] 
**recoveryUiUrl** | **String** | Self-Service Login UI URL  Sets the UI URL for the recovery UI. If left empty, this will use Ory's hosted pages. | [optional] 
**redirectionConfig** | [**RedirectionConfig**](RedirectionConfig.md) |  | [optional] 
**registrationUiUrl** | **String** | Self-Service Login UI URL  Sets the UI URL for the registration UI. If left empty, this will use Ory's hosted pages. | [optional] 
**sessionAfterSignUp** | **bool** | Issue Session after Sign Up  If set to true, users will receive a session after they successfully signed up. Enabling this option allows account enumeration during registration flows. Read more: https://www.ory.sh/kratos/docs/self-service/flows/user-registration#successful-registration | 
**sessionSoft2fa** | **bool** | Enable Soft 2FA for Login Sessions | [optional] 
**settingsPrivilegedSessionMaxAgeSeconds** | **int** | Duration in Seconds of how long a Session is Privileged  Defines how long a session is considered privileged in seconds. If the session's authenticated_at is older than the value specified here, the user needs to re-authenticate to perform certain actions (e.g. password change). | [optional] 
**settingsSoft2fa** | **bool** | Enable Soft 2FA for Self-Service Settings Flows | [optional] 
**settingsUiUrl** | **String** | Self-Service Settings UI URL  Sets the UI URL for the settings UI. If left empty, this will use Ory's hosted pages. | [optional] 
**totp** | [**ProjectTotpConfig**](ProjectTotpConfig.md) |  | [optional] 
**updatedAt** | [**DateTime**](DateTime.md) | Last Time Project's Revision was Updated | 
**verification** | [**ProjectVerificationConfig**](ProjectVerificationConfig.md) |  | [optional] 
**verificationUiUrl** | **String** | Self-Service Login UI URL  Sets the UI URL for the verification UI. If left empty, this will use Ory's hosted pages. | [optional] 
**webauthn** | [**ProjectWebAuthnConfig**](ProjectWebAuthnConfig.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

