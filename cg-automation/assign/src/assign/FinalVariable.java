package assign;

public class FinalVariable {
	final int a = 10;

	public static void main(String[] args) {
//		a = 90;  it cannot be re-initialized as it is declared as final variable
		FinalVariable fv = new FinalVariable();
		System.out.println(fv.a);
	}
} 
