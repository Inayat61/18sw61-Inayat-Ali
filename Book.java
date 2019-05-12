class Book
{
	private String name;
	private int qty;
	private double prize;
	private Author s1[];
	public Book(String name,double prize,Auther s1[])
	{
		this.name=name;
		this.prize=prize;
		this.s1=s1;
	}
	public Book(String name,double prize,Auther [] s1,int qty)
	{
		this.name=name;
		this.prize=prize;
		this.s1=s1;
		this.qty=qty;
		
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return s1;
	}
	public void setPrize(double prize)
	{
		this.prize=prize;
	}
	public double getPrize()
	{
		return prize;
	}
	public void setQty()
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	public String toString()
	{
		String autherList="";
		for(int i=0;i<s1.length;i++)
		{
			autherList+=s[i].toString();
		}
		String s="Book[ name: "+name+", author {"+ autherList +" prize= "+prize+"qty= "+qty+" ]";
		return s;
	}
	public static void main(String []arg)
	{
		Author auth1=new Author("Inayat","djfksd@dhf.com",'m');
		Author auth2=new Author("Inayat","djfksd@dhf.com",'m');
		Author auth3=new Author("Inayat","djfksd@dhf.com",'m');
		Author auth4=new Author("Inayat","djfksd@dhf.com",'m');
		Author auth5=new Author("Inayat","djfksd@dhf.com",'m');
		Author[] a1={auth1,auth2,auth3,auth4,auth5};
		Book b1=new Book("Inayat",1.2,a1,22);
		System.out.println(b1.toString());
	}
}
