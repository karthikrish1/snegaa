package exceptionhandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class e4 {

	public static void main(String[] args) throws IOException {
		
		// throws => main method=> throws exceptionname
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\exceptionhandling\\vini.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
	}
}
