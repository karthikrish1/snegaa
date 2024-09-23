package Filew;

import java.io.File;

public class rs {
	public static void main(String[] args) {
		File f2 = new File("C:\\Users\\hp\\eclipse-workspace\\vineetha\\src\\Filew\\dhivya.txt");
		
		
		/*System.out.println(f2.getClass());
		System.out.println(f2.exists());
		System.out.println(f2.canExecute());
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		System.out.println(f2.isFile());
		System.out.println(f2.isHidden());
		*/
		
		//f2.setReadOnly();
		//System.out.println(f2.canWrite());
		if(f2.exists()) {
			f2.delete();
			System.out.println("file deleted");
		}
		else
		{
			System.out.println("no such file exists");
		}
		
	}

}
