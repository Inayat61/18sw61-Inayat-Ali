class UseStatic
{
	static double prize;
	String name;
	String companyLogo;
	
	
	static 
	{
		prize=400.0;
	}
		 String getName(String name)
		{
			this.name=name;
			return this.name;
		}
	String getCompany(String companyLogo)
		{
			this.companyLogo=companyLogo;
			return this.companyLogo;
		}		
		
	
	public static void main(String[]arg)
	{
		UseStatic s=new UseStatic();
		s.getName("inayat");
		
		s.getCompany("logo");
		System.out.print(s.prize+" "+s.name+" "+s.companyLogo);
	}
}