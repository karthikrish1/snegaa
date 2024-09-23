package numbers;

public class d5 {
public static void main(String[] args) {
	
	// checking whether a number ends with another number or not
	
	int n1=3456;
	
	int n2=569  ; 
	
	System.out.println(checking(n1,n2));
	
	
	
}

public static boolean checking(int n1, int n2)
{
	String s1=String.valueOf(n1);
	
	String s2=String.valueOf(n2);
	
	int l1=s1.length();
	int l2=s2.length();
	
	if(l1<l2)
	{
		return false;
	}
	
	for(int i=0;i<l2;i++)
	{
		if(s1.charAt(l1-i-1)!=s2.charAt(l2-i-1))
		{
			return false;
		}
	}
	
	return true;
	}
}
