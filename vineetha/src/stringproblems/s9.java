package stringproblems;
public class s9 {
	public static void main(String[] args) {
		//madam, racecar, malayalam
		//palindrom
		String s="racecar";
		boolean result=s9.checking(s);
		if(result)// if(true)
			
		{
			System.out.println("yes they are palindrom");
		}
		
		else
		{
			System.out.println("no they are not");
		}}
	public static boolean checking(String s)
{
		
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
		
		if(s.equals(a))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
