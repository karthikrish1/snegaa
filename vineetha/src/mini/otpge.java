package mini;

import java.util.Random;
import java.util.Scanner;

public class otpge {
public static char[] otp (int len) {
	System.out.println("otp is ");
	String numbers="0123456789";
	
	Random r= new Random();
	
	
	char[] otp= new char[len];
	for(int i=0;i<len;i++)
	{
		otp[i]=numbers.charAt(r.nextInt(numbers.length()));
	}
	return otp;
}

public static void main(String[] args) {
	
	System.out.println("Enter the length of otp :");
	Scanner s= new Scanner(System.in);
	int l=s.nextInt();
	System.out.println( otp(l));//string+ char array 
}
}
