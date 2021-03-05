/* WAP to print the below numbers 
0 1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1  || without using loops and variable initialisation by developer */
class Prog1
{
	static int i;
	public static void number()
	{
		if (i<=10)
		{
		System.out.println(i);
		i++;
		number();
		i--;
		System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		number();
		System.out.println("ends");
	}
}
