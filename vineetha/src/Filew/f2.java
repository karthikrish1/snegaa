package Filew;

import java.io.FileWriter;
import java.io.IOException;

public class f2 {
	public static void main(String[] args) throws IOException {
		FileWriter f= new FileWriter("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\v1.txt");
		f.write("hi im vinitha...");
		f.close();
	
	}

}
