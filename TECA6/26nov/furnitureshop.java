/*Dimensions*/
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
		this.l=l;
		this.w=w;
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
		Box b1=new Box(5,6);
		Box b2=new Box(5,6,7);
		b1.dimension();
		b2.dimension();
		System.out.println("ends");
	}
}
