/* WAP to create the foll requirements
3 methods 1. non static method
          2. non static method
		  3. main method   */
class  Hw2
{
	public static void main(String[] args) 
	{
		System.out.println("start");
        Hw2 s1 = new Hw2();
        s1.ring();
		System.out.println("stop");
	}
	public void ring()
	{
		System.out.println("alarm ring");
		snooze();
	}
	public void snooze()
	{
		System.out.println("alarm snooze");
	}
}
