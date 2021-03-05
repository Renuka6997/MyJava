package com.capgemini.instanceofoperator;

public class TestA {
	public static void main(String[] args) {

		Mouse m = new Mouse();
		USBPort.connect(m);

		System.out.println("*****************");

		PenDrive p = new PenDrive();
		USBPort.connect(p);

		System.out.println("******************");
		USBPort.connect(null);

		System.out.println("*******************");
		String s = "hello";
		USBPort.connect(s);
		
	}
}
