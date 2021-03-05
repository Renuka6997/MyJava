class  Sit
{
	public void demo() 
	{
		System.out.println("Sit for 2 mins");
	}
}
class Stand extends Sit
{
	public void demo()
	{
		System.out.println("stand for 2 mins");
	}
}
class Run extends Stand
{
	public void demo()
	{
		System.out.println("run for 2 mins");
	}
}
class Sample
{
	public static void main(String[] args)
	{
		Sit s1=new Sit();
		s1.demo();
		Stand d1=new Stand();
		d1.demo();
		Run r1=new Run();
		r1.demo();
	}
}