package abstraction;

public class child extends parent{
	
	public static void main(String[] args) {
		
		child c= new child();
		c.ab();
		c.nm();
		
		//parent p= new parent();
		
		
	}

	
	public void ab() {
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}

}
