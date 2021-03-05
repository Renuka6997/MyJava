package com.capgemini.array;

public class TestE {
	public static void main(String[] args) {

		String[] freedomFighters=getNames();
		
		for(int i=0;i<freedomFighters.length;i++) {
			System.out.println("name : " + freedomFighters[i]);
		}
	}

	static String[] getNames() {
		String[] names = { "Subhash Chandra Bose", "Jhansi Rani", "Narsimha Reddy", "Bhagat Singh" };
		return names;
	}
	
}
