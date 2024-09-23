package stringproblems;

public class c1 {
public static void main(String[] args) {
	
	String s="hi";
	priniting(s);
}

public static void priniting(String s)
{
	int l=s.length();
	int c;
	for(int i=0;i<l;i++)
	{
		c=s.charAt(i);
		System.out.println(c);
	}
	}
}
