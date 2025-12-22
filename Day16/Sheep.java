import java.util.Arrays;
public class Sheep{

	public static void main(String [] args){
	boolean [] sheep = {true,  true,  true,  false,  true,  true,  true,  true ,true,  false, true, false,  true,  false, false, true ,true,  true,  true,  true ,false, false, true,  true};
				System.out.print(countSheep(sheep));

	}



	public static int countSheep(boolean [] sheep){
		int counter = 0;

		for(int count = 0; count < sheep.length; count++){
			if(sheep[count] == true){
				counter++;
			}
		}
	return counter;

	}

}