package builtinclasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//both date and time
				LocalDateTime t1= LocalDateTime.now();
				System.out.println("BEfore formatting "+ t1);
				
				/*yyyy-MM-dd      2024-02-15
				 * 
				 * dd/MM/yyyy     15/02/2024
				 * 
				 * 
				 * dd-MM-yyy      15-02-2024
				 * 
				 * E,MMM dd yyy  Thu Feb 15 2024
				 ** 
				 * 
				 * */
				DateTimeFormatter ob=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
						String fi = ob.format(t1);
						System.out.println("after formatting "+ fi);
				

	}

}
