package com.capgemini.exception.uncheckedcustomexception;

public class Validator {
	void verifyAge(int age) {

		if (age > 18) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Welcome to the party");
		}
	}
}
