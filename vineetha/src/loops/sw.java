package loops;

public class sw {
	public static void main(String[] args) {
		
		/*
		 * switch(expression)
		 * 
		 * {
		 * case :
		 *    statmeent
		 *    break
		 *    
		 *case :
		 *    statement
		 *    break;
		 *    
		 *    
		 *default:
		 *    statmeent
		 *    break;
		 * * 
		 * */
		
		String fruits="banana";
		switch(fruits)// string, character, int
		{
		
		case "orange":
			System.out.println("orange");
			break;
			
		case "apple":
			System.out.println("apple");
			break;
			
		case "kiwi":
			System.out.println("kiwi");
			break;
			
		default:
			System.out.println("doesnot match");
			break;
		
		}
	}

}
