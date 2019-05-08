class Convert
{
	public static void main(String []arg)
	{
		int count=0;
		String a=arg[0];
	    int c=Integer.parseInt(arg[0]);
		int array[]={1,2,3,4};
		for(int x=0; x<array.length;x++)
		{if(c==array[x])
			{
				System.out.println("The Number Found at"+ x);
				count++;
		}}
			
			if(count==0)
			{System.out.println("Number not found");}
	}
}