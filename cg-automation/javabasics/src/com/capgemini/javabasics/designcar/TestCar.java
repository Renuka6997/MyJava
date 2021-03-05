package com.capgemini.javabasics.designcar;

public class TestCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Black";
		c1.brand = "Vikram";
		c1.mileage = 100.5;

		Car c2 = new Car();
		c2.color = "White";
		c2.brand = "Renu";
		c2.mileage = 100.0;
		
		
		printCarDetails(c1);
		printCarDetails(c2);
	}

	static void printCarDetails(Car car) {
		System.out.println("color of car " + car.color);
		System.out.println("brand of car " + car.brand);
		System.out.println("mileage of car " + car.mileage);
		Car.price=90000000;
		System.out.println("price of car is "+Car.price);
		Car.moveForward();
		Car.moveBackward();
	}
}
