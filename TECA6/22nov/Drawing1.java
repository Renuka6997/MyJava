/* Level 2 Programming */
class  Circle
{
	int r;
	static double pi=3.14;
	public void findArea()
	{
        double res=pi*this.r*this.r;
		System.out.println("Area of the circle : "+res);
	}
}
class Rect
{
	int l;
	double w;
	public void getArea()
	{
		double res=this.l*this.w;
		System.out.println("Area of the Rectangle :"+res);
	}
}
class Drawing1
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Circle c1=new Circle();
		c1.r=3;
		c1.findArea();
		Circle c2=new Circle();
		c2.r=4;
		c2.findArea();
		Circle c3=new Circle();
		c3.r=5;
		c3.findArea();
		Rect r1=new Rect();
		r1.l=5;
		r1.w=5.5;
		r1.getArea();
		Rect r2=new Rect();
		r2.l=6;
		r2.w=6.6;
		r2.getArea();
		Rect r3=new Rect();
		r3.l=7;
		r3.w=7.7;
		r3.getArea();
		System.out.println("ends");



	}
}
