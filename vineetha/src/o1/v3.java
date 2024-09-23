package o1;

import java.util.Vector;

public class v3 extends Vector<String> {
public static void main(String[] args) {
	
	
	v3 v1= new v3();
	v1.add("hi");
	v1.add("helo");
	v1.add("bye");
	v1.add("no");
	System.out.println(v1);
	
	//all the odd numbers
	//v1.removeIf(n-> n%2==0);
	v1.removeRange(0, 2);
	System.out.println(v1);
	
	System.out.println(v1.firstElement());
	System.out.println(v1.lastElement());
	Object v2 = v1.clone();
	System.out.println(v2);
	// vector string :
	
// fruits names
	// length==4   remove it 
	
}
}
