package com.capgemini.constructors.defaultc;

public class TestEmployee1 {
	public static void main(String[] args) {

		Employee1 e1 = new Employee1("Kusuma", 258, 50000.50);
		e1.printEmployeeDetails();

		Employee1 e2 = new Employee1("Urmi", 256, 35444.75);
		e2.printEmployeeDetails();

		Employee1 e3 = new Employee1("anu", 201, 36666.66);
		e3.printEmployeeDetails();
	}
}
