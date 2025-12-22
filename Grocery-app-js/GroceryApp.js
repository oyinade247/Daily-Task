const prompt = require('prompt-sync')();
function main(){
	const listItems = ["soaps"];
	mainMenu(listItems);

}

function mainMenu(listItems){
	 let menuText = `
					GROCERY MANAGER APP
			
				1 => Add item

				2 => Remove item

				3 => Show all available items
				`;

				console.log(menuText);
				console.log("Enter any key from above: ");
				
				let menu = prompt("enter input: ");

				switch(menu){
					case "1": 
						let add = prompt("Add items to your grocery list: ");
						listItems = addItems(listItems, add);
						console.log("item have been added");
						mainMenu(listItems);

					case "2" :
						let remove = prompt("Remove any book from your grocery list: ");
						listItems =  removeItems(listItems, remove);
						console.log("items have been removed");
						mainMenu(listItems);


					case "3": 
						console.log(listItems);
						mainMenu(listItems);

					case "4":
						console.log("THANK YOU SO MUCH  BUT YOU ARE NOT WELCOME ");

						
						
													

					}

				

	

	}


function addItems(listItems,  item){
	listItems.push(item);
	return listItems;
}


function removeItems( listItems, itemRemoved){
	let newList = listItems.filter((item) => item !== itemRemoved)
	return newList;

}


	 
main();