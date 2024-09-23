package mini2;

import java.util.Scanner;

public class disc {
	/*<=800	No discount
			>800 and <=1500	10%
			>1500 and <=2500	15%
			>2500 and <=5000	20%
			>5000	30%*/
	
	public static void main(String[] args) {
		float totalCost, costToPaid, discount;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Total Amount of Shopping: ");
	      totalCost = scan.nextFloat();
	      
	      if(totalCost<=800)
	      {
	         costToPaid = totalCost;
	         System.out.println("\nSorry, there is no discount to apply.");
	      }
	      else if(totalCost>800 && totalCost<=1500)
	      {
	         discount = (totalCost*10)/100;
	         costToPaid = totalCost - discount;
	         System.out.println("\nCongrats, You've got 10% discount on the total Purchase!");
	         System.out.println("The discount amount is " +discount);
	      }
	      else if(totalCost>1500 && totalCost<=2500)
	      {
	         discount = (totalCost*15)/100;
	         costToPaid = totalCost - discount;
	         System.out.println("\nCongrats, You've got 15% discount on the total Purchase!");
	         System.out.println("The discount amount is " +discount);
	      }
	      else if(totalCost>2500 && totalCost<=5000)
	      {
	         discount = (totalCost*20)/100;
	         costToPaid = totalCost - discount;
	         System.out.println("\nCongrats, You've got 20% discount on the total Purchase!");
	         System.out.println("The discount amount is " +discount);
	      }
	      else
	      {
	         discount = (totalCost*30)/100;
	         costToPaid = totalCost - discount;
	         System.out.println("\nCongrats, You've got 30% discount on the total Purchase!");
	         System.out.println("The discount amount is " +discount);
	      }
	      if(totalCost<=800)
	         System.out.println("\nYou've to Pay " + costToPaid);
	      else
	         System.out.println("\nNow You've to Pay Only " + costToPaid);
	   }
	}

