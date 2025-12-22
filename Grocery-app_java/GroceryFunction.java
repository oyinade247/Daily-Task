public class GroceryFunction{


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







}

