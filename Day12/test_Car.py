import math
from unittest import TestCase
from Car import*


class TestCar(TestCase):
    def test_the_status_of_car(self):
        car = Car()
        actual = car.get_fuel_level()
        self.assertEqual(actual, 0)

    def test_that_car_can_start(self):
        car = Car()
        car.get_car_refuel(20)
        car.start_car()
        actual = car.check_is_running()
        self.assertTrue(actual)

    def test_that_car_can_stop(self):
        car = Car()
        car.stop_car()
        actual = car.check_is_running()
        self.assertFalse(actual)

    def test_that_car_can_be_refueled(self):
        car = Car()
        car.get_car_refuel(20)
        actual = car.get_fuel_level()
        expected = 20
        self.assertEqual(actual, expected)

    def test_that_car_can_drive(self):
        car = Car()
        car.get_car_refuel(20)
        car.start_car()
        car.drive_car(20)
        actual = car.get_fuel_level()
        expected = 18.32
        self.assertEqual(math.ceil(actual), math.ceil(expected))

