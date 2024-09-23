package d12;

import java.util.Calendar;
import java.util.Date;

public class er {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		
		
		System.out.println(c1.getTime());//current 
		
		c2=(Calendar)c1.clone();
		System.out.println(c2.getTime());
		
		c1.clear();
		System.out.println(c1.getTime());
		//changing date, month  and year 
		/*c1.set(Calendar.MONTH, 11);
		c1.set(Calendar.YEAR, 2000);
		c1.set(Calendar.DAY_OF_WEEK, 20);
		c1.set(Calendar.HOUR, 4);
		Date t = c1.getTime();
		
		
		c2.setTime(t); 
		System.out.println(c2.getTime());//changed*/ 
		
	}

}
