package Arrays;

import java.util.Arrays;

public class in1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(Arrays.toString(a));
	int n=10;
	int y=300;
	int position=4;
	int[] b = in1.inserting(a, n, position, y);
	System.out.println(Arrays.toString(b));
}

public static int[] inserting(int b[], int n, int position,int y )
{
	
int newarray[]=new int[n+1];
//iterate through the new array
for(int i=0;i<n+1;i++)
{
	if(i<position-1)
	{
		newarray[i]=b[i];   //fetchn all the elements before position and storing in in the new 
	}
	else if (i==position-1)
	{
		newarray[i]=y;  //inserting the element in posiition
		
	}
	else
	{
		newarray[i]=b[i-1];
	}
	}
return newarray;
}
}

/*position=4    y=300  n=10
 *     i=0    i<11
 *              0<4-1      0<3    => newarray[0]=b[0]         newarray={1}
 *               1<3        1<3   -> newarray[1]=b1[]         newarray={1,2}
 *               2<3                 newaaray[2]=b[2]         newarray={1,2,3}
 *               
 *               3<3
 *                
 *                i==3        newarray[3]y                     newarrat{1,2,3,300}
 *                i=4         newarray[4]=b[3]                 newarrat{1,2,3,300,4}
 *                i=5         newarray[5]=b[4]                  newarrat{1,2,3,300,4,5}
 *               
 *          
 *               
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
