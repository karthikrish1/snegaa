package regularexpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fs {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\regularexpressions\\v.txt");
	    fw.write("hello how are you 989");
	   
	    fw.close();
	    
	    FileReader f1= new FileReader("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\regularexpressions\\v.txt");
	    BufferedReader bw= new BufferedReader(f1);
	   Pattern p = Pattern.compile("[A-Za-z][a-z]+");
	   String line;
	   while((line=bw.readLine())!=null)
{
		   
		   Matcher m = p.matcher(line);
		   while(m.find())
		   {
			   int start=m.start();// starting index 
			   int end=m.end();   /// ending index 
			   System.out.println(line.substring(start, end));
		   }
		   }
	
	}
	
	//String regex
    //= "^.*\\.(java|py|c|PHP|cs|cake|cshtml|csx|c|cpp|cp|cc|cobol|cob|ccp|css|flux|fx|go|jsp|kt|ktm|kts|numpy|numpyw|numsc|pls|pck|pkb|pks|plbplsql|sql|perl|r|rd|rsx|sh|bash|st|cs|swift|vb|class)$";

}
