package operators;

public class o1 {

	public static void main(String[] args) {
		// arithmetic operators: +,-,*,/,++,--
		// comparision operators: <,>,<=,>=,==,!=
		// assignment operators :+=,-=,*=,/=
		//conditional operator/ternary operator:    condition ?  true: false 
		//logical operators: and, or, not
		int age=30;
		System.out.println(age);
		//post variablename++ ,variablename--
		System.out.println(age--);  //age++:   age=age+1     age--= age=age-1
		System.out.println(age);
		System.out.println();
		
		//pre :    ++variablename,    --variablename 
		int b=40;
		System.out.println(b);
		System.out.println(--b);//++b: 1+b     --b: 1-b

		int m=40;
		System.out.println(m+=10);//50
		System.out.println(m-=5);//45
		System.out.println(m*=2);//90
		System.out.println(m/=2);//45
		
		int h=4;
		//               cond   ?    true : false 
		System.out.println(h>18 ?  "Major": "minor");
		/*
		 *and :  &&
		 *
		 * true    true   true
		 * true    false  false
		 * false   true   false
		 * false   false  false
		 * 
		 * 
		 * 
		 * or    ||
		 *
		 * true    true   true
		 * true    false  true
		 * false   true   true
		 * false   false  false
		 * 
		 * not     !
		 * 
		 * true    false
		 * false   true 
		 * 
		 * 
		 * 
		 * */
		
		int k=9;
		int n=30;
		System.out.println("and operator");
		System.out.println(k>2 && n<40);
		
		System.out.println(k>2 && n==40);
		System.out.println(k==2 && n<40);
		System.out.println(k==2 && n==40);
		System.out.println();
		System.out.println("or operator");
		System.out.println(k>2 || n<40);
		System.out.println(k>2 || n==40);
		System.out.println(k==2 || n<40);
		System.out.println(k==2 || n==40);
		System.out.println();
		System.out.println("Not");
		System.out.println(k==9);
		System.out.println(k!=9);
		double p=45.5;
		System.out.println(45.4/2);// division: quotient value
		System.out.println(p%2);//remainder
		
	}

}
