class Book
{
	private int qty;
	private String name;
	private double price;
	private Author []authors;
	Book(String name, Author []authors, double price)
	{
		this.name=name;
		this.authors=authors;
		this.price=price;
	}
	Book(String name, Author []authors, double price , int qty)
	{
		this.name=name;
		this.authors=authors;
		this.price=price;
		this.qty=qty;
	}
	public void setPrice(double pr)
	{
		price=pr;
	}
	public void setQty(int qt)
	{
		qty=qt;
	}
	public Author[] getAuthors()
	{
		return  authors;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return qty;
	}
	public String getName()
	{
		return name;
	}
	public String getAuthorName()
	{
		return " ";
	}
	public String toString()
	{
		String authorlist="";
		for(int i=0;i<authors.length;i++)
		{
			if (i<=2) 
				authorlist+=authors[i].toString()+",";
			else
				authorlist+=authors[i].toString();
		}
		return ("Book[name="+name+" , authors={"+authorlist+"} , price="+price+", Qty="+qty+"]");
	}
}
class Lab6Task2
{
	public static void main(String[] args) 
	{
		Author auth1=new Author("Abdul Jabbar","abdjabbar110@gmail.com",'m');
		Author auth2=new Author("ali","abdjabbar110@gmail.com",'m');
		Author auth3=new Author("inayat","abdjabbar110@gmail.com",'m');
		Author auth4=new Author("chandio","abdjabbar110@gmail.com",'m');
		Author[] a1={auth1,auth2,auth3,auth4};
		Book b1=new Book("JAVA",a1,250.0,150);
		System.out.println(b1);
		System.out.println();
		System.out.println(auth3);
	}
}