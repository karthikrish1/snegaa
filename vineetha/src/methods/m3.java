package methods;

public class m3 {

	public static void main(String[] args) {
		// parameter: variable passed to a funcution
		// argument: value assigned to the parameter while calling it
		//number of parameters= number of arguments 
		
		m3.details("dhivya", 30, 67.34);
		m3.details("java", 450, 57.34);
		System.out.println("Letter is "+ m3.display('e'));
		m4 ob1=new m4();
        ob1.rectangle();
        //ob.addition();

	}
	
	public static void details(String name, int age, double sal)
	{
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("salary is "+ sal);
	}
	
	public static char display(char s)
	{
		return s;
	}

}



















/*
 * 
 * 
 * static   : fixed memory space
 * 
 * rules 
 *     method should be create outside the main method, inside the class
 *     method should be called inside the main method
 *     return type other than void
 *               add return statement at end 
 *               call it within sysout statement
 *               
 *       
 *    syntax for creation: accessmodifier static returntype name(){}
 *    syntax for calling :  classname.methodname();
 *    
 *    
 *    
 *    nonstatic : doesnot contain fixed memory space
 *                we need to allocate memory space 
 *                
 *                
 *     syntax for creation: accessmodifier  returntype name(){}
 *     syntax for calling : 
 *         step1: creating and naming object              classname objectname=  new classname();
 *         step2: calling nonstatic method                objectname.methodname();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
