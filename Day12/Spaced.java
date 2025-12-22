import java.util.Arrays;
public class Spaced{
	public static void main(String [] args){
		String number = "1, 2, 3, 4, 5";
		System.out.print(separatedNumber(number));
	}

	public static String separatedNumber(String number){
		String cleanSpace = number.replaceAll(" ", "").replaceAll(",", "");
		int convertNumber = Integer.parseInt(cleanSpace);
		int getLength = String.valueOf(convertNumber).length();
		
		int [] newNumber = new int [getLength];

		int count = 0;
		while(convertNumber > 0){
			int remainder =  convertNumber % 10;
			newNumber[count] = remainder;
			convertNumber /= 10;
			count++;
		}	
		String highest =  joinedNumber( newNumber);
			
		return highest;	
	}


	public static int getHighest(int [] numbers){
		int highest = numbers[0];
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] > highest){
				highest = numbers[count];
			
			}
		}
	return highest;


	}


	public static int getLowest(int [] numbers){
		int lowest = numbers[0];
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] < lowest){
				lowest = numbers[count];
			
			}
		}
	return lowest;


	}

	public static String joinedNumber(int [] numbers){
		String result = "";
		int highest = getHighest(numbers);
		int lowest = getLowest(numbers);

		result += highest;
		result += lowest;
		return result;
	}



}