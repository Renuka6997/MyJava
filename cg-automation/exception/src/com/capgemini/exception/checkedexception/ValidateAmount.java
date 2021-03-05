package com.capgemini.exception.checkedexception;

public class ValidateAmount {

	void verifyAmount(int amount) throws InvalidAmountException {
		if (amount > 50000) {

			throw new InvalidAmountException();

		} else {

			System.out.println("Collect the Cash and take your card");
			System.out.println("Thank you for banking with us");

		}
	}
}
