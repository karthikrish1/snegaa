package hierrarchial;

public class child1  extends parent {

	public static void main(String[] args) {
		
		child1.c1s();
		child1 ob= new child1();
		ob.c1n();
		
		//after inheritance
		child1.ps();
		ob.pn();

	}
	
	public static void c1s()
	{
		System.out.println("child class1 satic method");
	}

	
	
	public  void c1n()
	{
		System.out.println("child class1 non satic method");
	}

}
