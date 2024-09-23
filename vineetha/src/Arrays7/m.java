package Arrays7;

import java.util.Arrays;

public class m {
public static void main(String[] args) {
	
	String result="";
	int first[]= {20,30,40};
	int second[]= {20,90,80};
	
	System.out.println(Arrays.toString(first));
	System.out.println(Arrays.toString(second));
	
	for(int i=0;i<first.length;i++)
	{
		int n1=first[i];
		int n2=second[i];
		result+=Integer.toString(n1*n2)+ " ";
	}
	
	System.out.println(result);
}
}
