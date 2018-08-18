import java.util.Scanner;
import java.io.Console;
class A
{
	private String name;
	private int rollno;
    private	float m1,m2,per;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		Console c=System.console();
		System.out.print("Enter Roll no:");
		rollno=sc.nextInt();
		System.out.print("Enter Name:");
		name=c.readLine();
		System.out.print("Enter Sub1:");
		m1=sc.nextFloat();
		System.out.print("Enter Sub2:");
		m2=sc.nextFloat();
	}
	void setdata(int roll,String name1,float m11 ,float m22 )
	{
		rollno=roll;
		name=name1;
		m1=m11;
		m2=m22;
	}
	void calper()
	{
		per=(m1+m2)/2;
	}
	void display()
	{
		System.out.println("Name:"+name+"\nRollNo.:"+rollno+"\nmarks in sub1:"+m1+"\nmarks in sub2:"+m2+"\npercentage is:"+per+"%");
	}
}
class StudentTest1
{
	public static void main(String args[])
	{
		A s1=new A();
		A s2=new A();
		
		s1.setdata(97,"minti",99.7f,99.8f);
		s1.calper();
		s1.display();
		
		s1.getdata();
		s1.calper();
		s1.display();
		
		s2.setdata(114,"pallav",99.8f,99.6f);
		s2.calper();
		s2.display();
		
		s2.getdata();
		s2.calper();
		s2.display();
	}
}
class StudentTest2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array:");
		int n=sc.nextInt();
		A s[]=new A();
		s[]=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i].getdata();
			s[i].calper();
			s[i].display();
		}
		
	}
}