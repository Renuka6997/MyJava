package com.capgemini.accessmodifiers.pkg2;

import com.capgemini.accessmodifiers.pkg1.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {

		Demo d = new Demo();
//		System.out.println(d.a); // it is a private, so it cannot be accessed
//		d.add();

//		System.out.println(d.b); //it is a default, so it cannot be accessed in different package
//		d.subtract();

		// protected
		Sample s = new Sample();
		System.out.println(s.c); // it is a protected, it can be accessed by using inheritance i.e. "extends"
		s.multiply();

		// public
		System.out.println(d.s);
		d.division();
	}
}