package abstraction;

abstract public class parent {
	
	public void nm()
	{
		System.out.println("nrml method");
	}
	
	
	abstract public void ab();
	
	/*abstraction: 
	 * 
	 *     hiding implementation details
	 *     it follows inheritance
	 *     achieved through abstract class and abstract method
	 *     class=> abstract class: add abstract keyword before it
	 *     
	 *     abstract class
	 *              nrml method
	 *              abstract method
	 *              
	 *     abstract method
	 *             nonstatic
	 *             will have abstract keyword
	 *             will be empty in its own place
	 *             will be redefined in its derived class
	 * cannt create an object for abstract class* 
	 * */

}
