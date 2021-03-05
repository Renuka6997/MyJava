package com.capgemini.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {

		byte b = 20;
		System.out.println("b = " + b);
		int i = b;
		System.out.println("i=" + i);
		double d = b;
		System.out.println("d= " + d);

		System.out.println("**************");

		int x = 200;
		System.out.println("x=" + x);
		byte y = (byte) x;
		System.out.println("y=" + y);

		double p = 25.5;
		System.out.println("p=" + p);
		int q = (int) p;
		System.out.println("q=" + q);

	}
}
