/*WAP to create a static and non static methods and call from main method*/
class  Sample2
{
	public static void kick()
	{
		System.out.println("kick football");
	}
	public void swim()
	{
		System.out.println("swim across");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
		kick();
		Sample2 S1 = new Sample2();
		S1.swim();
		System.out.println("end");
	}
}
