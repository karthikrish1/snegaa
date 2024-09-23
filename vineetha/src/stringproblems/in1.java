package stringproblems;

import java.util.Scanner;

public class in1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first text ");
		String original =s.nextLine();
		System.out.println("Enter the second text ");
		String tobe =s.nextLine();
		int index=2;
		in1 ob= new in1();
		System.out.println(ob.insert(original, tobe, index));
	}
	
	public String insert(String original, String tobe, int index)
	{
		String ns= new String();
		for(int i=0;i<original.length();i++)
		{
			ns+=original.charAt(i);
			
			if(i==index)
			{
				ns+=tobe;// adding string inbetween
			}
		}
		return ns;
		
		
	}
}
