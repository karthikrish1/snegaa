package sprr;

public class s2  extends s1{
	
	String name="vinitha";
public static void main(String[] args) {
	
	s2 ob= new s2();
	ob.display();
}

public void display()
{
	System.out.println("Name is "+ super.name);
	System.out.println("Name is "+ name);}
}
