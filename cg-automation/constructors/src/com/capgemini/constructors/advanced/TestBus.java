package com.capgemini.constructors.advanced;

public class TestBus {

	public static void main(String[] args) {
		Bus b1 = new Bus(50, "Black");
		b1.getBusDetails();

		System.out.println("*********************");

		Bus b2 = new Bus(40);
		b2.getBusDetails();

		System.out.println("**********************");

		Bus b3 = new Bus();
		b3.getBusDetails();

	}

}
