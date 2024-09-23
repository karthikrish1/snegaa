package Inter;

public class c1  implements I1{

	public static void main(String[] args) {
		
		c1 ob= new c1();
		ob.ab();//abstract method
		ob.nm();// nonstatic 
		I1.vs();//call static method of interface => call it only using interface name
	    //      class has nothing to do with static method 
	
	
	     c1.vs();// class's static method 
	}

	@Override
	public void ab() {
		
		System.out.println("hi");
		}
	
	//static methods cannot be overriden 
	public static void vs()
	{
		System.out.println("static method of class ");
	}

	
	/*Interface 
	 * 
	 * static method
	 *       cannot call static method of interface using class properties(classnmae, object)
	 *       call it=> only using interface name
	 *       cannot override static method
	 *     
	 *nonstatic method
	 *      default
	 *      
	 *abstract method
	 *         will not contain abstract keyword
	 *         will be empty
	 *         its content will be redefined in the class to which intterface cnnects to
	 * 
	 * class<=> interface: implements 
	 * 
	 * */
}
