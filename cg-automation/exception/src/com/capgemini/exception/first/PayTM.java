package com.capgemini.exception.first;

public class PayTM {
	void bookingTicket() {
		System.out.println("paytm starts");

		IRCTC i = new IRCTC();
		try {
			i.confirmTicket();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("paytm ends");
	}
}
