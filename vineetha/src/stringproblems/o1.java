package stringproblems;

import java.util.Scanner;

public class o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the word");
String w = s.nextLine();
System.out.println("Enter the nuber of characters");
int n=s.nextInt();
System.out.println(result(w,n));
	}
	
	public static String result(String w, int n)
	{
		//         first part  + last part
		//             0,2     + 3,5
		return w.substring(0,n)+w.substring(w.length()-n, w.length());
		
	}

}
