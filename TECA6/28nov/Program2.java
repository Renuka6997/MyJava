class  E
{
	double i;
	public E(double i)
	{
		this.i=i;
	}
}
class F extends E
{
	int j;
	public F(double i,int j)
	{
		super(i);
		this.j=j;
	}
}
class G extends F
{
	double k;
	public G(double i,int j,double k)
	{
		super(i,j);
		this.k=k;
	}
	public void info()
	{
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.k);
	}
}
class Program2
{
	public static void main(String[] args)
	{
		G g1=new G(5.5,7,8.9);
		g1.info();
	}
}
