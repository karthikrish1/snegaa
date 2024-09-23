package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r2 {
	
	
	public static void main(String[] args) {
		
		// 7 to 25 characters
		//alphanumeri
		//first character must be alphabet
		// it can have underscore
		
		//^[A-Za-z]\\w{6,24}$
		
		
		// first letter: numbr
		// symbols are inclued 
		// 4 to 10 
		
		
		String username="ab123fff_@";
		r2 ob= new r2();
		System.out.println(ob.validation(username));
		}
	public boolean validation(String username)
	{
		String regex="^[A-Za-z]\\w{6,24}$";
		Pattern p = Pattern.compile(regex);
		if(username==null)
		{
			return false;
		}
		Matcher m = p.matcher(username);
		if(m.matches())
		{
			return true;
		}
		else
		{
		return false;
		}
		
		
	}

}
