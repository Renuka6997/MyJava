class A 
{
	int i;
	public A(int i)
	{
		this.i=i;
	}
}
class B extends A
{
	int j;
	public B(int i,int j)
	{
		super(i);
		this.j=j;
	}
	public void info()
	{
		System.out.println(this.i);
		System.out.println(this.j);
	}
}
class Program
{
	public static void main(String[] args)
	{
		System.out.println("start");
		B b1=new B(5,6);
		b1.info();
	}
}
