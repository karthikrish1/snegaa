package encpsulation;

public class e1 {
	
	/*inheritance
	 * polymorphism
	 * abstraction
	 * encpasulation
	 * 
	 * encapsulation: hiding data 
	 * 
	 * doesnot follow inheritance
	 * 
	 * declare the variable as private 
	 * must not assign value straightly to the variable 
	 * 
	 * assign value to the variable through setter and getter method
	 * 
	 * setter, getter: public, nonstatic
	 * 
	 * setter: assign value to the variable
	 * getter: view the value stored in the varaiable * 
	 * * 
	 * */
	
	private String password;
	
	
	//setter
	public void setp(String p)
	{
		password=p;
	}
	
	//getter
	public void get()
	{
		System.out.println(password);
	}
	

}
