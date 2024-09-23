package hierrarchial;

public class child2  extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child2.c2s();
		child2 ob= new child2();
		ob.c2n();
		
		//after inheritance
		child2.ps();
		ob.pn();

	}
	
	
	public static void c2s()
	{
		System.out.println("child class2 satic method");
	}

	
	
	public  void c2n()
	{
		System.out.println("child class2 non satic method");
	}

}
