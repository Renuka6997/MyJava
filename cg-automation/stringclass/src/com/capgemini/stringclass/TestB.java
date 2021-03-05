package com.capgemini.stringclass;

public class TestB {
	public static void main(String[] args) {

		// StringBuffer

		StringBuffer sb = new StringBuffer("hello"); // or it can be written as using sb1
		StringBuffer sb1 = new StringBuffer();

		System.out.println("sb before " + sb);
		for (int i = 0; i < 5; i++) {
			sb.append(i); // by using sb1 we should give sb1.append("string name")
		}
		System.out.println("sb after " + sb);

		System.out.println("*************");

		String s = "hello";
		System.out.println("s before " + s);
		for (int i = 0; i < 5; i++) {
			s.toUpperCase();// it will create new object and as it is not stored so, it will print the old
							// value
		}
		System.out.println("s after " + s);

		// StringBuilder

		StringBuilder sbu = new StringBuilder("good morning");
		StringBuilder sbuu = new StringBuilder();
		System.out.println("sbu before " + sbu);

		for (int i = 0; i < 5; i++) {
			sbu.append(i);
		}
		System.out.println("sbu after " + sbu);

	}
}
