package exceptionhandling;

public class e1 {

	// exceptions can be handled using 
	//      try catch
	//      try with multiple catch
	//      try catch finally
	//      throws
	//      throw
	
	public static void main(String[] args) {
		
		// try:  code which is having prob of getting error
		// catch : only when error occurs , handling the exception
		
		try {
		
		//System.out.println(8/0);  //arithmetuc exception, string index out of bond, null pointer exception,arrayindex . number format exception
			//String n=null;
			//System.out.println(n.charAt(4));
			
			//int a[]= {3,4,5};
			//a[4]=50;
			
			String s="vnitha";
			int a=Integer.parseInt(s);
		
		}
		
		catch(Exception e)
		{
			System.out.println("error chck the code, error is "+ e);
		}
		
		System.out.println("hi");
	}
}
