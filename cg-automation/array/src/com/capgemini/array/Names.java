package com.capgemini.array;

public class Names {
	public static void main(String[] args) {

		snames("renu", "urmi", "anu");
		snames("renu", "urmi", "anu", "jyothi", "kusuma");
	}

	static void snames(String... names) {

		for (int i = 0; i < names.length; i++) {
			System.out.println("total names = " + names[i]);
		}
	}
}
