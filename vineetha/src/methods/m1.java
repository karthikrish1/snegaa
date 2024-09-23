package methods;

public class m1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Product is"+ m2.produ());
		//System.out.println("area of triangle is "+ m2.area());
		m1.square();
		m1.square();
		m1.div();
		// public: can be called anywhere inside the project
		// private: can call it only within the class 
		
		// public:  product of two numbers
		//private:  area of rectangle 
	}
	
	public static void square()
	{
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}
	
	private static void div()
	{
		double m=3.4;
		double n=2.0;
		System.out.println("division of two numbers "+ m/n);
	}
	
	
	
	
	
	
	
	

}


/*
 * method: block of code whch performs certain action
 * 
 * static
 * nonstatic 
 * 
 * method should be created outside the main method, inside the class 
 * method should be called inside the main methd
 * 
 * static:  fixed memory space
 * 
 * syntax for creation:   accessmodifier static returntype name(){}
 * syntax for calling  : classname.methodname();
 * 
 * accessmodifier: public, private, protected
 * returntype: void, int, double, float, string, char 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 