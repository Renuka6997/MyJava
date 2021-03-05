package com.capgemini.typecasting.reference;

public class TestB {
	public static void main(String[] args) {

		Pen p = new Marker();//whenever, UpCasting is done and overriden method is called, then overriden implementation 
		                       //is displayed as output
		p.write();

	}
}
