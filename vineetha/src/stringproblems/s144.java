package stringproblems;

public class s144 {
public static void main(String[] args) {
	
	// only a,phabets
	
	String n="abc";
	System.out.println(check(n));
}

public static boolean check(String s)
{
	if(s==null ||s.equals(""))
		{
		return false;
		}
		
	
	for(int i=0;i<s.length();i++)
	{
		char c = s.charAt(i);
		
		if((!(c>='A' && c<='Z')) &&  (!(c>='a' && c<='z')))
		{
			return false;
		}
		
		
	}
	
	return true;
}	
}
