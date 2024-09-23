package mini2;
import java.util.Scanner;
public class de2 {


	public static void main(String[] args)
	   {
	      int passwordLength=8, upChars=0, lowChars=0;
	      int special=0, digits=0;
	      char ch;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("----Direction to Create a Password----");
	      System.out.println("1. The Password must be at least 8 characters long.");
	      System.out.println("2. The Password must contain at least one uppercase character.");
	      System.out.println("3. The Password must contain at least one lowercase character.");
	      System.out.println("4. The Password must contain at least one digit (0-9).");
	      System.out.println("5. The Password must contain at least one special characters.");
	      System.out.println("6. The Password must not contain < or >.");
	      
	      System.out.print("\nCreate a Password: ");
	      String password = s.nextLine();
	      
	      int total = password.length();
	      if(total<passwordLength)
	      {
	         System.out.println("\nThe Password's Length has to be of 8 characters or more.");
	         return;
	      }
	      else
	      {
	         for(int i=0; i<total; i++)
	         {
	            ch = password.charAt(i);
	            if(Character.isUpperCase(ch))
	               upChars++;
	            else if(Character.isLowerCase(ch))
	               lowChars++;
	            else if(Character.isDigit(ch))
	               digits++;
	            else
	            {
	               if(ch=='<' || ch=='>')
	               {
	                  System.out.println("\nThe Password is Malicious!");
	                  return;
	               }
	               else
	                  special++;
	            }
	         }
	      }
	      if(upChars!=0 && lowChars!=0 && digits!=0 && special!=0)
	      {
	         if(total>=12)
	         {
	            System.out.println("\nThe Strength of Password is Strong.");
	         }
	         else
	         {
	            System.out.println("\nThe Strength of Password is Medium.");
	         }
	         System.out.println("\n----The Password Contains----");
	         System.out.println("UpperCase Character: " +upChars);
	         System.out.println("LowerCase Character: " +lowChars);
	         System.out.println("Digit: " +digits);
	         System.out.println("Special Character: " +special);
	      }
	      else
	      {
	         if(upChars==0)
	            System.out.println("\nThe Password must contain at least one uppercase character.");
	         if(lowChars==0)
	            System.out.println("\nThe Password must contain at least one lowercase character.");
	         if(digits==0)
	            System.out.println("\nThe Password must contain at least one digit.");
	         if(special==0)
	            System.out.println("\nThe Password must contain at least one special character.");
	      }
	   }
	}


