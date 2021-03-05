package com.capgemini.objectclass;

public class Cow {
	int id;
	String name;
	double price;

	public Cow(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj != null) {
			if (obj instanceof Cow) {
				Cow cow = (Cow) obj;

				if (this.id == cow.id) {
					if (this.price == cow.price) {
						if (this.name.equals(cow.name)) {
							return true;
						} else {
							return false;
						}
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
