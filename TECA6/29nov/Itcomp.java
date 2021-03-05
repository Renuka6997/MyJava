/* WAP for developer and test engineer
Developer c/s are id,name,sal,language
test eng c/s are id,name,sal,type of testing.
2. create a method to display developer info and create a method to display test engg info.
3. create another class It company having main method and create a developer object and test engg obj & display the details. */
class Employee
{
	String name;
	int id;
	int salary;
	public Employee(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void Details()
	{
		System.out.println("Name="+this.name);
		System.out.println("ID="+this.id);
		System.out.println("Salary="+this.salary);
	}
}
class Developer extends Employee
{
	String lang;
	public Developer(String name,int id,int salary,String lang)
	{
		super(name,id,salary);
		this.lang=lang;
	}
	public void DetailsInfo1()
	{
		this.Details();
		System.out.println("Lang="+this.lang);
	}
}
class Test extends Employee
{
	String tot;
	public Test(String name,int id,int salary,String tot) 
	{
		super(name,id,salary);
		this.tot=tot;
	}
	public void DetailsInfo2()
	{
		this.Details();
		System.out.println("Type of Testing="+this.tot);
	}
}
class Itcomp
{
	public static void main(String[] args)
	{
		System.out.println("Developer Details");
		Developer d1=new Developer("renu",215,20000,"java");
		d1.DetailsInfo1();
		System.out.println("Test Engineer Details");
		Test t1=new Test("kusu",258,20000,"ManualTesting");
		t1.DetailsInfo2();
	}
}