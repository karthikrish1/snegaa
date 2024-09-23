package primee;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the startin value : ");
		int start=s.nextInt();
		
		System.out.println("Enter the ending value : ");
		int end=s.nextInt();
		
		int i, j, f;
		
		//iteratng through the range
		
		for(i=start;i<=end;i++)
		{
			if(i==0 || i==1)
			continue;
			f=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=0;
					break;
				}
			}
			
		
		
		if(f==1)
		{
			System.out.println("prime : "+ i);
		}
		
	}
}
}
