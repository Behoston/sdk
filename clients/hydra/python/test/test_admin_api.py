# coding: utf-8

"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.1
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import ory_hydra_client
from ory_hydra_client.api.admin_api import AdminApi  # noqa: E501
from ory_hydra_client.rest import ApiException


class TestAdminApi(unittest.TestCase):
    """AdminApi unit test stubs"""

    def setUp(self):
        self.api = ory_hydra_client.api.admin_api.AdminApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_accept_consent_request(self):
        """Test case for accept_consent_request

        Accept an consent request  # noqa: E501
        """
        pass

    def test_accept_login_request(self):
        """Test case for accept_login_request

        Accept an login request  # noqa: E501
        """
        pass

    def test_accept_logout_request(self):
        """Test case for accept_logout_request

        Accept a logout request  # noqa: E501
        """
        pass

    def test_create_json_web_key_set(self):
        """Test case for create_json_web_key_set

        Generate a new JSON Web Key  # noqa: E501
        """
        pass

    def test_create_o_auth2_client(self):
        """Test case for create_o_auth2_client

        Create an OAuth 2.0 client  # noqa: E501
        """
        pass

    def test_delete_json_web_key(self):
        """Test case for delete_json_web_key

        Delete a JSON Web Key  # noqa: E501
        """
        pass

    def test_delete_json_web_key_set(self):
        """Test case for delete_json_web_key_set

        Delete a JSON Web Key Set  # noqa: E501
        """
        pass

    def test_delete_o_auth2_client(self):
        """Test case for delete_o_auth2_client

        Deletes an OAuth 2.0 Client  # noqa: E501
        """
        pass

    def test_flush_inactive_o_auth2_tokens(self):
        """Test case for flush_inactive_o_auth2_tokens

        Flush Expired OAuth2 Access Tokens  # noqa: E501
        """
        pass

    def test_get_consent_request(self):
        """Test case for get_consent_request

        Get consent request information  # noqa: E501
        """
        pass

    def test_get_json_web_key(self):
        """Test case for get_json_web_key

        Fetch a JSON Web Key  # noqa: E501
        """
        pass

    def test_get_json_web_key_set(self):
        """Test case for get_json_web_key_set

        Retrieve a JSON Web Key Set  # noqa: E501
        """
        pass

    def test_get_login_request(self):
        """Test case for get_login_request

        Get an login request  # noqa: E501
        """
        pass

    def test_get_logout_request(self):
        """Test case for get_logout_request

        Get a logout request  # noqa: E501
        """
        pass

    def test_get_o_auth2_client(self):
        """Test case for get_o_auth2_client

        Get an OAuth 2.0 Client.  # noqa: E501
        """
        pass

    def test_get_version(self):
        """Test case for get_version

        Get service version  # noqa: E501
        """
        pass

    def test_introspect_o_auth2_token(self):
        """Test case for introspect_o_auth2_token

        Introspect OAuth2 tokens  # noqa: E501
        """
        pass

    def test_is_instance_alive(self):
        """Test case for is_instance_alive

        Check alive status  # noqa: E501
        """
        pass

    def test_list_o_auth2_clients(self):
        """Test case for list_o_auth2_clients

        List OAuth 2.0 Clients  # noqa: E501
        """
        pass

    def test_list_subject_consent_sessions(self):
        """Test case for list_subject_consent_sessions

        Lists all consent sessions of a subject  # noqa: E501
        """
        pass

    def test_prometheus(self):
        """Test case for prometheus

        Get snapshot metrics from the Hydra service. If you're using k8s, you can then add annotations to your deployment like so:  # noqa: E501
        """
        pass

    def test_reject_consent_request(self):
        """Test case for reject_consent_request

        Reject an consent request  # noqa: E501
        """
        pass

    def test_reject_login_request(self):
        """Test case for reject_login_request

        Reject a login request  # noqa: E501
        """
        pass

    def test_reject_logout_request(self):
        """Test case for reject_logout_request

        Reject a logout request  # noqa: E501
        """
        pass

    def test_revoke_authentication_session(self):
        """Test case for revoke_authentication_session

        Invalidates all login sessions of a certain user Invalidates a subject's authentication session  # noqa: E501
        """
        pass

    def test_revoke_consent_sessions(self):
        """Test case for revoke_consent_sessions

        Revokes consent sessions of a subject for a specific OAuth 2.0 Client  # noqa: E501
        """
        pass

    def test_update_json_web_key(self):
        """Test case for update_json_web_key

        Update a JSON Web Key  # noqa: E501
        """
        pass

    def test_update_json_web_key_set(self):
        """Test case for update_json_web_key_set

        Update a JSON Web Key Set  # noqa: E501
        """
        pass

    def test_update_o_auth2_client(self):
        """Test case for update_o_auth2_client

        Update an OAuth 2.0 Client  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()