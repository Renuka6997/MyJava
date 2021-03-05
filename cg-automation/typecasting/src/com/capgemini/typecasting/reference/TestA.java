package com.capgemini.typecasting.reference;

public class TestA {
	public static void main(String[] args) {

		Pen p = new Pen();
		System.out.println(p.cost);
		p.write();

		Marker m = new Marker();
		System.out.println(m.cost);
		m.write();
		System.out.println(m.size);
		m.color();

		Pen p1 = new Marker(); // UpCasting
		System.out.println(p1.cost);
		p1.write();
//		System.out.println(p1.size); //while UpCasting sub class properties are hidden
//		p1.color();

		Marker m1 = (Marker) p1; // DownCasting
		System.out.println(m1.cost);
		m1.write();
		System.out.println(m1.size);
		m1.color();

		/*
		 * before DownCasting, UpCasting should be done or it will throw
		 * java.lang.ClassCastException
		 * Marker m2=(Marker)p;
		 */

	}
}
