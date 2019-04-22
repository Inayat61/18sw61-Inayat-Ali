import java.util.*;
class Grades
{
	public static void main(String []arg)
	{
		System.out.println("Write your C++ marks :");
		Scanner marks=new Scanner(System.in);
		int mark1=marks.nextInt();
		System.out.println("Write your Data Structure marks :");
		int mark2=marks.nextInt();
		System.out.println("Write your Operating System marks :");
		int mark3=marks.nextInt();
			int total=((mark1+mark2+mark3)/300)*100;
			if(total>90)
			{
				System.out.println("A garde");
			}
			else if(total<=90 && total>=80)
			{
				System.out.println("B garde");
		
			}
			else if(total>=70 && total<=79)
			{
				System.out.println("C garde");
		
			}
			else if(total>=60 && total<=69)
			{
				System.out.println("D garde");
		
			}
			else{
				System.out.println("A garde");
		
			}

	}
}