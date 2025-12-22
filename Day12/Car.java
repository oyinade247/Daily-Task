public class Car{
	private double fuelLevel;
	private boolean isRunning;
	



public double getFuelLevel(){
	return fuelLevel;

}

public boolean getCarStatus(){
	return isRunning;
}

public void startCar(){
	if(fuelLevel <= 0){
		throw new IllegalArgumentException("Car needs fuel");
	}
	isRunning = true;

}

public void stopCar(){
	isRunning = false;
}

public void refuelCar(double liters){
	
	if((liters + fuelLevel) > 50){	
		fuelLevel = 50;
	}
	this.fuelLevel += liters;


}

public void drive(double distance){
	if(isRunning && fuelLevel > 0){
		double fuelEfficiency = 12;
		double fuelConsumed = distance / fuelEfficiency;
		fuelLevel -= fuelConsumed;
	}
	
}



}

