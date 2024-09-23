package builtinclasses;

public class s123 {
	public static void main(String[] args) {
		//String buffer
		//nonstatic 
		StringBuffer s= new StringBuffer("Vineetha");
		//   index     0    1  2    3  4    5   6    7   8   9
		//              V   i  n    e   e   t   h    a 
		
		//
		System.out.println(s);
		/*System.out.println(s.length());
		System.out.println(s.indexOf("e"));//first occurance 
		
		System.out.println(s.lastIndexOf("e"));//last occurance
		
		System.out.println(s.indexOf("e", 5)); // desiredcharacter, startingindex 
		
		System.out.println(s.lastIndexOf("i", 0));// desiredcharacter, startingindex
		// not present : -1 
		
		System.out.println(s.charAt(9));*/
		
		// append, insert
		
		System.out.println(s.append("hi"));
		System.out.println(s.insert(1, "S"));
		
		System.out.println(s.deleteCharAt(1));
		System.out.println(s.delete(8, 10));
		
		System.out.println(s.replace(0, 2, "MM"));
		
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		
		System.out.println(s.substring(0, 3));
		
		s.setCharAt(1, 'J');
		System.out.println(s);
		
		
		
	}

}
