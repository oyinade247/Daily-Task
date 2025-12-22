import java.util.Arrays;
public class Factorial{

	public static void main(String [] args){
		int number = 5;
		System.out.print(Arrays.toString(factorial(number)));
	}

	public static int[]  factorial(int number){
	
	int [] newArray = new int[number];

	for(int count = 1; count <= number; count++){
	newArray[number - count] = count;
	
		
	}
	return newArray;
		
	}

}