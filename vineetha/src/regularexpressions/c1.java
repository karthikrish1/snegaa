package regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c1 {
	public static void main(String[] args) {
		
		
		//cvv
		//should have 3 or 4 digits
		//digits 0-9
		//must not contain alphabets
		Scanner s= new Scanner(System.in);
		System.out.println("Enter cvv");
		String original=s.nextLine();
		String r="^[0-9]{3,4}$";
		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(original);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.end());
			
		}
		
		// get some numbers
		// //d => check wther the value entered is integer 
		// positive integers [0-9]
		
		// get year from the user
		// //d{4}
		//match
		// leap or not
		// %4 and %400
		
		// get age from the user    //d{2,3}
		// 2 or 3 
		// age >18-> major
		// age<18 -> minor
		
		
		//CNRB-345
		// "CNRB-\\d{3}
		
		//1.  username validation
		
		// username:
		// scanner
		// should not contain any special characters
		//=> \\w+
		
		
		//2. phone number validation
		
		//phone number validation
		// type 1:   9566816449   
		//pattern :\\d{10}
		
		// type2:    956-681-6449/956.681.6449/ 956 681 6449
		//pattern:     \\d{3}[-\\.\\s]\\d{3}[-\\.\\s]d{4}    (- or . or space)
		
		//type3: 956-681-6449 x123/956-681-6449 ext123  
		//pattern:   \\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}
		
		//type4: (956)-681-6449  
		//pattern: \\(\\d{3}\\)-\\d{3}-\\d{4}
		
		
		// 3. admission number validation
		
		// admission number from the stude
		// varies from 3 to 5 digits 
		
		
		//4. address validation
		
		//address validation  2 car city
		//("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
		
		
	}

}
