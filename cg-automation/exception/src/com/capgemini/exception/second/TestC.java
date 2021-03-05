package com.capgemini.exception.second;

public class TestC {

	TestC() throws InterruptedException { // throws keyword can be used at constructor

	}

	public static void main(String[] args) {

		System.out.println("main starts");

		try {
			print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main ends");
	}

	static void print() throws InterruptedException {// throws keyword can be used at method declaration

		Thread.sleep(2000);

	}
}
