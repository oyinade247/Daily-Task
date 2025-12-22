import java.util.Scanner;
public class GroceryAppMain{

public static void main(String [] args){
	String [] listItems = {"soaps"};
	mainMenu(listItems);

}

public static void mainMenu(String [] listItems){
	String prompt = """
					GROCERY MANAGER APP
			
				1 => Add item

				2 => Remove item

				3 => Show all available items
				""";

				System.out.print(prompt);
				Scanner input = new Scanner(System.in);
				System.out.print("Enter any key from above: ");
				String menu = input.nextLine();

				switch(menu){
					case "1": 
						System.out.print("Add items to your grocery list: ");
						String item = input.nextLine();
						listItems = addItems(listItems, item);
						System.out.println("item have been added");
						mainMenu(listItems);

					case "2" :
						System.out.print("Remove any book from your grocery list: ");
						String itemRemoved = input.nextLine();
						listItems =  removeItems(listItems, itemRemoved);
						System.out.println("items have been removed");
						mainMenu(listItems);


					case "3": 
						for(int count = 0; count < listItems.length; count++){
							System.out.println(listItems[count]);
						}
						mainMenu(listItems);

						
						
													

					}

				

	

	}


public static String[] addItems(String[]listItems, String item){
	String [] newArray = new String[listItems.length + 1];
	
	for(int count = 0; count < listItems.length; count++){
		newArray[count] = listItems[count];
	}
		newArray[listItems.length] = item;
	return newArray;


}


public static String[] removeItems(String [] listItems, String itemRemoved){
	String [] newArray = new String[listItems.length - 1];
	
		int counter = 0;
	for(int count = 0; count < listItems.length; count++){
		if(listItems[count] .equals(itemRemoved)){
			counter = 1;
			continue;
			
		}
		newArray[count - counter] = listItems[count];
			
	
		
	}
	return newArray;






//public static String [] allItems(String [] listItems){

	//for(int count = 0; count < listItems.length; count++){
		//System.out.print(listItems[count]);
	//}
	//return

//}

	 




























}