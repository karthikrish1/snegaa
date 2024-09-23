package overloading;

public class o1 {
	/*
	 * overloading: using same methodname for differnt purpose
	 *             showing diff in number/datatype/sequemce
	 *             
	 *             static
	 *             nonstatic
	 *             constructor * 
	 * */
	
	public static void main(String[] args) {
		o1.area();
		o1.area(4);
		o1.area(3.2);
		o1.area(3, 2.3);
		o1.area(2.3, 10);
	}
	
	public static void area()//0
	{
		System.out.println("hi");
	}
	
	public static void area(int s)//1
	{
		System.out.println("Area of square is "+ s*s);
	}
	
	public static void area(double r)//0
	{
		System.out.println("area f circle is "+ 3.14*r*r);
	}
	
	public static void area(int s, double b)//0
	{
		System.out.println("area of rectangle is "+ s*b);
	}
	
	public static void area(double b, int s)//0
	{
		System.out.println("area of triangle is "+ 0.5*s*b);
	}

	
}
