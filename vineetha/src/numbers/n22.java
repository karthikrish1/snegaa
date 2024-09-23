package numbers;

public class n22 {

	public static void main(String[] args) {
		
		int a=234;
		int b=23;
		boolean result = checking(a,b);
		System.out.println(result);
	}
	
	public static boolean checking(int a, int b)
	{
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		
		int n1=s1.length();
		int n2=s2.length();
		
		if(n1<n2)
		{
			return false;
		}
		
		for(int i=0;i<n2;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;
			}
		}
		
		return true;
	}
}
