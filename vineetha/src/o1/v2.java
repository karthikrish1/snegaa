package o1;

import java.util.ListIterator;
import java.util.Vector;

public class v2 {
public static void main(String[] args) {
	
	Vector<Integer>v1= new Vector<>();
	v1.add(90);
	v1.add(30);
	v1.add(90);
	v1.add(100);
	System.out.println(v1);
	
	//v1.remove(0);
	//System.out.println(v1);
	
	//v1.removeElementAt(0);
	//System.out.println(v1);
	
	//updating 
	v1.set(0, 100);
	System.out.println(v1);
	
	//inserting
	v1.insertElementAt(200, 1);
	System.out.println(v1);
	//iterating through the elements 
	System.out.println("first method");
	for(int x:v1)
	{
		System.out.println(x);
		
	}
	
	//itearting througn the inded 
	System.out.println("second method");
	for(int i=0;i<v1.size();i++)
	{
		System.out.println(v1.get(i));
	}
	
	System.out.println("third method");
	//forward iteratiion
	//iterating through the elements 
	ListIterator<Integer> l = v1.listIterator();
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	
	System.out.println("fourth");
	//ListIterator<Integer> l1 = v1.listIterator();
	while(l.hasPrevious())
	{
		System.out.println(l.previous());
	}
	

}
}
