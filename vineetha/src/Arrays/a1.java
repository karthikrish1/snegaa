package Arrays;

public class a1 {

	public static void main(String[] args) {
		// array: data structure that help u to storelarge amount of data under single name
		// index based
		// homogenous 
		
		//syntax :   datatype name[]= new datatype[size];
		
		int a[]= new int[4];
		// 0   1    2    3
		// 20  4    49    50
		
		a[0]=20;
		a[1]=4;
		a[2]=49;
		a[3]=50;
		
		System.out.println(a.length);
		
		//nrml 
		//iterate throuh index
		
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//method2 
		//for (datatype tempvariable: nameofthecollection)
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		//changing
		a[0]=200;
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		System.out.println("cloned array");
		int[] b = a.clone();
		for(int x:b)
		{
			System.out.println(x);
		}
		

	}

}
