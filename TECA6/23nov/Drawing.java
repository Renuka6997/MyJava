/* WAP of level 3
1. standard circle r=8
2. standard rect dim = 4,6
create 5 circles- 2 standard, 3 different radius and find area.
create 3 rect 1 standard rect, 2 different rects and get area..*/
class  Circle
{
	int r;
	static double pi=3.14;
	public Circle()
	{
		this.r=8;
	}
	public Circle(int r)
	{
		this.r=r;
	}
	public void findArea()
	{
		double res=this.pi*this.r*this.r;
		System.out.println("area of circle:"+res);
	}
}
class Rect
{
	int l;
	int w;
	public Rect()
	{
    this.l=4;
	this.w=6;
	}
	public Rect(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public void getArea()
	{
	int res=this.l*this.w;
	System.out.println("area of rect:"+res);
	}
}
class Drawing
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Circle c1= new Circle();
		Circle c2= new Circle();
		Circle c3= new Circle(9);
		Circle c4= new Circle();
		Circle c5= new Circle(7);
		Rect r1=new Rect();
		Rect r2=new Rect(3,5);
		Rect r3=new Rect(5,9);
		System.out.println("first circle");
		c1.findArea();
		System.out.println("second circle");
		c2.findArea();
		System.out.println("third circle");
		c3.findArea();
		System.out.println("fourth circle");
		c4.findArea();
		System.out.println("fifth circle");
		c5.findArea();
		System.out.println("first rect");
		r1.getArea();
		System.out.println("second rect");
		r2.getArea();
		System.out.println("third rect");
		r3.getArea();
		System.out.println("end");
	}
}
