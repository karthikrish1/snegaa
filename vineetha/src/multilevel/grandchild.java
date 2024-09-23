package multilevel;

//parent<=> child <=> grandchild
public class grandchild extends child {

	public static void main(String[] args) {
		
		//calling its own methods
		grandchild.gs();
		grandchild g= new grandchild();
		g.gn();
		
		//after inheritance (striaght connection)
		grandchild.cs();
		g.cn();
		
		// child is having connection with parent (indirect connection)
		
		grandchild.ps();
		g.pn();
	}
	
	public static void gs()
	{
		System.out.println("grandchild static method");
	}
	
	
	public void gn()
	{
		System.out.println("grand child nonstatic method");
	}
}
