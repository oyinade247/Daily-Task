import java.util.Arrays;
public class Rearrange{
	public static void main(String [] args){

	int [] numbers = {4,0,2,0,1,0,3};
	//int [] newArray = new int [numbers.length];

	 
		
	for(int count = 0; count < numbers.length -1; count++){
		for(int counter = 0; counter < numbers.length - 1 -count; counter++ ){
			if(numbers[counter] > numbers[counter + 1]){
				int temp = numbers[counter];
                   		 numbers[counter] = numbers[counter + 1];
                   		 numbers[counter + 1] = temp;	
				
				
			  }



		}
		
		
	}
		System.out.print(Arrays.toString(numbers));

}
}