# coding: utf-8

"""
    ORY Keto

    A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.1
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import ory_keto_client
from ory_keto_client.api.health_api import HealthApi  # noqa: E501
from ory_keto_client.rest import ApiException


class TestHealthApi(unittest.TestCase):
    """HealthApi unit test stubs"""

    def setUp(self):
        self.api = ory_keto_client.api.health_api.HealthApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_is_instance_alive(self):
        """Test case for is_instance_alive

        Check alive status  # noqa: E501
        """
        pass

    def test_is_instance_ready(self):
        """Test case for is_instance_ready

        Check readiness status  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()