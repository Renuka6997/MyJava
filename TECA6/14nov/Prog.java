/* WAP
1. static method add with 2 double args, perform addition using arg and return the result
2. static method division with integer args, perform division operation by using args and return the result
3. non static method multiply with integer and double arg, perform multiplication operation by using args and return the result
4. non static method sub with int, int, double, perform subtraction using 3 args and return the result'
call all the methods from main method, receive the result, perform addition in main method by using all the 4 results and print the final result. */
class  Prog
{
	public static double add(double a,double b)
	{
		double c = a+b;
		return c;
	}
	public static int div(int d,int e)
	{
		int f = d/e;
		return f;
	}
	public double mul(int g,double h)
	{
		double i= g*h;
		return i;
	}
	public double sub(int j ,int k,double l)
	{
		double m = j-k-l;
		return m;
	}
	public static void main(String[] args)
	{
		System.out.println("main start");
		double c = add(1,2);
		System.out.println(c);
		int f = div(6,3);
		System.out.println(f);
        Prog p1 = new Prog();
		double i = p1.mul(3,2.1);
		System.out.println(i);
		Prog p2 = new Prog();
		double m = p2.sub(3,2,0.5);
		System.out.println(m);
		double z = c+f+i+m;
		System.out.println(z);
		System.out.println("ends");
	}
}
