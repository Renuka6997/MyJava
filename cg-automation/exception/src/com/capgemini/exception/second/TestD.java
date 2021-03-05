package com.capgemini.exception.second;

import java.io.File;
import java.io.IOException;

public class TestD {
	public static void main(String[] args) {

		System.out.println("main starts");

		OpenFile of = new OpenFile();
		try {
			try {
				
				of.open();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("main ends");

	}
}
