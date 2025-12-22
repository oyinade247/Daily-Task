import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescendingTest{

@Test
public void testThatDescendingWorksAsExpected(){
	DescendingOrder descending = new DescendingOrder();
	
	int number = 12345;
	String actual = descending.Descending(number);
	String expected = "54321";
	assertEquals(actual,expected);


}

@Test
public void testThatSoretedArrayCanBeSorted(){
	DescendingOrder descending = new DescendingOrder();
	int [] number = {1,2,3,4,5};
	int []actual = descending.sortArray(number);
	int [] expected = {5,4,3,2,1};
	assertArrayEquals(actual, expected);


}


@Test
public void testThatJoinedArrayCanBeJoined(){
	DescendingOrder descending = new DescendingOrder();
	int [] number = {1,2,3,4,5};
	String  actual = descending.joinedNumbers(number);
	String expected = "12345";
	assertEquals(actual,expected);



}


}