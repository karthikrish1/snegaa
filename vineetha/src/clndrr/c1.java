package clndrr;

import java.util.GregorianCalendar;

public class c1 extends GregorianCalendar {
public static void main(String[] args) {
	
	c1 ob= new c1();
	
	System.out.println(ob.getTime());
	
	ob.clear();
	
	ob.set(GregorianCalendar.YEAR, 1999);
	ob.set(GregorianCalendar.MONTH, 8);
	ob.set(GregorianCalendar.DATE, 18);
	ob.set(GregorianCalendar.HOUR,4);
	ob.set(GregorianCalendar.MINUTE,14);
	ob.set(GregorianCalendar.SECOND,45);
	ob.complete();
	
	System.out.println(ob.getTime());
	
	
}
}
