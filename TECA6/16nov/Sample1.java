/* Example for Instance Variable (non static variable) */
class Sample1  
{
	int z=45;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Sample1 rv1 = new Sample1();
		Sample1 rv2 = new Sample1();
		rv1.z = 65;
		System.out.println(rv1.z);
		System.out.println(rv2.z);
		System.out.println("end");
	}
}
