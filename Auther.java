class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender )
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setEmail(String email)
	{
		this.email=email;
	
	}
	public String getName()
	{
		return name;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		String s1="Auther[ name= " +name+"  email="+email+"  gender"+gender+" ]";
		return s1;
	}
}