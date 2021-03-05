/* WAP for the foll
1. create 2 methods 
a. static method slide, within the method declare int, double, perform addition and return the result
b. non static method surf, create string, char, double variables, use '+' operator and return the result
call both the methods from main method, receive the result and print it inside main method. */

class Prog2
{
	public static double slide()
	{
		int a=2;
		double b=2.1;
	    double c=a+b; 
		return c;
	}
	public String surf()
	{
		String d="kusu";
		char e='$';
		double f=3.1;
	    String g=d+e+f;
		return g;
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		double c = slide();
		System.out.println(c);
		Prog2 d1 = new Prog2();
		String g = d1.surf();
		System.out.println(g);
		System.out.println("main ends");
	}
}
