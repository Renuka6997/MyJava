/* CC FORM */
class Details
{
	String name;
	String contact;
	String email;
	int yop;
	double tenth;
	double inter;
	double degree;
	String batchcode;
	String company1;
	String company2;
	String company3;
	public Details(String name,String contact,String email,int yop,double tenth,double inter,double degree,String batchcode,String company1)
	{
		this.name=name;
		this.contact=contact;
		this.email=email;
		this.yop=yop;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
		this.company1=company1;
	}
	public Details(String name,String contact,String email,int yop,double tenth,double inter,double degree,String batchcode,String company1,String company2)
	{
		this(name,contact,email,yop,tenth,inter,degree,batchcode,company1);
		this.company2=company2;
	}
	public Details(String name,String contact,String email,int yop,double tenth,double inter,double degree,String batchcode,String company1,String company2,String company3)
	{
		this(name,contact,email,yop,tenth,inter,degree,batchcode,company1,company2);
		this.company3=company3;
	}
	public void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Contact:"+this.contact);
		System.out.println("EMAIL:"+this.email);
		System.out.println("YOP:"+this.yop);
		System.out.println("Tenth:"+this.tenth);
		System.out.println("Inter:"+this.inter);
		System.out.println("Degree"+this.degree);
		System.out.println("Batch Code:"+this.batchcode);
		System.out.println("Company1:"+this.company1);
		System.out.println("Company2:"+this.company2);
		System.out.println("Company3:"+this.company3);
	}
}
class Form
{
	public static void main(String[] args)
	{
		System.out.println("eligible for Company1");
		Details d1=new Details("renuka","9989790278","renuka06@gmail.com",2019,88,90,75,"teca6","sjv");
		d1.display();
		System.out.println("eligible for Company2");
		Details d2=new Details("renuka","9989790278","renuka06@gmail.com",2019,88,90,78,"teca6","sjv","abc");
		d2.display();
		System.out.println("eligible for Company3");
		Details d3=new Details("renuka","9989790278","renuka06@gmail.com",2019,88,90,79,"teca6","sjv","abc","jkl");
		d3.display();
	}
}

