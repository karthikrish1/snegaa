package conversionn;

import java.util.Vector;

public class p1 {
public static void main(String[] args) {
	
	Vector<Integer>v= new Vector<>();
	v.add(3);
	v.add(4);
	v.add(10);
	v.add(30);
	System.out.println(v);
	Vector<Integer>v1= new Vector<>();
	
	for(int x:v)
	{
		v1.add(x);
	}
	System.out.println(v1);
}
}
