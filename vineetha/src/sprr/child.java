package sprr;

public class child extends parent {
public static void main(String[] args) {
	
	child c= new child();
	c.printing();
}

public void display()
{
	System.out.println("im child display method");
	}


public void details()
{
	System.out.println("name is dhivya");
	}
public void printing()
{
	details();
	display();
	super.display();// points to the paren tmethod 
	}


}
