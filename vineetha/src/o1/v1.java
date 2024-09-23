package o1;

import java.util.Vector;

public class v1 {
public static void main(String[] args) {
	
	//first method
	int size=4;
	Vector<Integer>v= new Vector<>(size);	
	for(int i=1;i<=size;i++)
	{
		v.add(i);
	}
	
	System.out.println(v);
	
	//second method
	
	Vector<Integer>v1= new Vector<>();
	v1.add(90);
	v1.add(30);
	v1.add(90);
	v1.add(100);
	System.out.println(v1);
	
	//thrd method
	
	Vector u= new Vector();
	u.add(3);
	u.add("hi");
	u.add(10);
	System.out.println(u);
	
	
}
}
