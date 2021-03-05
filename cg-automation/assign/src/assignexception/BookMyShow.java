package assignexception;

public class BookMyShow {

	void bookTicket() {

		System.out.println("Booking starts");

		PVR p = new PVR();
		try {
			p.confirmTicket();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		System.out.println("Booking ends");
	}
}
