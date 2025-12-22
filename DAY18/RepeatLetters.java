public class RepeatLetters{

	public static void main(String [] args){
		String words = "Hello World";
		 System.out.print(getRepeatedLetters( words));

	}

	public static String getRepeatedLetters(String words){

		String newLetter = "";
		

		for(int count = 0; count < words.length(); count++){
			char letters = words.charAt(count);
			
			if(Character.isUpperCase(letters) || Character.isLowerCase(letters)){

				newLetter += letters;
				newLetter += letters;
				
				

			}

		}

		return newLetter;
		
	
	}

}