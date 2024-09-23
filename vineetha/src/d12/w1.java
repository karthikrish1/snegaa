package d12;

import java.time.LocalDate;
import java.util.Calendar;

public class w1 {
public static void main(String[] args) {
	/*LocalDate t = LocalDate.now();
	System.out.println("Today date is "+ t);
	LocalDate yt = t.minusDays(1);
	System.out.println("Yesterday date is "+ yt);
	LocalDate tt = yt.plusDays(2); // t.plusDays(1)
	System.out.println("tmrw date is "+ tt);
	*/
	
	Calendar c = Calendar.getInstance();
	c.add(Calendar.DATE, -10);
	//System.out.println(c);
	System.out.println(c.getTime());
	
}
}
