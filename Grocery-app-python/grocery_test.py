from unittest import TestCase
from grocery_function import add_item, remove_item,show_items

class TestMyFunction(TestCase):
	def test_that_items_can_be_added_to_the_list(self):
		database = ["detergent", "drinks"]
		items = "food"
		actual = add_item(database, items)
		expected = ["detergent", "drinks", "food"]
		self.assertEqual(actual, expected)

	def test_that_items_can_be_added_in_different_case_character(self):
		database = ["detergent", "drinks"]
		items = "FooD"
		actual = add_item(database, items)
		expected = ["detergent", "drinks", "food"]
		self.assertEqual(actual, expected)

	def test_that_you_cannot_add_items_that_already_exist(self):
		self.assertRaises(ValueError,add_item, ["detergent", "drinks"], "drinks")

	def test_that_any_other_character_aside_string_cannot_be_inputed(self):
		self.assertRaises(TypeError,add_item, ["detergent", "drinks"], 543)

	def test_that_you_can_remove_items_from_the_list(self):
		database = ["skincare", "clothings","accesories"]
		removed_items = "skincare"
		actual = remove_item(database, removed_items)
		expected = ["clothings","accesories"]
		self.assertEqual(actual,expected)


	def test_that_you_can_remove_items_in_any_character_case(self):
		database = ["skincare", "clothings","accesories"]
		removed_items = "SkIncarE"
		actual = remove_item(database, removed_items)
		expected = ["clothings","accesories"]
		self.assertEqual(actual,expected)


	def test_that_you_cannnot_remove_items_that_does_not_exist(self):
		self.assertRaises(ValueError, remove_item, ["skincare", "clothings","accesories"], "car")

	def test_that_you_can_not_remove_items_in_other_datatypes(self):
		self.assertRaises(TypeError, remove_item, ["skincare", "clothings","accesories"], 543)


	def test_that_show_items_functions_works_as_expected(self):
		database = ["skincare", "clothings","accesories"]
		actual = show_items(database)
		expected = ["skincare", "clothings","accesories"]
		self.assertEqual(actual,expected)




	
		



	
	

	
		





	
		

		
