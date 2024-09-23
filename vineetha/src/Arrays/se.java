package Arrays;

public class se {
public static void main(String[] args) {
	
	String n[][]= {{"hi"},{"hello","bye"},{"hi","hello","bye"}};
	//         xol0     col1    col2
	//row0     hi
	//row 1     hello   bye
	//row2      hi      hello    bye
	
	for(int row=0;row<n.length;row++)
	{
		for (int col=0;col<n[row].length;col++)
		{
			System.out.println(n[row][col]);
		}
	}
	
	
}
}
