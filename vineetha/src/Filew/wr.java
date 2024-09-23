package Filew;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class wr {

	public static void main(String[] args) throws IOException {
		
		//file :    reach the path            : path 
		// filewriter: create a file           : file object
		// bufferedwriter: write content into it: filewriter
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\vini.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.write("bye");
		bw.close();
		
	}
}
