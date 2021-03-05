/* constructor chaining*/
class  Box
{
	int l;
	int w;
	int h;
	public Box(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public Box(int l,int w,int h)
	{
		this(l,w);
		this.h=h;
	}
	public void dimension()
	{
		System.out.println("Length:"+this.l);
		System.out.println("width:"+this.w);
		System.out.println("height:"+this.h);
	}
}
class furnitureshop
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Box b1=new Box(9,4);
		b1.dimension();
		Box b2=new Box(9,4,6);
		b2.dimension();
		System.out.println("ends");
	}
}
