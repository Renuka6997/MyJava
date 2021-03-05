/* Example of Multiple classes */
class Run  
{
	static int a=34;
	int b= 21;
}
class Demo
{
	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println(Run.a);
		Run r1 = new Run();
		System.out.println(r1.b);
		System.out.println("ends");
	}
}

