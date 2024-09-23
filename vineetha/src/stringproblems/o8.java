package stringproblems;

import java.util.Scanner;

public class o8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hi
		//hii
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the word");
		String w = s.nextLine();
		System.out.println(check(w));
	}
	
	public static boolean check(String w)
	{
		int i=w.indexOf("i");
		if(i==-1)
			return false;
		if(i+1>w.length())
			return false;
		return w.substring(i+1,i+2).equals("i");
	}

}
