package com.capgemini.advancedjava.i;

public class BMW implements Automobile, AutomobileWithAbs { /*
															 * one class can implement one or more interfaces
															 */

	public void gear() {
		System.out.println("BMW gear method...");
	}

	public void gps() {
		System.out.println("BMW gps method....");
	}

	public void abs() {
		System.out.println("BMW anti-lock breaking system method...");
	}

}
