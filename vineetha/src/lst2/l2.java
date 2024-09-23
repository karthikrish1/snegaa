package lst2;

import java.util.ArrayList;

public class l2 extends ArrayList<Integer>{
public static void main(String[] args) {
	l2 l= new l2();
	l.add(10);
	l.add(30);
	l.add(50);
	l.add(50);
	System.out.println(l);
	
	//l.subList(2, 4).clear();
	l.removeRange(0, 2);
	System.out.println(l);

}
}
