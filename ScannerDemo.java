import java.util.*;
class ScannerDemo
{
		Scanner scanf=new Scanner(System.in);
	int age;
	String name;
	float height;
	double weight;
	long ab;
	byte ac;
	public void setValue()
	{
		System.out.println("Enter Name:");
		name=scanf.nextLine();
		System.out.println("Enter Age:");
		age=scanf.nextInt();
		System.out.println("Enter Height:");
		height=scanf.nextFloat();
		System.out.println("Enter weight:");
		weight=scanf.nextDouble();
		System.out.println("Enter Long Number:");
		ab=scanf.nextLong();
		System.out.println("Enter Byte Number:");
		ac=scanf.nextByte();
	}
	public void getValue()
	{
		System.out.println("Your Name is "+name);
		System.out.println("Your Age is "+age);
		System.out.println("Your Height is "+height);
		System.out.println("Your weight is "+weight);
		System.out.println("your Entered Long type Number "+ab);
		System.out.println("Your Entered Byte type Number "+ac);

	}
}