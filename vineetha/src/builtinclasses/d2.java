package builtinclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d= new Date();
System.out.println("default format is "+ d.toString());


SimpleDateFormat f= new SimpleDateFormat("E D  F yyyy.MM.dd 'at' HH:mm:ss a zzz");
System.out.println("New format is "+f.format(d));
/*
 * 
 * y      : yyyy
 * M      : MM
 * d      :  dd F
 * h      : hour in am/pm : 12
 * H      : Hour in day
 * m      : minute in hour
 * s      : seconds in minutes
 * S      : milliseconds
 * E      : Day in week
 * D      : Day in year
 * F      : Day of week in month
 * w      : week in year
 * W      : week in month
 * a      : am/pm
 * z      : time zone
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

	}

}
