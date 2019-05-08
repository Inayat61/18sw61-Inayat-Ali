/*3. Develop a java class called Dog having three data members; name,
breed and age. Create a function setDetails() which initializes these
data members after taking parameters. Create another function
showDetails() which print these values if these values are initialized
otherwise show a message that details are unavailable.*/
class Lab5Task3
{
	public static void main(String[] args) 
	{
		Dog dog1=new Dog();
		dog1.setDetails("loci","Unkonwn",14);
		dog1.showDetails();
	}
	
}