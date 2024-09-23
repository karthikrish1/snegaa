package hierrarchial;

import fnl.f1;
import localvsglobal.l1;

public class c1 {

	//public
	
	public static void main(String[] args) {
		l1 ob= new l1();
		System.out.println(ob.age);
		System.out.println(ob.n);
		f1 ob1= new f1();
		System.out.println(ob1.age);
				
	}
}


//class

// global sttaic, flobal nonstatic, global final variable 
/*global variables
 * 
 * same class, same package
 *       static method: static global
 *       nonstatic method: both
 *       
 * diff class, same package
 *      both globl  : using its object
 *      
 *diff package 
 *      both globl: using object: have public keyword 
 * 
 * 
 * 
 ** 
 * */