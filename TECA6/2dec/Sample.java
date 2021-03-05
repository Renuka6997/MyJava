/* WAP to count no. of object creation.
Note: counting should never happen in any method. */
class Sample
{
	static int count;
	public Sample()
	{
		count ++;
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
		System.out.println("count is"+count);
		System.out.println("ends");
	}
}
