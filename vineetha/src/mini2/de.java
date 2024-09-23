package mini2;
import java.util.Scanner;
public class de {
	
	/*In this program, the password is categorized into three categories: 
	 * invalid, weak, and strong. 
	 * The password becomes invalid if the length of the password is less than 8 characters. 
	 * The password falls under the weak category if it does not contain at least one uppercase character, 
	 * one lowercase character, one digit, and a special character. 
	 * 
	 * And the password comes under the strong category if it contains all these characters.
	 */

	

	
	   public static void main(String[] args)
	   {
	      int passwordLength=8, upChars=0, lowChars=0;
	      int special=0, digits=0;
	      char ch;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Password: ");
	      String password = s.nextLine();
	      
	      int total = password.length();
	      if(total<passwordLength)
	      {
	         System.out.println("\nThe Password is invalid!");
	         return;
	      }
	      else
	      {
	         for(int i=0; i<total; i++)
	         {
	            ch = password.charAt(i);
	            if(Character.isUpperCase(ch))
	               upChars = 1;
	            else if(Character.isLowerCase(ch))
	               lowChars = 1;
	            else if(Character.isDigit(ch))
	               digits = 1;
	            else
	               special = 1;
	         }
	      }
	      if(upChars==1 && lowChars==1 && digits==1 && special==1)
	         System.out.println("\nThe Password is Strong.");
	      else
	         System.out.println("\nThe Password is Weak.");
	   }
	}


