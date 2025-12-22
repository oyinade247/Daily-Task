from unittest import TestCase
from petals_functions import*


class TestMyPetals(TestCase):
	def test_that_petals__function_exist(self):
		check_true_love(0, 0)

	def test_that_check_function_returns_true_one_number_is_even_and_another_number_is_odd(self):
		actual = check_true_love(10, 3)
		expected = True
		self.assertEqual(actual, expected)

	def test_that_check_function_returns_false_if_petals_are_even(self):
		actual = check_true_love(10, 10)
		expected = False
		self.assertEqual(actual, expected)

	


	
	


 