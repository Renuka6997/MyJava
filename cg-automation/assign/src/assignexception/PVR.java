package assignexception;

public class PVR {
	void confirmTicket() {
		System.out.println("PVR starts");

		try {
			System.out.println(10 / 0);
			System.out.println("Booking Confirmed");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw ae;
		}

		System.out.println("PVR ends");
	}
}
