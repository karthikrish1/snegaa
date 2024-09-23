package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r4 {
	public static void main(String[] args) {
		
		String a="I love India";
		System.out.println(a.endsWith("India"));
		
		 Pattern p = Pattern.compile(".*India");
		 Matcher m = p.matcher(a);
		 // I love.*
		 
		 System.out.println(m.find()? "True" : "False");
		 
		 
		// "Hi how are you "   // starts with
		 // today is thursday  => ends with 
	}

}
