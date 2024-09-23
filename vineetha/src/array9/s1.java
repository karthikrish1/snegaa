package array9;

public class s1 {
	public static void main(String[] args) {
		
		String s[]= {"lemon","orange","grapes","apple"};
		for(String x:s)
		{
			System.out.println(x);
		}
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					
					// l >o      : 1 >0       o    l
					
					// g >a     : -1
					
					// a =a     :  a      no swapping
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting");
		for(String x:s)
		{
			System.out.println(x);
		}
		
	}

}
