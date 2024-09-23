package randomqueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class perf4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(i);
		System.out.println("Enter the number");
		int v = Integer.parseInt(br.readLine());
		// strint to integer
		boolean result=check(v);
		if(result)
		{
			System.out.println("perfect");
		}
		
		else
		{
			System.out.println("no");
		}
	}
	
	public static boolean check(int n)
	{
		int s=(int)Math.sqrt(n);
		if(s*s==n)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
