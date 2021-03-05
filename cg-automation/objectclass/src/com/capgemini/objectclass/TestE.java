package com.capgemini.objectclass;

public class TestE {
	public static void main(String[] args) {

		Cow c1 = new Cow(1, "ganga", 5627.89);
		Cow c2 = new Cow(2, "jamuna", 5637.89);
		Cow c3 = new Cow(1, "ganga", 5627.89);
		Cow c4 = c1;

		boolean isEqual = c1.equals(c2);
		System.out.println("c1 and c2 is equal " + isEqual);

		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(null));
		String s = "hello";
		System.out.println("hello");
	}
}
