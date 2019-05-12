import java.lang.Math;

class Area
{
	public double printSquare(double length)
	{
		return( Math.pow(length,2));
	}
	public double printSquare(double length1,double width)
	{
		return (length1*width);
		}
		public static void main(String []arg)
		{
			Area a=new Area();
			System.out.println(a.printSquare(2.3));
			
			System.out.println(a.printSquare(2.0,3.0));
		}
}