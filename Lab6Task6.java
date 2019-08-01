class Static 
{
	static int number;
	private static String name;
	static double num;
	public static String func(String name)
	{
		return name;
	}
}
class Lab6Task6
{
	public static void main(String[] args) 
	{
		Static ss=new Static();
		Static.number=30;
		Static.num=545.5;
		//Static.name="abdul";
		System.out.println(Static.func("abdul")+"  "+Static.num+"  "+Static.number);
	}
}
