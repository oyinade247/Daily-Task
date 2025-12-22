def add_item(database, grocery_items):
	if type(grocery_items) is not str:
		raise TypeError ("Invalid input")
	if grocery_items in database:
		raise ValueError ("Items in the list already")
	database.append(grocery_items.lower())
	return database 

def remove_item(database, remove_items):
	if type(remove_items) is not str:
		raise TypeError ("Invalid input")
	database.remove(remove_items.lower())
	return database

def show_items(database):
	for items in database:
		return database

	
	