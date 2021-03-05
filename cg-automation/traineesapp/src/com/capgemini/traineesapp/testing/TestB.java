package com.capgemini.traineesapp.testing;

import static com.capgemini.traineesapp.development.Remote.*;
import com.capgemini.traineesapp.development.*;

public class TestB {

	public static void main(String[] args) {

		on();
		off();
		System.out.println("Num value " + num);

		Remote r = new Remote();
		System.out.println(r.a);
	}

}
