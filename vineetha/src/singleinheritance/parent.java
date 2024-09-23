package singleinheritance;

public class parent {
	
	
	
	public static void ps()
	{
		System.out.println("parent class static method");
	}
	
	
	public void pn()
	{
		System.out.println("parent class nonstatic methoe");
	}

}



/*
 * inheritance: process in which one class acquires properties of other class
 * 
 * parent/base/super:   class whose properties are inherited
 * child/derived/sub:   class which uses properties of parent
 * 
 * child is using parent
 * 
 * after inheritance: child is having full control on parent
 * 
 * single inheritance:    parent<=> child
 * multiple inheritance: multiparents<=> single chilld   java doesnot support it
 * hierrarchial inheri : parent<=> child1, child2
 * mulilevel inherit   : parent<=> child <=> grandchild
 * 
 * to achieve inheritance:  child class definition=> extends parentclass name* 
 * */