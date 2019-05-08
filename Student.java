class Student
{
	int age;
	String name;
	String rollNo;
	String dept;
	public Student(String name,String rollNo,String dept,int age)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.dept=dept;
		this.age=age;
	}
	public void getDetails()
	{
		System.out.println("Name of Student: "+name);
		System.out.println("Roll Number:  "+rollNo);
		System.out.println("Department:  "+dept);
		System.out.println("Age of Student: "+age);
	}
}