/* create 4 classes
1. static and non static method
2. static and non static variable
3. static var, non static var, static method and non static method
4. main method which will access all the above 3 classes
5. Program summary diagram */
class Demo1
{
	public static void Run()
	{
		System.out.println("run slow");
	}
	public void Go()
	{   
		System.out.println("go fast");
	}
}
class Demo2
{
	static int a=12;
	int b=13;
}
class Demo4
{
	static int c=15;
	int d=19;
	public static void fly()
	{
		System.out.println(c);
	}
	public void swim()
	{
		System.out.println(d);
	}
}
class Demo5
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Demo1.Run();
		Demo1 r1=new Demo1();
		r1.Go();
		System.out.println(Demo2.a);
		Demo2 r2=new Demo2();
		System.out.println(r2.b);
		Demo4.fly();
		Demo4 r3=new Demo4();
		r3.swim();
		System.out.println("end");

	}
}
