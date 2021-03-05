/* WAP for the foll
create 2 classes
1. static and non static var, static and non static metod
access static var inside static method, access non static variable within non static method
2. create another class which has a main method and access static and non static method.  */
class Sample1
{
	static double a=5.6;
	int b=96;
	public static void swim()
	{
		System.out.println(a);
		System.out.println("swim in..");
	}
	public void fly()
	{
		System.out.println(b);
		System.out.println("fly high");
	}
}
class Sample2
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Sample1.swim();
		Sample1 s1=new Sample1();
		s1.fly();
		System.out.println("ends");
	}

}
