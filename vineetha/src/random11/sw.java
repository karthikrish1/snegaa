package random11;

public class sw {
//s1  > s2    : returns positive value
//s1 = s2     : return 0
//s1 < s2     : returns negaive value
	
	public static void main(String[] args) {
		
		String s1="hi";
		String s2="hihow";
		System.out.println(result(s1,s2));
	}
	
	public static int result(String s1, String s2)
	{
		for(int i=0;i<s1.length()&& i<s2.length();i++)
		{
			if((int)s1.charAt(i)==(int)s2.charAt(i))
			{
				continue;
			}
			
			else
			{
				return (int)s1.charAt(i)-(int)s2.charAt(i);
			}
		}
		
		if(s1.length()<s2.length())
		{
			return s1.length()-s2.length();
		}
		
		else if(s1.length()>s2.length())
		{
			return s1.length()-s2.length();
		}
		else
		{
			return 0;
		}
	}
	
}
