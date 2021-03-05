/* WAP to create static double var, non static int variable
create static method test
create non static method verify. Print static variable inside static method. Print non static var inside non static method. Call 
static and non static method from main method. */
class Demo 
{
	static double a=3.3;
	int b=5;
	public static void main(String[] args) 
	{
		System.out.println("start");
		test();
		Demo d1 = new Demo();
		d1.verify();
		System.out.println("end");

	}
	public static void test()
	{
		System.out.println(a);
	}
	public void verify()
	{
		System.out.println(b);
	}
}
