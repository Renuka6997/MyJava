/*WAP to create non static method anf call from main method*/
class Sample 
{
	public void kick()
	{
		System.out.println("kick football");
	}
	public static void main(String[] args)
	{
		System.out.println("maain start");
		Sample obj = new Sample();
		obj.kick();
		System.out.println("main end");
	}
}
