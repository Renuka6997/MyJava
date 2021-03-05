package com.capgemini.exception.uncheckedcustomexception;

public class InvalidAgeException extends RuntimeException{

	String message="Age should be greater than 17";
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
