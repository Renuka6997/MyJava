package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer> (); //generic type (mostly used)
		al.add(10);
		al.add(20);
		al.add(30);

		Object o = al.get(0);
		System.out.println("value = " + o);

		Object o1 = al.get(1);
		System.out.println("value1 = " + o1);

		Object o2 = al.get(2);
		System.out.println("value2 = " + o2);
		
		System.out.println("************************");

		for (int i = 0; i < al.size(); i++) { // using for loop 
			System.out.println("n is "+al.get(i));
		}

		System.out.println("********************");

		for (Object n : al) {   //using enhanced for loop
			System.out.println("value is "+n);
		}
	}
}
