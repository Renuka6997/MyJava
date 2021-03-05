package com.capgemini.stringclass;

class TestA {
	public static void main(String[] args) {

		String s = "renu";
		System.out.println("s=" + s);
		String s1 = "kusu";
		System.out.println("s1=" + s1);
		s = "renuka";
		System.out.println("s=" + s);
		String d = "kusu";
		System.out.println("d=" + d);

		/*
		 * if (s1 == d) { System.out.println("s1 and d are equal"); } else {
		 * System.out.println("s1 and d are not equal"); }
		 */

		if (s1.equals(d)) {
			System.out.println("s1 and d are equal");
		} else {
			System.out.println("s1 and d are not equal");
		}

		System.out.println("**************************");

		String p = new String("sony");
		System.out.println("p=" + p);

		String p1 = new String("surya");
		System.out.println("p1=" + p1);

		String p2 = new String("surya");
		System.out.println("p2=" + p2);

		/*
		 * Never ever compare strings or objects using equal to operator if (p1 == p2) {
		 * System.out.println("p1 and p2 are equal"); } else {
		 * System.out.println("p1 and p2 are not equal"); }
		 */

		if (p1.equals(p2)) {
			System.out.println("p1 and p2 are equal");
		} else {
			System.out.println("p1 and p2 are not equal");
		}

		String s2 = "abc";
		System.out.println("s2=" + s2);
		String v = s2.toUpperCase();
		System.out.println("v=" + v);

	}
}