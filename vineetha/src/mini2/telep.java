package mini2;

import java.util.Scanner;

public class telep {
	/*The bill must be generated as per the following criteria:

The charge for the first 60 minutes of calls is $14.

And after the first 60 minutes of calls, the customer will be charged $.12 for each extra minute.

If the customer made less than 60 minutes of calls, 
then he or she also has to pay $14, even if he or she made no calls for that month.

The first 60 national calls are charged $14.

There is an additional charge at the rate of $0.12 for each extra minute of national calls.

The first 12 international calls are charged $16.

There is an additional charge at the rate of $2.34 for each extra minute of international calls.
*/
	public static void main(String[] args) {
		int nationalCalls, internationalCalls;
	      float phoneBill;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Total Minutes of National Calls: ");
	      nationalCalls = scan.nextInt();
	      System.out.print("Enter the Total Minutes of International Calls: ");
	      internationalCalls = scan.nextInt();
	      
	      if(nationalCalls==0)
	         phoneBill = 0;
	      else if(nationalCalls<=60)
	         phoneBill = 14;
	      else
	      {
	         nationalCalls = nationalCalls - 60;
	         phoneBill = 14 + (float)(nationalCalls * 0.12);
	      }
		  
	      if(internationalCalls==0)
	         phoneBill = phoneBill;
	      else if(internationalCalls<=12)
	         phoneBill = phoneBill + 16;
	      else
	      {
	         internationalCalls = internationalCalls - 12;
	         phoneBill = phoneBill + 16 + (float)(internationalCalls * 2.34);
	      }
	      
	      System.out.println("\nTelephone Bill this Month = " +phoneBill);
	}

}
