class Work
{
	public void pak(int n, char c)
	{
		System.out.println("Integer: "+n);
		System.out.println("Character: "+c);
	}
	public void pak(char c, int n)
	{
		System.out.println("Character: "+c);
		System.out.println("Integer: "+n);
	}
}
class Lab6Task3
{
	public static void main(String[] args) 
	{
		Work work=new Work();
		work.pak(3,'r');
		work.pak('s',7);
	}
}