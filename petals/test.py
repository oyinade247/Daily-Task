from unittest import TestCase
from upper_case import change_upper

class TestMyFunction(TestCase):
	def test_that_the_output_is_in_upper_case(self):
		actual = change_upper("	the lord is good")
		expected = "THE LORD IS GOOD"
		self.assertEqual(actual,expected)

	def test_that_the_output_is_not_in_lower_case(self):
		