class Print
{
	public void getAll(int name,char spell)
	{
		System.out.println(name+"  "+spell);
	}	
	
	public void getAll(char spell,int name)
	{
		System.out.println(name+"  "+spell);
	}
	public static void main (String []arg)
	{
		Print p=new Print();
		p.getAll(1,'a');
		p.getAll('b',2);
	}
	
}