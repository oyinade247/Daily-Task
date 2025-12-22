import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest{

	@Test
	public void testACarStatus(){
		Car car = new Car();
		boolean actual = car.getCarStatus();		
		assertFalse( actual);
	}


	@Test
	public void testThatACarCanStart(){
	Car car = new Car();
	car.refuelCar(20);
	car.startCar();
	boolean actual = car.getCarStatus();		
	assertTrue(actual);

	}


	@Test
	public void testThatCarCanStop(){
	Car car = new Car();
	car.stopCar();
	boolean actual = car.getCarStatus();
	assertFalse(actual);



	}

	@Test
	public void testThatCarCanBeRefueled(){
	Car car = new Car();
	car.refuelCar(20);
	double actual = car.getFuelLevel();
	double expected = 20.0;
	assertEquals(actual,expected);

	}

	@Test
	public void testThatACarCanDrive(){
	Car car = new Car();
	car.refuelCar(20);
	car.startCar();
	car.drive(20);
	double actual = car.getFuelLevel();
	double expected = 18.333333333333332;
	assertEquals(actual,expected);

		
	}


	




}