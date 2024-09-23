package d12;

import java.util.Calendar;
import java.util.Formatter;

public class d1 {
public static void main(String[] args) {
	Calendar c = Calendar.getInstance();
	Formatter f= new Formatter();
	f.format("%tB %tb %tm", c,c,c);
	System.out.println(f);
	
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println(c.get(Calendar.DAY_OF_MONTH));
	System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(c.get(Calendar.DAY_OF_YEAR));
	System.out.println(c.get(Calendar.HOUR_OF_DAY));
	System.out.println(c.get(Calendar.MINUTE));
	System.out.println(c.get(Calendar.SECOND));
	
//add-> month, year and date 
	
}

}
