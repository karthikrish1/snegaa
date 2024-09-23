package Inter;

public interface I1 {

	//cannot have static main  methpd
	// have nonstatic method with default keyword
	// can have abstract method without abstract keyword
	
	// definition of class=> implements interfacename
	
	
	public static void vs()
	{
		System.out.println("static method of interface ");
	}
	
	default public void nm()
	{
		System.out.println("nonstatic method");
	}
	
	
	public void ab();  //abstract methpd
	
	
	
	
}
