package Filew;

import java.io.File;

public class renaming {
public static void main(String[] args) {
	
	File f1 = new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\vini.txt");
	File f2 = new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\dhivya.txt");
	
	f1.renameTo(f2);
}
}
