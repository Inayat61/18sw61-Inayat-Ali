class Circle
{
	double hypotenius;
	double perpendicular;
	double base;
	public Circle(double hypotenius,double perpendicular,double base)
	{
		this.hypotenius=hypotenius;
		this.perpendicular=perpendicular;
		this.base=base;
	}
	public double getHyp(double perpendicular,double base)
	{
		this.perpendicular=Math.pow(perpendicular,2);
		this.base=Math.pow(base,2);
		this.hypotenius=this.perpendicular+this.base;
		return this.hypotenius;
	}
	public double getPerp(double hypotenius,double base)
	{
		this.hypotenius=Math.pow(hypotenius,2);
		this.base=Math.pow(base,2);
		this.perpendicular=this.hypotenius-this.base;
		return this.perpendicular;
	}
	public double getBas(double perpendicular,double hypotenius)
	{
		this.perpendicular=Math.pow(perpendicular,2);
		this.hypotenius=Math.pow(hypotenius,2);
		this.base=this.hypotenius-this.perpendicular;
		return this.base;
	}
	public double getHyp(double perpendicular,float angle)
	{
		this.hypotenius=(this.perpendicular/Math.sin(angle));
		return this.hypotenius;
		}
	public double getPerp(double hypotenius,float angle)
	{
		this.perpendicular=(Math.sin(angle)*this.hypotenius);
		return this.perpendicular;
	}
	public double getBas(double perpendicular,float angle)
	{
		this.base=(this.perpendicular*Math.tan(angle));
		return this.base;
	}
	
	public static void main(String []arg)
	{
		
		Circle c1=new Circle(3,5,6);
		System.out.println("Hypertenious"+c1.getHyp(10,2));
		System.out.println("Base: "+c1.getBas(11,2));
		System.out.println("Perpendicular"+c1.getPerp(32,4));
		System.out.println("Hypertenious"+c1.getHyp(10,2f));
		System.out.println("Base: "+c1.getBas(11,2f));
		System.out.println("Perpendicular"+c1.getPerp(32,4f));
		
	}
	
}