import java.util.Arrays;
public class BreakFast{
	public static void main(String [] args){

	int [] numbers =  {1, -2, 3, -4, 5};
	
	System.out.print(Arrays.toString(additiveInverse(numbers)));
	}


	public static int [] additiveInverse(int [] numbers){
		int [] newArray = new int [numbers.length];

		for(int count = 0; count < numbers.length; count ++){
			if(numbers[count] < 0 || numbers[count] > 0){
				newArray[count] = numbers[count] * - 1;
			}
			
		}
		return newArray;

	}

}