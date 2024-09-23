package ranomd2;

public class d4 {
public static void main(String[] args) {
	
	int a[]= {10,2,3,4,5,0,8,7};
	int n=a.length;
	d4.print(a, n);
}

public static void print(int a[], int n)
{
	int max=a[n-1];
	System.out.println("last element is leader : "+ max);
	
	for(int i=n-2; i>=0;i--)
	{
		if(max<a[i])
		{
			max=a[i];
			System.out.println("remaining leader elements "+ max);
		}
	}
	}
}
