package lst2;

import java.util.ArrayList;
import java.util.Scanner;

public class l9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the number of elements in list ");
int n=s.nextInt();
ArrayList<String>l= new ArrayList<>();

for(int i=0;i<n;i++)
{
	System.out.println("Enter the value "+ (i+1)+" - ");
	l.add(s.next());
	
	}

System.out.println(l);
	}

}
