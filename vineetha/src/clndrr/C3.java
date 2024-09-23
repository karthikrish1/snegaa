package clndrr;

import java.util.Calendar;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println("current date is "+ (c.get(c.MONTH)+ 1)+ "-"+ c.get(c.YEAR)+ "-"+ c.get(c.DATE));
		
		System.out.println("current Time is "+ c.get(c.HOUR_OF_DAY)+ "-"+ c.get(c.MINUTE)+ "-"+ c.get(c.SECOND));
		c.add(Calendar.HOUR, 15);
		
System.out.println("MODIFIED date is "+ (c.get(c.MONTH)+ 1)+ "-"+ c.get(c.YEAR)+ "-"+ c.get(c.DATE));
		
		System.out.println("MODIFIED Time is "+ c.get(c.HOUR_OF_DAY)+ "-"+ c.get(c.MINUTE)+ "-"+ c.get(c.SECOND));
		
		
	}

}
