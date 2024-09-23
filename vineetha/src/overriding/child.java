package overriding;

public class child extends parent {

	public static void main(String[] args) {
		
		//calling overriding method
		child c= new child();
		c.area();
		
		//calling overriden method 
		parent p= new parent();
		p.area();
		
	}
	
	
	public void area()
	{
		int l=3;
		int b=3;
	    System.out.println("Area of rectangle is "+ l*b);
	}
}
