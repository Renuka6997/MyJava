/* WAP to create
1. non static method fly with 3 args double,doublr,int
2. static method jog with 1 arg string, 
3. non static method sit with 4 args boolean, char, string, double
4. static method with 2 args stand char, string
5. print args inside the method
6. call all the methods from main method */
class Prog 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Prog s1 = new Prog();
		s1.fly(3.14, 3.6, 15);
		jog("renuka");
		Prog s2 = new Prog();
		s2.sit(true, '$', "kusuma", 4.5);
		stand('#', "renu");
		System.out.println("main ends");
	}
	public void fly(double a, double b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		public static void jog(String d)
	{
			System.out.println(d);
	}
			public void sit(boolean e, char f, String g, double h)
	{
				System.out.println(e);
				System.out.println(f);
				System.out.println(g);
				System.out.println(h);
	}
				public static void stand(char i, String j)
	{
					System.out.println(i);
					System.out.println(j);
	}
}