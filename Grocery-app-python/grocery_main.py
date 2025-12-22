from grocery_function import add_item,remove_item,show_items

def main_menu(database):
	prompt = """
		WELCOME TO OYIN GROCERY LIST
		
		1 => ADD ITEM
		
		2 => REMOVE ITEM

		3 => SHOW ALL AVAILAIBLE ITEM
		
		""";
	print(prompt)
	main_input = input("Enter any number from above : ")
	match main_input:
		case "1" : 
			grocery_items = input("Add items to your grocery list: ")
			added_items = add_item(database, grocery_items)
			print("items have been added successfully")
			main_menu(database)

		case "2" :
			remove_items = input("remove items from your grocery list: ")
			removed_items = remove_item(database, remove_items)
			print("Items have been removed succesfully")
			main_menu(database)

		case "3" :
			for items in database:
				print(items)

			
			

			























def main():
	database = ["detergent","beverages","snacks","toiletries","hair product","food", "skincare"]
	main_menu(database)





main()
	



