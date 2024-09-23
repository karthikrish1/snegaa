package interface3;

public class c1 implements i1,i2{

	public static void main(String[] args) {
		
		c1 ob= new c1();
		ob.a();
		ob.b();
	}

	@Override
	public void b() {
		System.out.println("abstrac method of i2");
	}

	@Override
	public void a() {
		System.out.println("abstract method f i1");
	}
}
