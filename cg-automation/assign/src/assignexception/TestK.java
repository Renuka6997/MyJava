package assignexception;

import java.util.Scanner;

public class TestK {
	public static void main(String[] args) {

		System.out.println("main starts");
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			System.out.println(10 / 0);

		} finally {

			System.out.println("scanner closing");
			sc.close();
		}

		System.out.println("main ends");
	}
}
