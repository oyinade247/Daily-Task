class Car{
    constructor(){
        this.fuelLevel = 0;
        this.isRunning = false;
    }


    getFuelLevel(){
        return this.fuelLevel;
    }

    checkIsRunning(){
        return this.isRunning;

    }

    startCar(){
        if(this.fuelLevel < 0){
            throw new Error("Car need to be fueled");
        }
        this.isRunning = true;

    }

    stopCar(){
        this.isRunning = false;
    }

    refuelCar(liters){
        if((liters + this.fuelLevel) > 50){
            this.fuelLevel = 50;
        }
        this.fuelLevel += liters;

    }
    driveCar(distance){
        if(this.isRunning && this.fuelLevel > 0){
            let fuelEfficiency = 12;
            let fuelConsumed = distance / fuelEfficiency;
            this.fuelLevel -= fuelConsumed;
        }

    }




}
 
module.exports = Car