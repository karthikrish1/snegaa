package regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f2 {

	public static void main(String[] args) {
		
		//case insensitive
		String s="Google";
		Pattern p = Pattern.compile("goo",Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(s);
		
			if(m.find())
			{
				System.out.println(m.start()+ ":"+ m.end());
			}
	}
}
