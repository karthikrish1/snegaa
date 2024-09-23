package Arrays;

public class t1 {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		
		//               row  column
		a[0][0]=30;
		a[0][1]=90;
		a[0][2]=60;
		a[1][0]=70;
		a[1][1]=50;
		a[1][2]=20;
		a[2][0]=10;
		a[2][1]=60;
		a[2][2]=40;
		System.out.println(a.length);
		
		//          col 0       col  1      col2
		
		// row0       30           90          60
		// row 1     70            50          20
		// row 2     10            60          40
		
		for(int row=0;row<a.length;++row)
		{
			for(int col=0;col<a[row].length;++col)
			{
				System.out.println(a[row][col]);
				
			}
			System.out.println();
		}
	}
	
	/*a.length=3 
	 * 
	 * first iteration
	 *       row=0   row<3   0<3
	 *                col=0   a[0].length    0<3
	 *                           a[0][0]
	 *                col=1  1<3 a[0][1]
	 *                
	 *                col=2  2<3 a[0][2]
	 *                col=3   3<3
	 * second iteration
	 *     row=1   row<3   1<3
	 *            col=0   a[1].length  3   0<3    a[1][0]
	 *            col=1                    1<3    a[1][1]
	 *            col=2                    2<3    a[1][2]
	 *            ol=3                     3<3   
	 *            
	 * third iteration
	 *     row=2    row<3   2<3
	 *               col=0    a[2].length  0<3    a[2][0]
	 *               col=1                 1<3    a[2][1]
	 *               col=2                 2<3    a[2][2]
	 *               col=3
	 * fourth iteration
	 *  row=3    3<3//stop the 
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
}
