package regexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f1 {

	//validation of bank account
	
	//written in numerical form
	//length varies from 9 to 18 digits
	//no white spaces should be present
	//special characters are not allowd
	// 0 to 9
	// ^[0-9]{9-18}$   or    // ^/d{9,18}$
	
	// id
	// 7 to 9
	// $#%
	// a-z atleast 
	
   public static void main(String[] args) {
		String bc="767678888#";
		System.out.println(f1.validate(bc));
			}
	public static String validate(String accno)
	{
		String regex="^[0-9]{9,18}$";
		Pattern p = Pattern.compile(regex);
		if(accno==null)
		{
			return "false";
		}
		
		Matcher m = p.matcher(accno);
		if (m.matches())
		{
			return "true";
		}
		
		else
		{
			return "false";
		}
		
	}
	
	// username :  first letter number  , 4 to 16 
	
	
}
