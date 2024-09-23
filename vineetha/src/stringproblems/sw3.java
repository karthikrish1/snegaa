package stringproblems;

import java.util.Scanner;

public class sw3 {
public static void main(String[] args) {

	Scanner s= new Scanner(System.in);
	System.out.println("Enter the sentence");
	String word = s.nextLine();
	System.out.println(swapping(word));
}

public static String swapping(String w)
{
	if(w.length()<2)
		{
		return w;
		}
	//  last char + remaining character + first chara
	return  w.substring(w.length()-1)+ w.substring(1, w.length()-1)+ w.substring(0, 1);
}
}