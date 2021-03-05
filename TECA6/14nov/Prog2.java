/* WAP to create static method, create a local int variable within the method and print it.
2. create non static method, create boolean local variable inside method and print it.
call both the methods from main method. (local variable) 
*/
class  Prog2
{
	public static void test1()
	{
		int a=2;
		System.out.println(a);
	}
	public void test2()
	{
		boolean b=true;
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		test1();
		Prog2 r1=new Prog2();
		r1.test2();
		System.out.println("end");

	}
}
