package conversionn;

public class p4 {
public static void main(String[] args) {
	String s="vinitha";
	int n=s.length();
	System.out.println("Smallest letter ascii value "+ smallest(s,n));
	System.out.println("largest letter ascii value "+ largest(s,n));
}

public static char smallest(String s, int n)
{
	char small='z';
	for(int i=0;i<n;i++)
	{
		if(s.charAt(i)<small)
		{
			small=s.charAt(i);
		}
	}
	return small;
	
}

public static char largest(String s, int n)
{
	char large='A';
	for(int i=0;i<n;i++)
	{
		if(s.charAt(i)>large)
		{
			large=s.charAt(i);
		}
	}
	return large;
	}
}

// int pdo=1
// iterate through
//prod*=s.charAt(index)
//return prodt
