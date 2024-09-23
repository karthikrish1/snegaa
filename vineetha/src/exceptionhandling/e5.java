package exceptionhandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e5 {
	// throw
	
	// create your own excepton
	// throw new exceptionname("message");

		
			    public static boolean isValid_WeekDay(String str)
			    {
			 
			        // Regex to check valid weekday
			        String regex
			            = "^(sun|Sun|mon|Mon|t(ues|hurs)|(T(ues|hurs))|Fri|fri)(day|\\.)"
			              + "?$|wed(\\.|nesday)?$|Wed(\\.|nesday)?$|Sat(\\.|urday)"
			              + "?$|sat(\\.|urday)?$|t((ue?)|(hu?r?))\\.?$|T((ue?)|(hu?r?))\\.?$";
			 
			        // Compile the ReGex
			        Pattern p = Pattern.compile(regex);
			 
			        // If the str
			        // is empty return false
			        if (str == null) {
			            return false;
			        }
			 
			        // Pattern class contains matcher()
			        // method to find matching between
			        // given str using regex
			        Matcher m = p.matcher(str);
			 
			        // Return if the str
			        // matched the ReGex
			        return m.matches();
			    }
			 
			    // Driver Code.
			    public static void main(String args[])
			    {
			 
			        // Test Case 1:
			        String str1 = "Sunday";
			        System.out.println(isValid_WeekDay(str1));
			 
			        // Test Case 2:
			        String str2 = "Monday";
			        System.out.println(isValid_WeekDay(str2));
			 
			        // Test Case 3:
			        String str3 = "Tues.";
			        System.out.println(isValid_WeekDay(str3));
			 
			        // Test Case 4:
			        String str4 = "Payday";
			        System.out.println(isValid_WeekDay(str4));
			 
			        // Test Case 5:
			        String str5 = "Friday";
			        System.out.println(isValid_WeekDay(str5));
			 
			        // Test Case 6:
			        String str6 = "Birthday";
			        System.out.println(isValid_WeekDay(str6));
			    }
			}
	


