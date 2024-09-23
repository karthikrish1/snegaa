package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r1 {

	//regular expression :  sequence of characters that forms search pattern
	//pattern class: define the pattern
	// matcher class : searching 
	
	//*    - zero or more occurance of element
	// ?   - zero or one occurance
	// +   - one ore more occurance 
	//{n} - exactly
	//{n,}=> atleast 2
	//{n{start, end }}
	//[abc] => a or b or c
	//[a-d]=> a,b,c,d
	
	//[^abc]
	//[456]
	//[^456]
	//[0-4]
	//[^0-4]
	//[0-5][0-9]    : 00 to  59
	// |   word1 or word 2
	
	// .-> number f occurance 
	//^-> starts with
	//$-> ends with

	// /d-> only numerical digits 
	// //D-> only alphabets 
	
	// /s- white space 
	// /S- no white space
	
	
	//  /b- beginning or end  (and also middle)
	
	// /A  - beginning only  (^)
	
	// /Z-> end  only    ($)
	
	// w-> a-z, A-Z, 0-9, _
	
	//W-> ^w => whit space, symbols 
	
	// [a-zA-z]
	
	// [a-d[x-z]]:   ato d and x to z    a,b,c,d x,y,z
	
	
	//[a-z && f-k]   common value in bth ranges    f,g,h,i,j,k  
	
	
	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-z && f-k]"); 
		Matcher s = p.matcher("3& sun rises in moonthe east sun 4567");// string that we want to compare 
		
		while(s.find())// there is match
		{
			System.out.println("PAttern found from "+ s.start()+ ": "+ s.end());
		}
	}
}




//I amm 32 now time is 10.36am     -> filter only digits
//                                           non digits
//                                        I|am
//                                -> white space
//                                -> m{2}
//                                 ->  n..
//                                 -> ^I
//                                 -> no white space

