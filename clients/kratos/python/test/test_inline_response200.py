"""
    Ory Kratos API

    Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests.   # noqa: E501

    The version of the OpenAPI document: v0.8.2-alpha.1
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.inline_response200 import InlineResponse200


class TestInlineResponse200(unittest.TestCase):
    """InlineResponse200 unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testInlineResponse200(self):
        """Test InlineResponse200"""
        # FIXME: construct object with mandatory attributes with example values
        # model = InlineResponse200()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
