import java.util.Arrays;
public class DescendingOrder{

	public static void main(String [] args){
		int number = 194355;
		System.out.print(Descending(number));
	}

	public static String Descending(int number){
		int length = String.valueOf(number).length();
		int [] newNumber = new int [length];
		int count = 0;
		while(number > 0){
			int remainder = number % 10;
			newNumber[count] = remainder;
			number /= 10;
			count++;
		} 
		int [] sortedNumbers = sortArray(newNumber);
		String joined = joinedNumbers(sortedNumbers);
		return joined;

	}


	public static int[] sortArray(int [] numbers){
		for(int count = 0; count < numbers.length; count++){
			for(int counter = count + 1; counter < numbers.length; counter++){
					if(numbers[count] < numbers[counter]){
						int temp = numbers[count];
						numbers[count] = numbers[counter];
						numbers[counter] = temp;
					}
			}
		

		}
		return numbers;

	}

	public static String joinedNumbers(int [] numbers){
		String joined = "";
		for(int count = 0; count < numbers.length; count++){
			joined += numbers[count];

		}
		return joined;

	}



}