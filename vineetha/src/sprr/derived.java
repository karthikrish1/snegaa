package sprr;

public class derived extends base{
	
	public static void main(String[] args) {
	 new derived();
	}
	
	public derived()
	{
		super();// make a call to base class cons
		System.out.println("derived class constructor");
	}

}
