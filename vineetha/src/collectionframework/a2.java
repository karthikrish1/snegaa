package collectionframework;

import java.util.ArrayList;

public class a2 {

	public static void main(String[] args) {
		
		ArrayList<String>l= new ArrayList<>();
		//       Character 
		
		//int, double, float, boolean, character, string 
		l.add("hi");
		l.add("hi");
		l.add("welcome");
		l.add("bye");
		l.add("hello");
		System.out.println(l);
		
		//   index     0    1        2    3     4    
		//             hi   hi   welcime  bye  hello   
		//add elements inbetween 
	   l.add(1,"vinitha");
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
	   
	   for(String x:l)
	   {
		   System.out.println(x);
	   }
	}

}
