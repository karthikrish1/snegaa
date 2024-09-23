package d12;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class o2 {
public static void main(String[] args) {
	
	Date d= new Date();
	Locale Eng= new Locale("en","ch");
	DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,Eng);
	System.out.println("England format "+ df.format(d));
	System.out.println();
	Locale Italian= new Locale("it","ch");
	DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,Italian);
	System.out.println("Italian format "+ df1.format(d));
	System.out.println();
	Locale Russian= new Locale("ru","ch");
	DateFormat df11 = DateFormat.getDateInstance(DateFormat.FULL,Russian);
	System.out.println("Russian format "+ df11.format(d));
	System.out.println();
	Locale French= new Locale("fr","ch");
	DateFormat df12 = DateFormat.getDateInstance(DateFormat.FULL,French);
	System.out.println("French format "+ df12.format(d));
	System.out.println();
	Locale spanish= new Locale("es","ch");
	DateFormat df1d = DateFormat.getDateInstance(DateFormat.FULL,spanish);
	System.out.println("spanish format "+ df1d.format(d));
	System.out.println();
	Locale chinese= new Locale("cn","ch");
	DateFormat df1e = DateFormat.getDateInstance(DateFormat.FULL,chinese);
	System.out.println("chinese format "+ df1e.format(d));
	
	
}
}
