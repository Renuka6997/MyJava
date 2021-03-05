package com.capgemini.hasarelation.weak;

public class Person {

	int age;
	String name;

	Marker m = new Marker();

	void eat() {
		System.out.println("eat method");
	}

	void walk() {
		System.out.println("walk method");
	}
}
