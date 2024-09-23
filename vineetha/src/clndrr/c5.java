package clndrr;

import java.util.Date;

public class c5 {
public static void main(String[] args) {
	
	Date d1= new Date(10,10,2000);
	Date d2= new Date(19,10,2000);
	
	int result=d1.compareTo(d2);
	System.out.println(result);
	
	if(result>0)
	{
		System.out.println("date 1 is later than date 2");
	}
	
	else
	{
		System.out.println("date 2 is late than date 1");
	}
}
}
