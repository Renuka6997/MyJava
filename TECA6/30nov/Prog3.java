class A 
{
	public void move() 
	{
		System.out.println("move 5kms");
	}
}
class B extends A
{
	public void move()
	{
		System.out.println("move 10kms");
	}
}
class C extends A
{
	public void move()
	{
		System.out.println("move 15kms");
	}
}
class Prog3
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.move();
		B b1=new B();
		b1.move();
		C c1=new C();
		c1.move();
	}
}

