package numbers;

public class mk {
public static void main(String[] args) {
	int n1=345;
	int n2=45;
	System.out.println(checking(n1,n2));
}

public static boolean checking(int n1, int n2)
{
String s1=String.valueOf(n1);
	
	String s2=String.valueOf(n2);
	
	boolean f;
	
	f=s1.endsWith(s2);
	return f;
	
}

}
