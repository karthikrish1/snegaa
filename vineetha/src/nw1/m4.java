package nw1;

import java.util.Scanner;

public class m4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word ");
		String w=s.nextLine();
		System.out.println(result(w));
		//a  : 97
		//A  : 65
	}
	
	public static String result(String w)
	{
		char[] c = w.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int k=i;//first character index 
			while(i<c.length && c[i]!=' ')
			
				i++;
			// i: store index of last character 
			// a/A         cond                ?    true        :  false
			c[k]= (char)(c[k]>='a' && c[k]<='z'? ((int)c[k]-32) :(int)c[k]);
			
			c[i-1]= (char)(c[i-1]>='a' && c[i-1]<='z'? ((int)c[i-1]-32) :(int)c[i-1]);
			
			
			//2  : lower to upper
			//4   : upper to lowecase
		}
		return new String(c);
	}

	//String n= new String("welcome");
	// String n="welcome";
}
