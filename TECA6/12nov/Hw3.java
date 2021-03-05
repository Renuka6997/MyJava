/* WAP for the below requirements
1. static
2. non static
3. main    */
class  Hw3
{
	public static void main(String[] args) 
	{
		System.out.println("morning");
		awake();
		System.out.println("night");
	}
	public static void awake()
	{
		System.out.println("wake up early");
        Hw3 s1 = new Hw3();
		s1.sleep();
	}
	public void sleep()
	{
		System.out.println("sleep early");
	}
}
