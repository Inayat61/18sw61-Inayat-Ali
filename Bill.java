import java.util.*;
class Bill
{
	public static void main(String [] arg)
	{
		int sum=0;
		System.out.print("Write Number of units: ");
		Scanner un=new Scanner(System.in);
		int units=un.nextInt();
		for(int i=1;i<=units;i++)
		{
			if(i<=50)
			{
				sum+=10;
			}
			else if(i<=100)
			{
				sum+=15;
			}
			else if(i<=200)
			{
				sum+=20;
			}
			else if(i<=300)
			{
				sum+=25;
			}
			else if(i>300)
			{
				sum+=30;
			}
		}
		System.out.println("Your total bill is "+sum);
	}
}