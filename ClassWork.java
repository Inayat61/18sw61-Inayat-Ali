class Triangle
{
	double hyp;
	double perp;
	double base;
	double angle;
	Triangle(double p, double h,double b)
	{
		hyp=h;
		perp=p;
		base=b;
	}
	Triangle()
	{
		hyp=0;
		perp=0;
		base=0;
	}
	public double getHyp(double angle,double perp)
	{
		//hyp=Math.sqrt(Math.pow(base, 2) + Math.pow(perp, 2));
		double b = Math.toRadians(angle);
		hyp=perp/Math.sin(b); 
		return hyp;
	}
	public double getPerp(double angle, double hyp)
	{
		perp=Math.sqrt(Math.pow(angle, 2)-Math.pow(base, 2));
		double b = Math.toRadians(angle);
		//perp=hyp*Math.sin(b); 
		return perp;
	}
	public double getBase(double angle, double hyp)
	{
		//base=Math.sqrt(Math.pow(hyp, 2) - Math.pow(perp, 2));
		double b = Math.toRadians(angle);
		base=hyp*Math.cos(b); 
		return base;
	}
	public double getAngle(double perp, double base)
	{
		double xy;
		xy=perp/base;
		angle=Math.toDegrees(Math.atan(xy));
		return angle;
	}
}
class ClassWork
{
	public static void main(String[] args) 
	{
		Triangle triangle=new Triangle();
		Triangle triangle1=new Triangle(2.0,7.0,4.0);
		System.out.println("Perp  "+triangle.getPerp(3,5));
		System.out.println("Angle of Tan "+triangle.getAngle(2,2));
	}
}