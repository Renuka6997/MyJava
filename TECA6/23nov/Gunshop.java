/* Level 3 Programming */
class  Gun
{
	String gName;
	int bullets;
	public Gun()
	{
		this.gName="ak47";
		this.bullets=116;
	}
	public Gun(String gName, int bullets)
	{
		this.gName=gName;
		this.bullets=bullets;
	}
}
class Gunshop
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Gun g1=new Gun();
		Gun g2=new Gun();
        Gun g3=new Gun("pistol", 6);
		Gun g4=new Gun();
		Gun g5=new Gun("shot gun", 2);
		System.out.println(g1.gName);
		System.out.println(g1.bullets);
		System.out.println(g2.gName);
		System.out.println(g2.bullets);
		System.out.println(g3.gName);
		System.out.println(g3.bullets);
		System.out.println(g4.gName);
		System.out.println(g4.bullets);
		System.out.println(g5.gName);
		System.out.println(g5.bullets);
		System.out.println("ends");
	}
}
