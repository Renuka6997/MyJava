package assignexception;

public class TestJ {
	public static void main(String[] args) {
		System.out.println("main starts");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} finally { // it is used to execute the code if exception exists or not
			System.out.println("finally executed");
		}
		System.out.println("main ends");
	}
}
