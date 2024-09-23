package randomqueries;

import java.util.Scanner;

public class q1 {
	//ceaser cipher : encryption

	//AsCII code : A= 65     65  66   67   68   59  
	// AsCII code: a= 97
	public static void main(String[] args) {
		
		//CAT  =>  ECV
		
		//jAvA->  JaVa
		//toggling
		
		//   A      B      C    D     E       .....Z
		//  65      66     67  68
		
		//   E      F      G    H     H
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=s.nextLine();
		StringBuilder r= new StringBuilder("");
		//iterate through the word 
		for(int i=0;i<word.length();i++)
		{
			char c = word.charAt(i);
			
			if(c>='A' && c<='Z')// convertin to lower case
			{
				r.append((char)(c+4));
			}
			
			
			
		}
		
		System.out.println(r);
	}
}
