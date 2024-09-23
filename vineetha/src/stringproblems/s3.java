package stringproblems;

import java.util.Arrays;

public class s3 {
//method3: string=> character array
	public static void main(String[] args) {
		
		String n="vinitha";
		char[] m = n.toCharArray();
		System.out.println(Arrays.toString(m));
		
		for(int i=m.length-1;i>=0;i-=2)
		{
			System.out.println(m[i]);
		}
		
		// print letters at evn
		
		
	}
}