class Dog
{
	String name;
	String breed;
	int age;
	public void setDetails(String name,String breed,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
	}
	public void showDetails()
	{
		if (age==0) 
		{
			System.out.println("Details are unavailable");
		}else {
			System.out.println("Name of Dog: "+name);
			System.out.println("Breed of Doug: "+breed);
			System.out.println("Age of Dog: "+age);
		}
	}
}