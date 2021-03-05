/* Level 1 Programming */
class  Circle
{
	int r=5;
	static double pi=3.14;
	public void findArea()
	{
		double res=pi*this.r*this.r;
		System.out.println("Area of circle : "+res);
	}
}
class Rect
{
	double l=3.4;
	int w=4;
	public void getArea()
	{
		double res=this.l*this.w;
		System.out.println("Area of Rectangle : "+res);
	}
}
class Drawing
{
	public static void main(String[] args)
	{
	System.out.println("Start");
	Circle c1=new Circle();
	c1.findArea();
	Rect r1=new Rect();
	r1.getArea();
	System.out.println("ends");
	}
}
