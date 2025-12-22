const Car = require("./Car") 

test("Test that can has a status", () =>{
    const car = new Car();
    expect(car.getFuelLevel()).toBe(0)


})

test("Test that a car can start", () => {
    const car = new Car();
    car.refuelCar(20);
    car.startCar();
    expect(car.checkIsRunning()).toBe(true)
})

test("Test that a car can stop", ()=> {
    const car = new Car();
    car.stopCar();
    expect(car.checkIsRunning()).toBe(false)
})

test("Test that a car can be refueled", ()=> {
    const car = new Car();
    car.refuelCar(20)
    expect(car.getFuelLevel()).toBe(20);
})

test("Test that a car can drive", ()=>{
    const car = new Car();
    car.refuelCar(20)
    car.startCar()
    car.driveCar(20)
    expect (car.getFuelLevel()).toBe(18.3333333333333332)
})