import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpacedTest{
	@Test
	public void testThatSeparatedFunctionWorksAsExpected(){
	Spaced space = new Spaced();
	String number = "1, 2, 3, 4, 5";
	String actual = space.separatedNumber(number);
	String expected = "5 1";
	assertEquals(actual,expected);


	}

	@Test
	public void testThatGetHighestCanGetHighest(){
	Spaced space = new Spaced();
	
	int [] numbers = {1,2,3,4,5};
	int  actual = space.getHighest(numbers);
	int  expected = 5; 
	assertEquals(actual,expected);
	}

	@Test
	public void testThatGetLowestCanGetLowest(){
	Spaced space = new Spaced();
	
	int [] number  = {2,1,3,4,5};
	int actual = space.getLowest(number);
	int expected = 1;
	assertEquals(actual,expected);

	}


	@Test
	public void testThatjoinedFunctionWorksAsExpected(){
	Spaced space = new Spaced();
	
	int number = 1;
	int number2 = 5;
	String joined = "1  + 5 ";
	String actual = space.joinedNumber(joined);
	String expected = "1 5";
	assertEquals(actual,expected);



	}



}

