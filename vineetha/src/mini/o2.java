package mini;

public class o2 {
public static void main(String[] args) {
	System.out.println("otp= "+ otp());
}

public static String otp()
{
	// 4   =
	//3
	int r=(int)(Math.random()*10)+10;
	String otp=String.valueOf(r);
	return otp;
}
}
