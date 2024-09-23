package conversionn;

import java.util.HashMap;

public class s1 {
public static void main(String[] args) {
	
	//string array=> Hashmap
	
	String student="Dhviya:20, vinitha:40";
	HashMap<String,String>h= new HashMap<>();
	String[] r = student.split(",");
	for(String x: r)
	{
		String[] re = x.split(":");
		String name = re[0].trim();
		String id = re[1].trim();
		h.put(name, id);
	}
	
	System.out.println(h);
}
}
