import java.util.*;
class Array
{
	int arr[]=new int[4];
	void populateArray()
	{
		Scanner w=new Scanner(System.in);
		System.out.println("Type the elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=w.nextInt();
		}
	}	
	 
}