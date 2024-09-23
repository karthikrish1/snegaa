package mini2;

import java.util.Scanner;

public class courierca {
	/*write a Java program to compute courier charge based on parcel weight to ship. 
	 * The charge based on weight must be calculated as per following criteria:
	 *

		When the weight of parcel is less than or equal to 5 Kilogram, then the courier charge will be $6
		When the weight of the parcel is above 5 Kilogram, 
		then there is an additional charge of $1.2 for each extra Kilogram
		When the distance is less than or equal to 6 Kilometer, then the courier charge will be $4.2
When the distance is above 6 Kilometer, then there is an additional charge of $1.4 for each extra Kilometer            
*/
	
	public static void main(String[] args) {
		float weight, distance, courierCharge;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Weight of Parcel (in Kg.): ");
	      weight = scan.nextFloat();
	      System.out.print("Enter the Distance of Parcel (in Km.): ");
	      distance = scan.nextFloat();
	      
	      if(weight<=5)
	         courierCharge = 6;
	      else
	      {
	         weight = weight - 5;
	         courierCharge = (float)(6 + (weight*1.2));
	      }
	      if(distance<=6)
	         courierCharge = courierCharge + (float)4.2;
	      else
	      {
	         distance = distance - 6;
	         courierCharge = courierCharge + ((float)(4.2 + (distance*1.4)));
	      }
	      System.out.println("\nThe Courier Charge is " + courierCharge);
	   }
	
	}

