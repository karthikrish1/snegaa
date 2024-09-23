package clndrr;

import java.util.Calendar;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c = Calendar.getInstance();

System.out.println("CURRENT "+ c.get(Calendar.DAY_OF_WEEK));

System.out.println(c.getMinimum(Calendar.DAY_OF_WEEK));

System.out.println(c.getMaximum(Calendar.DAY_OF_WEEK));

System.out.println();

System.out.println("CURRENT "+ c.get(Calendar.DAY_OF_MONTH));
System.out.println(c.getMinimum(Calendar.DAY_OF_MONTH));

System.out.println(c.getMaximum(Calendar.DAY_OF_MONTH));

System.out.println();
System.out.println("CURRENT "+ c.get(Calendar.DAY_OF_YEAR));

System.out.println(c.getMinimum(Calendar.DAY_OF_YEAR));

System.out.println(c.getMaximum(Calendar.DAY_OF_YEAR));


	}

}
