package regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f3 {
	public static void main(String[] args) {
		
		String s="google";
		//?i-> case insensitive
		
		Pattern p = Pattern.compile("(?i)Goo");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+ ","+ m.end());
		}
	}
	
	
	//STRING: WELCOME VINITHA   => vini 
	

}
