package com.capgemini.javabasics.designcar;

public class Car {
	String color;
	String brand;
	double mileage;
	static double price;

	static void moveForward() {
		System.out.println("moving forward...");
	}

	static void moveBackward() {
		System.out.println("moving backward...");
	}
}
