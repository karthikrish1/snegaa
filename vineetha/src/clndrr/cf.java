package clndrr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class cf {
public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat d= new SimpleDateFormat("dd/MM/YYYY");
	Scanner s= new Scanner(System.in);
	
	//fetching the date from the user in string format
	System.out.println("Enter first date ");
	String ds1 = s.nextLine();
	
	System.out.println("Enter second date ");
	String ds2 = s.nextLine();
	
	//converting string to date again
	Date first = d.parse(ds1);
	Date second = d.parse(ds2);
	
	System.out.println("First date is "+ first.toString());
	System.out.println("second date is "+ second.toString());
	
	// first is greater than second
	
	if(first.after(second))
	{
		System.out.println(first.toString()+ "is greater than "+ second.toString());
	}
	
	else if(first.before(second))
	{
		System.out.println(second.toString()+ "is greater than "+ first.toString());
	}
	
	else
	{
		System.out.println("both are same ");
	}
	
	
}
}
