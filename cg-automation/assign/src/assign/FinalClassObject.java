package assign;

final class FinalClassObject {  
	/* object can be created for final class */
	void demo() {
		System.out.println("Demo started");
	}

	public static void main(String[] args) {
		FinalClassObject c = new FinalClassObject();
		c.demo();
	}
}
