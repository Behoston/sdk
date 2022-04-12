"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.0.1-alpha.162
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.string_slice_json_format import StringSliceJSONFormat
globals()['StringSliceJSONFormat'] = StringSliceJSONFormat
from ory_client.model.project_metadata import ProjectMetadata


class TestProjectMetadata(unittest.TestCase):
    """ProjectMetadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testProjectMetadata(self):
        """Test ProjectMetadata"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ProjectMetadata()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()