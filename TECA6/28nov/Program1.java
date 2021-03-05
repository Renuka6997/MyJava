class  C
{
	int x;
	double y;
	public C(int x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
class D extends C
{
	int z;
	double j;
	public D(int x,double y,int z,double j)
	{
		super(x,y);
		this.z=z;
		this.j=j;
	}
	public void info()
	{
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
		System.out.println(this.j);
	}
}
class Program1
{
	public static void main(String[] args)
	{
		D d1=new D(5,5.5,6,6.6);
		d1.info();
	}
}