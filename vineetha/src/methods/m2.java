package methods;



public class m2 {

	public static void main(String[] args) {
		
		System.out.println("Product is"+ m2.produ());
		System.out.println("area of triangle is "+ m2.area());
		System.out.println("Good mrng "+ m2.wish());
		System.out.println("Letter is "+ m2.re());
		System.out.println(m2.r());
	}
	
	
public static int produ()
	{
		int a=40;
		int b=3;
		return a*b;
		
	}
	
	private static double area()
	{
		double b=3.4;
		double h=3.9;
		double a=0.5*b*h;
		return a;
	}
	
	public static String wish()
	{
		String n="hi";
		return n+" vineetha!";
	}
	
	public static char re()
	{
		return 'a';
	}
	
	public static boolean r()
	{
		return false;
	}
}


/*void : 2 rules
 *other than void : 4
 *
 *
 *  method should be created outside the main method, inside the class 
    method should be called inside the main methd
   other than void
        creation: add return statement at end
        calling:  call it within sysout satement 
 */