import java.util.*;
class MarkSheet
{
	Scanner scanf=new Scanner(System.in);
	double sub1;
	double sub2;
	double sub3;
	double total;
	double per;
	public void setDetails()
	{
		System.out.println("Enter First subject");
		sub1=scanf.nextInt();
		System.out.println("Enter Sceond subject");
		sub2=scanf.nextInt();
		System.out.println("Enter Thrid subject");
		sub3=scanf.nextInt();
		System.out.println("Enter Total Marks");
		total=scanf.nextInt();
	}
	public void calc()
	{
		System.out.println("Total marks: "+total);
		System.out.println("Obtained Marks: "+(sub1+sub2+sub3));
		sub1=sub1+sub2+sub3;
		per=(sub1*100)/total;
		System.out.println("Percentage: "+per);
		if (per>=90) 
			System.out.println("Grade 'A'");
		if (per>=80 && per<90) 
			System.out.println("Grade 'B'");
		if (per>=70 && per<80) 
			System.out.println("Grade 'C'");
		if (per>=60 && per<70)
			System.out.println("Grade 'D'");
		if (per>=50 && per<60) 
			System.out.println("Grade 'E'");
		if (per<50) 
			System.out.println("Fail");
	}
}