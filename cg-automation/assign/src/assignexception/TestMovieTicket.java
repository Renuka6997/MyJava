package assignexception;

public class TestMovieTicket {
	public static void main(String[] args) {

		System.out.println("main starts");

		BookMyShow b = new BookMyShow();
		try {
			b.bookTicket();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		System.out.println("main ends");

	}
}
