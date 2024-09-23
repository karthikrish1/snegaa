package unique;

import java.util.Scanner;

public class d1 {
	public static void main(String[] args) {
		
		//getting name and filterin only alphabets 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String f = s.nextLine();
		String[] v = f.split("\\W+");//filter only alphabets
		
		String result= new String();
		
		for(int i=0;i<v.length;i++)
		{
			result=result+v[i];
			
		}
		
		System.out.println(result);
	}

}
