/*WAP to create two non static methods and call from main method*/
class  Sample1
{
	public void kick()
	{
		System.out.println("kick football");
	}
	public void take()
	{
		System.out.println("take football");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
		Sample1 obj = new Sample1();
		obj.kick();
		obj.take();
		System.out.println("end");

	}
}
