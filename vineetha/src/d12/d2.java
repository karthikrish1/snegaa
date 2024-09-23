package d12;

import java.util.Calendar;
import java.util.Date;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		System.out.println("Current "+ c.get(Calendar.MONTH));
		c.set(Calendar.MONTH, 11);
		System.out.println("Altered "+ c.get(Calendar.MONTH));
		System.out.println("CUrrent "+ c1.get(Calendar.YEAR));
		c.set(Calendar.YEAR, 2000);
		System.out.println("Altered "+ c.get(Calendar.YEAR));
		System.out.println("CURRENT "+ c1.get(Calendar.DATE));
		c.set(Calendar.DATE, 11);
		System.out.println("ALTERED "+ c.get(Calendar.DATE));
		
		
		
	}

}
