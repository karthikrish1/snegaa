package regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f4 {

	// identifier : name given to a package, class, method, variable,interface 
	//starts with uppercase/lowercase/_/$
	//it should be single word
	//white spaces are not allowed
	// should not start with digit
	
	//          ^([a-zA-z_$][a-zA-z\\d_$]*)$
	
	
	//starts with-> lowercase
	//alphanumeric#
	// no whitespaces 
	
	public static void main(String[] args) {
		
		String s="java_4first";
		System.out.println(f4.validate(s));
	}
	
	public static boolean validate(String s)
	{
		String regex= "^([a-zA-z_$][a-zA-z\\d_$]*)$";
		Pattern p=Pattern.compile(regex);
		if(s==null)
		{
			return false;
		}
		Matcher m = p.matcher(s);
		return m.matches();
		
	}
}
