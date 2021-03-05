package com.capgemini.abstraction;

public class TestA {
	public static void main(String[] args) {

		Machine m = new Machine(); //object is created for machine class

		HDFC h = new HDFC();
		m.slot(h);  // here the HDFC address h is stored in m
		
		System.out.println("************************");

		ICICI i = new ICICI();
		m.slot(i);
	}
}
