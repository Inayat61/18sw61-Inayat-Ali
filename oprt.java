import java.util.*;
class oprt
{
	public static void main(String [] arg)
	{
		Scanner write=new Scanner(System.in);
		System.out.println("Write first number : ");
		int num1=write.nextInt();
		System.out.println("Write Second number : ");
		int num2=write.nextInt();
		System.out.println("Write Operation to perform: ");
		String op=write.next();
		switch(op)
		{
			case "+":
			System.out.println("The Addition of the Numbers is :"+(num1+num2));
			break;
			case "-":
			System.out.println("The Subtraction of the Numbers is :"+(num1-num2));
			break;
			case "*":
			System.out.println("The Multiplication of the Numbers is :"+(num1*num2));
			break;
			case "/":
			System.out.println("The Division  of the Numbers is :"+(num1/num2));
			break;
			case "%":
			System.out.println("The reminder of the Numbers is :"+(num1%num2));
			break;
			default:
			System.out.print("There is some error in your program");
		}
	
	
	}
}