package builtinclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dt {
	public static void main(String[] args) {
		//only date
		LocalDate ob= LocalDate.now();
		System.out.println(ob);
		
		//only time 
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		//both date and time
		LocalDateTime t1= LocalDateTime.now();
		System.out.println(t1);
		
		System.out.println("Dw "+ t1.getDayOfWeek());//day of week
		System.out.println("DM "+ t1.getDayOfMonth());//day of month
		System.out.println("DY " +t1.getDayOfYear() );//day of year
		System.out.println("Month "+ t1.getMonth());//month
		System.out.println("YEar "+ t1.getYear());//year
		System.out.println("Hour "+ t1.getHour());// hour
		System.out.println("Minute is "+ t1.getMinute());//minutes
		System.out.println("Second "+ t1.getSecond());
		
	}

}
