package INTEFACE2;

public class c1 implements display {

	public static void main(String[] args) {
		
		c1 ob= new c1();
		ob.ab();
	}

	@Override
	public void ab() {
		
		System.out.println("abstract method of interface ");
		
	}
}
