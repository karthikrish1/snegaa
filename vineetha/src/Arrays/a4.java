package Arrays;

public class a4 {
	public static void main(String[] args) {
		int s[]= {10,10,9,8,7,8,0,9};
		System.out.println("Elements are : ");
		for(int x:s)
		{
			System.out.println(x);
		}
		System.out.println("elements that are duplicated ");
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				System.out.println(s[j]);
			}
		}
	}

	/*
	 * first iteration     i=0    j=1    ;  s[0] ==s[1]   10=10         
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
}
