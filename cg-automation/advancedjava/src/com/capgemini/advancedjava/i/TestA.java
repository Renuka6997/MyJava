package com.capgemini.advancedjava.i;

public class TestA {
	public static void main(String[] args) {

		Audi a = new Audi();
		a.gear();
		a.gps();
		a.gear();

		System.out.println("******************************");

		BMW b = new BMW();
		b.gear();
		b.gps();
		b.abs();

		System.out.println("Right Variable is :" + Automobile.right);
		System.out.println("Left Variable is :" + Automobile.left);

		System.out.println("*******************");

		Toyota t = new Toyota();
		t.gear();
		t.gear();

	}
}
