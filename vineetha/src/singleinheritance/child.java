package singleinheritance;

public class child extends parent {

	public static void main(String[] args) {
		
		//call its own methods
		child.cs();
		child c= new child();
		c.cn();
		
		//after inheritance:
		// child is having full control on parent
		child.ps();// calling parent class static method with child name
		c.pn();    // calling parent class nonstatic emthod with child object 
	}
	
	
	
	public static void cs()
	{
		System.out.println("child class static method");
	}
	
	public void cn()
	{
		System.out.println("child class nonstatic method ");
	}
}
