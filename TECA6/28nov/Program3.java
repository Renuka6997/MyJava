class H 
{
	int x;
	public H(int x)
	{
		this.x=x;
	}
}
class I extends H
{
	char y;
	public I(int x,char y)
	{
		super(x);
		this.y=y;
	}
	public void info1()
	{
		System.out.println(this.x);
		System.out.println(this.y);
	}
}
class J extends H
{
	boolean z;
	public J(int x,boolean z)
	{
		super(x);
		this.z=z;
	}
	public void info2()
	{
		System.out.println(this.x);
		System.out.println(this.z);
	}
}
class Program3
{
	public static void main(String[] args)
	{
		I i1=new I(5,'@');
		i1.info1();
		J j1=new J(5,true);
		j1.info2();
	}
}
