package innerclass;

import innerclass.c3.c4;

public class result {

	public static void main(String[] args) {
	
	c4 inner = new c3.c4();
	System.out.println("square  is "+(inner.b*inner.b));
	}
}
