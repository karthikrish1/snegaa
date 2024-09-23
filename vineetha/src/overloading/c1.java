package overloading;

public class c1 {

	public static void main(String[] args) {
	//syntax for creation: public classname(){}
	//syntax for calling :  object creation:  new classname();

		new c1();
		new c1(3);
		new c1(3.4);
		new c1(3,4.5);
		new c1(4.5,30);
	}
	
	//default constructor
	public c1()
	{
		System.out.println("hi");
	}
	
	public c1(int s)
	{
		System.out.println("Area of square is "+ s*s);
	}
	
	public c1(double b)
	{
		System.out.println("Area of circle is "+ 3.14*b*b);
	}
	
	public c1(int s, double v)
	{
		System.out.println("Area of rectangle is "+ s*v);
	}
	
	public c1(double s, int c)
	{
		System.out.println("Area of triangle is "+ 0.5*s*c);
	}

}
