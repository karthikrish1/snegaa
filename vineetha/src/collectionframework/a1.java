package collectionframework;

import java.util.ArrayList;

public class a1 {

	public static void main(String[] args) {
		
		/*
		 * collectionframework
		 * 
		 *     large amount of data undera single name  
		 *     list
		 *     queue
		 *     set
		 *     map
		 *     table
		 *     vector
		 *     stack
		 *     
		 *List:   
		 *    indexed
		 *    add
		 *    remove
		 *    retrieve
		 *    iterate
		 *    accept duplicates
		 *    arraylist, linkedlist 
		 *    homogenous 
		 *    
		 *  syntax: ArrayList<Datatype> name= new ArrayList<Datatype>();
		 *  int => Integer
		 *  String => String
		 *  double => Double
		 *  boolean=> Boolean
		 *  
		 * */
		ArrayList<Integer>l= new ArrayList<>();
		l.add(90);
		l.add(3);
		l.add(40);
		l.add(300);
		l.add(1000);
		System.out.println(l);
		
		//   index     0    1    2    3     4    
		//             90   3    40   300  1000
		//add elements inbetween 
	   l.add(1,7000);
	   System.out.println(l);
	   
	   //delete an element : know the index
	   
	   l.remove(3);
	   System.out.println(l);
	   
	  //retrive an element : know the index
	   System.out.println(l.get(0));
	   
	   //l.clear();
	   
	   Object m = l.clone();   //copying and storing in m
	   System.out.println(m);
	   
	   //usual iteration
	   // itearte through the index
	   for(int index=0;index<l.size();index++)
	   {
		   System.out.println(l.get(index));
	   }
	   
	   //enhanced for loop/for each loop
	   // for(datatype tempvariable:nameofthecollection
	   
	   for(int x:l)
	   {
		   System.out.println(x);
	   }
	   
	   
	}
}
