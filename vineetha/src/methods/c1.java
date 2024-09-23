package methods;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*constuctor
		 * 
		 * initialisation 
		 * special method
		 * takes classname as its name
		 * no return type
		 * automatically called whenever an object is created
		 * 
		 * syntax for creation: acccessmodifier classname()
		 * syntax for calling : new classname();
		 * * */
		new c1();
		new c1(8.4);
		}
	
	//default constructor
	public c1()
	{
		System.out.println("im a constructor");
	}
	
	//parameterised 
	public c1(double a)
	{
		System.out.println("Area of circle is "+ 3.14*a*a);
	}

}
