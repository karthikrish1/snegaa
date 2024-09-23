package Filew;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class r3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s = "C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\vini.txt";

//reading the content , storing in list format
List<String> s1=Files.readAllLines(Paths.get(s));
System.out.println(s1);
	}

}
