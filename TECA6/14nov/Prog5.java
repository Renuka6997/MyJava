/* WAP to create static double var and non static char variable. print it in main method. (global variable)*/
class  Prog5
{
	static double a=3.3;
	char b='$';
	public static void main(String[] args) 
	{
		System.out.println(a);
        Prog5 s1=new Prog5();
		System.out.println(s1.b);
	}
}
