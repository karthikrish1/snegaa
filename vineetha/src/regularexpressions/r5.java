package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r5 {

	public static void main(String[] args) {
		
		String regex="(India)";
		String tobe="I love India India is my country ";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(tobe);
		System.out.println(m);
		System.out.println("Before replacement "+ tobe);
		
		String replace="Chennai";   //Chennai 
		
		StringBuffer builder= new StringBuffer();
		
		// string => I love India India is my country
		
		// object-> appending after replacement -=> resultant 
		while(m.find())
		{
			m.appendReplacement(builder, replace);
		}
		m.appendTail(builder);
		
		System.out.println(builder.toString());

	}

}
