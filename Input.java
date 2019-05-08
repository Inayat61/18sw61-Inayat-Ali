import java.util.Scanner;
class Work
{
	public static void main(String []arg)
	{
		Scanner n=new Scanner(System.in);
		System.out.print("int:");
		int a=n.nextInt();
		System.out.print("String with lines: ");
		String y=n.nextLine();
		System.out.print("String with no  lines: ");	
		String z=n.next();
		System.out.print("Double: ");
		double w=n.nextDouble();
		System.out.print("Long "); 
		long q=n.nextLong();
		System.out.print("float:");
		float f=n.nextFloat();
		System.out.print("short:");
		short s=n.nextShort();
		System.out.print(a+" "+y+" "+z+" "+w+" "+q+" "+f+" "+s+" ");
		
	}
}
