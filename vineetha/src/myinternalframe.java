import javax.swing.JInternalFrame;

public class myinternalframe  extends JInternalFrame{
	static int count=0;
	static int x=30,y=30;
	public myinternalframe()
	{
		super("Dcoument#"+(++count),true,true,true,true);
		
		
		
		// resizable,closable.maximisable,icon
		setSize(300,300);
		setLocation(x*count,y*count);
	}

}
