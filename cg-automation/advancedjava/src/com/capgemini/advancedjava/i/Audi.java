package com.capgemini.advancedjava.i;

public class Audi implements AutomobileWithAbs {
	/* here class can implement the properties present in the Interface */
	public void gear() {
		System.out.println("Audi gear method...");
	}

	public void gps() {
		System.out.println("Audi gps method...");
	}

	public void abs() {
		System.out.println("Audi anti-lock breaking system method..");
	}
}
