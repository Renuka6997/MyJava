package com.capgemini.abstraction;

public class Machine {

	void slot(ATM a) { // this method is created in order to access the properties of both HDFC and
						// ICICI
		a.validateCard();
		a.getInfo();
	}
}
