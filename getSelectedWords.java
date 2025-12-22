import java.util.Arrays;
public class getSelectedWords{


	public static void main(String [] args ){

	String [] words = {"oyin","egg","semicolon"};
	System.out.print(Arrays.toString(getFourWords(words)));
	

	}
	public static String [] getFourWords(String [] words){
		String [] newArray = new String[words.length];
		for(int count = 0; count < words.length; count++){
			if(words[count].length() >= 4){
				newArray[count]	= words[count];
			}
		}

		return newArray;

	}
}