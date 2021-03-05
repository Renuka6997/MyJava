package com.capgemini.exception.first;

public class TestTrainTicket {
	public static void main(String[] args) {
		System.out.println("main starts");

		PayTM p = new PayTM();
		p.bookingTicket();

		System.out.println("main ends");
	}
}
