package builtinclasses;

public class m1 {
	
	public static void main(String[] args) {
		
		//Math: static in nature
		// mathematical calculations
		
		System.out.println(Math.addExact(10, 20));
		System.out.println(Math.subtractExact(20, 10));
		System.out.println(Math.multiplyExact(30, 40));
		System.out.println(Math.floorDiv(31, 2));//quotient
		System.out.println(Math.floorMod(31, 2));//reminder 
		
		System.out.println(Math.pow(34, 3));//base   , power
		System.out.println(Math.sqrt(30));
		System.out.println(Math.cbrt(45));
		
		System.out.println(Math.round(3.56));
		System.out.println(Math.ceil(3.1));// rounding up the value
		System.out.println(Math.floor(3.9));// rounding down the value
		System.out.println(Math.abs(-2));
		
		System.out.println(Math.sin(0));
		System.out.println(Math.cos(30));
		System.out.println(Math.tan(0));
		System.out.println(Math.log10(3));
		System.out.println(Math.PI);
		System.out.println(Math.max(30, 4));
		System.out.println(Math.min(9, 8));
		
	}

}
