//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class HandledOAuth2LogoutRequest {
  /// Returns a new [HandledOAuth2LogoutRequest] instance.
  HandledOAuth2LogoutRequest({
    required this.redirectTo,
  });

  /// Original request URL to which you should redirect the user if request was already handled.
  String redirectTo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is HandledOAuth2LogoutRequest &&
     other.redirectTo == redirectTo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (redirectTo.hashCode);

  @override
  String toString() => 'HandledOAuth2LogoutRequest[redirectTo=$redirectTo]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'redirect_to'] = redirectTo;
    return _json;
  }

  /// Returns a new [HandledOAuth2LogoutRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static HandledOAuth2LogoutRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "HandledOAuth2LogoutRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "HandledOAuth2LogoutRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return HandledOAuth2LogoutRequest(
        redirectTo: mapValueOfType<String>(json, r'redirect_to')!,
      );
    }
    return null;
  }

  static List<HandledOAuth2LogoutRequest>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <HandledOAuth2LogoutRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = HandledOAuth2LogoutRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, HandledOAuth2LogoutRequest> mapFromJson(dynamic json) {
    final map = <String, HandledOAuth2LogoutRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = HandledOAuth2LogoutRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of HandledOAuth2LogoutRequest-objects as value to a dart map
  static Map<String, List<HandledOAuth2LogoutRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<HandledOAuth2LogoutRequest>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = HandledOAuth2LogoutRequest.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'redirect_to',
  };
}
