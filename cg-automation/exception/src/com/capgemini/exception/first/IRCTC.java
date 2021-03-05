package com.capgemini.exception.first;

public class IRCTC {
	void confirmTicket() {
		System.out.println("irctc starts");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			throw e;
		}

		System.out.println("Booking Confirmed");
		System.out.println("irctc ends");
	}
}
