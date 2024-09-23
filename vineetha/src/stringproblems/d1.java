package stringproblems;

public class d1 {

	public static void main(String[] args) {
		
		//pangram=> a to z
		
		String n="ABcDEFGHIJKLMNOPQRSTUVWXYZ";
		checking(n);
	}
	public static void checking(String z)
	{
		String s = z.toLowerCase();
		boolean result= true;
		
		for(char ch='a'; ch<='z'; ch++)
		{
			if(!s.contains(String.valueOf(ch)))
			{
				 result=false;
				break;
			}
		}
		
		if(result)
		{
			System.out.println("it is pangram");
		}
		
		else
		{
			System.out.println("it is not");
		}
	}
}
