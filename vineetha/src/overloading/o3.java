package overloading;

public class o3 {

	public static void main(String[] args) {
		o3.main();
		o3.main(3, 4);
		o3.main(2, 3, 4);
		
		//overload main method and find out product of two, three , four numbers 
		
	}
	
	public static void main()
	{
		System.out.println("hi");
	}
	
	
	public static void main(int a, int b)
	{
		System.out.println("Averae of two numbers : "+ (a+b)/2);
	}
	
	public static void main(int a, int b, int c)
	{
		System.out.println("Average of three numebrs "+ (a+b+c)/3);
	}
}
