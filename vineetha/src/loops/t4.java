package loops;

public class t4 {
public static void main(String[] args) {
	
	int age=18;
	
	System.out.println(++age);
	System.out.println(age);
	switch(age)// string, character, int
	{
	
	case 0:
		System.out.println("not born");
		break;
		
	case 4:
		System.out.println("toddler");
		break;
		
	case 18:
		System.out.println("adult");
		break;
		
	default:
		System.out.println("doesnot match");
		break;
	
	}
}
}
