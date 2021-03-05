/* WAP 
1. create 2 static variables
2. create 2 non static variables
3. print all the variables in main method 
4. draw the execution program. */
class  Exec
{
	int a =2;
	int b=3;
	static double i =5;
	static double j= 6;
	public static void main(String[] args) 
	{
		System.out.println("start");
		Exec e1 = new Exec();
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(i);
		System.out.println(j);
		System.out.println("end");
	}
}
