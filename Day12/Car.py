class Car:
    def __init__(self):
        self.fuel_level = 0
        self.isRunning = False

    def get_fuel_level(self):
        return self.fuel_level
    def check_is_running(self):
        return self.isRunning

    def start_car(self):
        if self.fuel_level <= 0:
            raise ValueError("Car need to be fueled")
        self.isRunning = True

    def stop_car(self):
        self.isRunning = False

    def get_car_refuel(self, liters):
        if liters + self.fuel_level > 50:
            self.fuel_level = 50
        self.fuel_level += liters

    def drive_car(self,distance):
        if self.isRunning and self.fuel_level > 0:
            fuel_efficiency = 12
            fuel_consumed = distance /fuel_efficiency
            self.fuel_level = self.fuel_level - fuel_consumed

