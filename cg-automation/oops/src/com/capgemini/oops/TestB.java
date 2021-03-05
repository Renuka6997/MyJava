package com.capgemini.oops;

public class TestB {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.color = "Blue";
		p.size = 12.7;
		p.price = 10;

		p.write();
		p.play();

		Marker marker = new Marker();
		marker.color = "Black";
		marker.price = 100;
		marker.size = 18.3;
		marker.isPermanent = false;
		marker.write();
		marker.writeOnBoard();
		marker.play();
	}

}
