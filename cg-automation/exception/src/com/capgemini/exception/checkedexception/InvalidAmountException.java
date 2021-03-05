package com.capgemini.exception.checkedexception;

public class InvalidAmountException extends Exception {

	private String message = "Insufficient Funds";

	@Override
	public String getMessage() {
		return message;
	}
}
