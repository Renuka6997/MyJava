package com.capgemini.constructors.advanced;

public class Bus {
	int seats;
	String color;

	Bus(int seats, String color) {
		this.seats = seats;
		this.color = color;
	}

	Bus(int seats) {

		this(seats, "RED");
	}

	Bus() {

		this(40);
	}

	void getBusDetails() {

		System.out.println("Welcome to Red Bus and the Seat Capacity is " + seats +color);

	}
}
