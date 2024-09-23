package stringproblems;

public class s2 {

	//method2: using string builder class 
	public static void main(String[] args) {
		
		String n="vinitha";
		//Stringbuilder: nonstatic in nature
		StringBuilder s= new StringBuilder();
		s.append(n);  // adding value to string builder object
		s.reverse();
		System.out.println(s);
	}
}
