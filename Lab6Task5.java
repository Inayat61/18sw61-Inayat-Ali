import java.util.Scanner;
class Student 
{
	int age;
	String name;
	String address;
	Student()
	{
		age=0;
		name="Unknown";
		address="not available";
	}
	public void setInfo(int age ,String name)
	{
		this.name=name;
		this.age=age;
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
	}
	public void setInfo(int age ,String name,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
	}
}
class Lab6Task5
{
	public static void main(String[] args) 
	{
		Student std1=new Student();
		Student std2=new Student();
		Student std3=new Student();
		Student std4=new Student();
		Student std5=new Student();
		Student std6=new Student();
		Student std7=new Student();
		Student std8=new Student();
		Student std9=new Student();
		Student std10=new Student();
		Student []s1={std1,std2,std3,std4,std5,std6,std7,std8,std9,std10};
/*		std1.setInfo(18,"ali","Hostel");
		std2.setInfo(18,"ali","Hostel");
		std3.setInfo(18,"ali","Hostel");
		std4.setInfo(18,"ali","Hostel");
		std5.setInfo(18,"ali","Hostel");
		std6.setInfo(18,"ali","Hostel");
		std7.setInfo(18,"ali","Hostel");
		std8.setInfo(18,"ali","Hostel");
		std9.setInfo(18,"ali","Hostel");
		std10.setInfo(18,"ali","Hostel");*/
		for (int i=0;i<s1.length;i++) 
		{
			System.out.println();
			System.out.println("Student "+(i+1));
			s1[i].setInfo(20,"Abdul Jabbar","MUET Hostel");

		}
	}
}