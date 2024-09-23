package Arrays;

import java.util.Arrays;

public class d4 {
public static void main(String[] args) {
	int a[]= {1,29,30,90};
	System.out.println(Arrays.toString(a));
	int index=2;
	int[] f = d4.removal(a, index);
	System.out.println(Arrays.toString(f));
	
}

public static int[] removal(int a[], int index)
{
	if(a==null || index<0 ||index>=a.length)
	{
		return a;
	}
	int b[]=new int[a.length-1];
	System.arraycopy(a, 0, b, 0, index);// copied=> upto index   b={1,29,90}
	//System.arraycopy(src, srcPos, dest, destPos, length);
	
System.arraycopy(a, index+1, b, index, a.length-index-1);

return b;
}
}
