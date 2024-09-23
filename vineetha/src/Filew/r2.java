package Filew;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class r2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f= new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\vini.txt");
		int count=0;
		Scanner s= new Scanner(f);
		while(s.hasNext())
		{
			System.out.println(count+ "."+s.next());
			count+=1;
	}
	}

}
