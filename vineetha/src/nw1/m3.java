package nw1;

import java.util.Scanner;

public class m3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String w=s.nextLine();
		System.out.println(result(w));
	}

	public static String result(String w)
	{
		String[] a = w.split(" ");
		String result= " ";
		for(String x:a)
			//       vinitha   =>   2,3,4
		{
			//                  2,5
			result+=x.substring(1,x.length()-1)+ " ";   //ignoring first and last cheacter   // take second to fourth 
		}
		return result;
	}
}
