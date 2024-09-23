package regularexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r6 {

	public static void main(String[] args) {
		
		List<String> v = Arrays.asList("apple","pineapple","chilli","greenapple","orange");
		
		//regex:   .apple
		
		Pattern p = Pattern.compile("....apple");  // 4lettersapple 
		
		for(String x:v)
		{
			Matcher m = p.matcher(x);
			if(m.matches())
			{
				System.out.println(x+ ": present");
			}
			else
			{
				System.out.println(x+": not present");
			}
		}
		
		
		// username :   alphanumeric 
		//^[a-zA-z0-9]+$
		
	//  store email ids in list format 
		
		// email id validation   :  dvyaksamy@gmail.com
		// first  regex:        /^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,})$/
		
		// second regex:        "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,18}$";s
	}
}
