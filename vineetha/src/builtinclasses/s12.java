package builtinclasses;

public class s12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String :  datatype and class
		// n     :  variable and object 
		
		//nonstatic 
		
		String n="Welcome";
		//   index      0    1    2    3    4    5    6
		//             W     e    l    c    o    m     e
		
		System.out.println(n.length());// number of characters present in it
		System.out.println(n.indexOf('e'));//first occurance
		System.out.println(n.lastIndexOf('e'));//last occurance 
		System.out.println(n.charAt(1));//character present in that index 
		
		//conversion
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		//replace
		System.out.println(n.replace('e', 'f'));
		System.out.println(n.replace("come", "go"));
		
		
		//substring 
		System.out.println(n.substring(1));  // 1,2,3,4,5,6 //starting index
		
		System.out.println(n.substring(3, 6));//3,4,5  //end index is exlusive 
		
		//checking 
		String n1="welcome";
		System.out.println(n.equalsIgnoreCase(n1));// just ignores case diff
		System.out.println(n.equals(n1));// consider case diff
		System.out.println(n.contentEquals("welcome"));
		
		
		System.out.println(n.startsWith("vinitha"));
		System.out.println(n.endsWith("come"));
		System.out.println(n.contains("yy"));
		
		System.out.println(n.concat(n1));
		System.out.println("welcome "+ n+"hi");
		
		System.out.println(n.isEmpty());
		
		
		
	}

}
