package conversionn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class d3 {
public static void main(String[] args) {
	HashMap<String,Integer>m=new HashMap<>();
	m.put("apple", 90);
	m.put("pineapple", 990);
	m.put("cat", 10);
	m.put("kiwi", 80);
	m.put("banana", 0);
	System.out.println(m);
	
	Set<Entry<String, Integer>> s = m.entrySet();
	
	ArrayList<Entry<String, Integer>> l = new ArrayList<Entry<String,Integer>>(s);
	System.out.println(l);
}
}

//treemp:  Double-> key     character-> element 