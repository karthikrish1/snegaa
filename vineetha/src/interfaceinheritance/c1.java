package interfaceinheritance;

public class c1 implements i2 {
public static void main(String[] args) {
	
	c1 ob= new c1();
	ob.a1();
	ob.b();
}

@Override
public void a1() {
	
	System.out.println("from interface 1");
}

@Override
public void b() {
	
	System.out.println("from interface 2");
	
}
}
