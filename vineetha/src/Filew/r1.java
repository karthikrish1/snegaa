package Filew;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class r1 {
	public static void main(String[] args) throws IOException  {
		
		//File                : reach          : pass path of the file as input
		//FileReader          : fetch          : pass file object as input
		//BufferedREader      : read           : pass file reader object as  input
		
		// nonstatic 
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\vini.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
{
	System.out.println(line);}
	}
	
	/*
	 *first time : br.readline reads hi  line=hi     line!=null         print hi
	 *second time : br.readline reads hello line=hello                  print hello
	 *third time    br.readline reads third element  line=bye           print bye
	 *fourth time                                    line=null   null!=null    
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

}
