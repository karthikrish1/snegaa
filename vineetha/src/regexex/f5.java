package regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f5 {
	
	//contains eight characters or more
	//should contain atleast one lower case
	// should contain atleast one uppercase
	// should contain atleast one digit
	// $@%#
	// no white space 
	
	// regext:  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%]).{8,})$"
	
	
	/*
	 * starts with uppercase 
	 * should contain % 
	 * should contain numbers in range 5 to 8 
	 * should contain lower case
	 * 
	 * 
	 * */
public static void main(String[] args) {
		
		String s="viNitha12$";
		System.out.println(f4.validate(s));
	}
	
	public static boolean validate(String s)
	{
		String regex= "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@#$%]).{8,})$";
		Pattern p=Pattern.compile(regex);
		if(s==null)
		{
			return false;
		}
		Matcher m = p.matcher(s);
		return m.matches();
		
	}

}
