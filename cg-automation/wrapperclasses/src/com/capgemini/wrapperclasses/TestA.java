package com.capgemini.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		Integer i1 = new Integer(a); // boxing

		byte b = 20;
		Byte b1 = b; // auto boxing

		Double d1 = new Double(10);
		double d = d1.doubleValue(); // UnBoxing

		short sd = 10;
		Short s1 = new Short(sd);
		short s = s1; // Auto UnBoxing

		int maxoFTwoNumbers = Integer.max(10, 20);
		System.out.println("Maximum value " + maxoFTwoNumbers);

		Integer age = Integer.parseInt("21"); // if we pass values other than integer then it will throw number exception
		System.out.println("Age= " + age);

		Byte by = Byte.parseByte("5");
		System.out.println("Byte value " + by);

		Short sh = Short.parseShort("20");
		System.out.println("short value " + sh);

		Long lg = Long.parseLong("39");
		System.out.println("Long value " + lg);

		Float f = Float.parseFloat("0.2f");
		System.out.println("float value " + f);

		Double d3 = Double.parseDouble("0.09");
		System.out.println("Double value " + d3);

		Boolean b2 = Boolean.parseBoolean("true"); // if we pass any value other than true it will print false
		System.out.println("boolean value " + b2);

		// xxxValue()

//		Character c3=new Character(a); //
//		char c4=c3.charValue();

		Integer in = new Integer(5);
		int in1 = in.intValue();
		System.out.println("UnBoxing int " + in1);

		Float f1 = new Float(0.9f);
		float f2 = f1.floatValue();
		System.out.println("UnBoxing float " + f2);

		Short s3 = new Short((short) 3);
		short s4 = s3.shortValue();
		System.out.println("UnBoxing short " + s4);

		Long l1 = new Long(57);
		long l2 = l1.longValue();
		System.out.println("UnBoxing long " + l2);

		Boolean result = new Boolean("tyy");
		boolean result1 = result.booleanValue();
		System.out.println("UnBoxing boolean " + result1);

	}
}
