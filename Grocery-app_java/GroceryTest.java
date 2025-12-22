import org.junit.jupiter.api.Test;
import static org.junit.jupiter.Assertions.*;


public class GroceryTest{
@Test
public void testThatYouCanAddItemToTheList(){
	GroceryAppMain list = new GroceryAppMain();
	
	String database = {"divine"};
	String item = "soap"

	String[] actual = list.addItems(database,item);
	String[] expected = {"divine", "soap"};
	assertEquals(actual, expected);
	


	}


}