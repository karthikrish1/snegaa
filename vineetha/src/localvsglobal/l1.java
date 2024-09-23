package localvsglobal;

public class l1 {
	//local variables: used within the method, cannot use it outside the method
	//brown in color
	
	//global variables: can be used across the class
	// blue in color
	// types: static, nonstatic global variables 
	
	//static methods: accept only static global variables
	// nonstatic method: accept both static and nonstatic global variables 
	
	public int age=30;   //nonstatic global variable 
	public static String n="vinitha";// static global variable 
	
	public static void main(String[] args) {
		//l1.s1();
		l1 ob= new l1();
		ob.details();
	}

	public static void s1()
	{
		//static method: accept only static global variable 
		//will not accept nonstatic global variable 
		//System.out.println(age);//accepts only static global variables 
		System.out.println(n);
	}
	
	public void details()
	{
		System.out.println("Name is "+ n);
		System.out.println("Age is "+ age);
		
	}
	
}
