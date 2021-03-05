/* Example for Class Variable (Static Variable).*/
class  Sample
{
	static int i=77;
	public static void test1()
	{
		i=99;
	}
	public void test2()
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println(i);
		test1();
		System.out.println(i);
		Sample s1=new Sample();
		s1.test2();
		System.out.println(i);
		System.out.println("end");
	}
}
