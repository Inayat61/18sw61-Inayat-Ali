class Name
{
	Student st;
	MarkSheet mark;
	Name(Student s,MarkSheet w)
	{
	this.st=s;
this.mark=w;
	}
public void work()
{
mark.setDetails();
st.getDetails();
mark.calc();
}
}
 class Lab5
{
	public static void main(String []args)
	{
			
		Student st1=new Student("Inayat Ali","18SW63","software",20);
		MarkSheet mark=new MarkSheet();
		Name c=new Name(st1,mark);
		c.work();

	}
}