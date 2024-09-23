package spr;

public class c1 extends p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c1 ob= new c1();
		ob.p();
	}
	
	
	public void p()
	{
		
		display();
		super.display();
		
	}
	
	
	public void display()
	{
		System.out.println("child class display metohd");
	}

}
