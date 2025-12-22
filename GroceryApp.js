const prompt = require('prompt-sync')();

function mainApp() {
  const listItems = ["soaps"];
  mainMenu(listItems);
}

function mainMenu(listItems) {
  const menuPrompt = `
        GROCERY MANAGER APP
    
        1 => Add item
        2 => Remove item
        3 => Show all available items
    `;

  console.log(menuPrompt);
  const menu = prompt("Enter any key from above: ");

  switch (menu) {
    case "1":
      const itemToAdd = prompt("Add items to your grocery list: ");
      // The push method modifies the array in place and returns the new length.
      // Call it directly and don't reassign the array.
      addItems(listItems, itemToAdd); 
      console.log("Item has been added");
      mainMenu(listItems);
      break;

    case "2":
      const itemToRemove = prompt("Remove any item from your grocery list: ");
      // The filter method returns a *new* array, so you must reassign it.
      const updatedList = removeItems(listItems, itemToRemove);
      // Check if the item was actually removed
      if (updatedList.length < listItems.length) {
        console.log("Item has been removed");
        mainMenu(updatedList);
      } else {
        console.log("Item not found");
        mainMenu(listItems);
      }
      break;

    case "3":
      for (let count = 0; count < listItems.length; count++) {
        console.log(listItems[count]);
      }
      mainMenu(listItems);
      break;

    default:
      console.log("Invalid option. Please try again.");
      mainMenu(listItems);
  }
}

function addItems(listItems, item) {
  listItems.push(item);
}

function removeItems(listItems, itemRemoved) {
  return listItems.filter((item) => item !== itemRemoved);
}

// Start the application
mainApp();
