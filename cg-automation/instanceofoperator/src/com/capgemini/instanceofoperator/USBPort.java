package com.capgemini.instanceofoperator;

public class USBPort {

	static void connect(Object o) {

		if (o instanceof Mouse) {
			Mouse m = (Mouse) o; // here mouse class is DownCasted from super class object
			m.click();
			m.scroll();
		} else if (o instanceof PenDrive) {
			PenDrive p = (PenDrive) o;
			p.read();
			p.write();
		} else {
			System.out.println("Invalid object");
			System.out.println("Object not supported by port");
		}
	}
}
