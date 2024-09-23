package overloading;

public class o2 {

	public static void main(String[] args) {
		o2 ob= new o2();
		ob.area();
		ob.area(3);
		ob.area(2.3);
		ob.area(20, 3.4);
		ob.area(30.4, 10);

		
		//perimte rof square: 4*S
		//                  : 2*3.14*r
		//           re: 2*(l+b)
		//            tri: l*b
	}
	
	public  void area()//0
	{
		System.out.println("hi");
	}
	
	public  void area(int s)//1
	{
		System.out.println("Area of square is "+ s*s);
	}
	
	public void area(double r)//0
	{
		System.out.println("area f circle is "+ 3.14*r*r);
	}
	
	public  void area(int s, double b)//0
	{
		System.out.println("area of rectangle is "+ s*b);
	}
	
	public  void area(double b, int s)//0
	{
		System.out.println("area of triangle is "+ 0.5*s*b);
	}

	

}
