/* WAP to create a non static int var and print it inside main method (global variable)*/
class Prog4 
{
	int b=3;
	public static void main(String[] args) 
	{
		Prog4 s1=new Prog4();
		System.out.println(s1.b);
	}
}
