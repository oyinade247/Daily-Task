import unittest
from descending_order import *


class MyTestCase(unittest.TestCase):
    def test_that_number_can_be_sorted_from_ascending_order_to_descending_ordee(self):
        number = 12345
        actual = descending_order(number)
        expected = '54321'
        self.assertEqual(actual, expected)

    def test_that_number_cannot_be_negative_and_raise_value_error(self):
        self.assertRaises(ValueError, descending_order, -1)





if __name__ == '__main__':
    unittest.main()
