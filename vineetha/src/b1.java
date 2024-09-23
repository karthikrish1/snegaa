import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class b1  extends JPanel implements ActionListener{

	JButton b1,b2,b3;
	public static void main(String[] args) {
		
		JFrame j= new JFrame();
		b1 ob= new b1();
		j.setContentPane(ob);
		j.pack();
		j.setVisible(true);
	}
	
	
	public b1()
	{
		ImageIcon leftb = createImageIcon("left.gif");
		ImageIcon rightb = createImageIcon("right.gif");
		ImageIcon middleb = createImageIcon("middle.gif");
	    
		b1= new JButton("disable middle button",leftb);
	    b1.setVerticalTextPosition(AbstractButton.CENTER);
	    b1.setHorizontalTextPosition(AbstractButton.LEADING);
	    b1.setMnemonic(KeyEvent.VK_D);//ALT+D
	    b1.setActionCommand("disable");
	    
		b2= new JButton(" middle button",middleb);
	    b2.setVerticalTextPosition(AbstractButton.BOTTOM);
	    b2.setHorizontalTextPosition(AbstractButton.CENTER);
	    b2.setMnemonic(KeyEvent.VK_M);//aLT+M
	   
	    b3= new JButton(" enable middle button",rightb);
	    b3.setVerticalTextPosition(AbstractButton.CENTER);
	    b3.setHorizontalTextPosition(AbstractButton.RIGHT);
	    b3.setMnemonic(KeyEvent.VK_E);//ALT+e
	    b3.setActionCommand("enable");
	    b3.setEnabled(false);
	    
	    b1.addActionListener(this);
	    b3.addActionListener(this);
	    
	    b1.setToolTipText("click this to disable middle button");
	    b3.setToolTipText("click this to enable middle button");
	    add(b1);
	    add(b2);
	    add(b3);
	}
	

	public static ImageIcon createImageIcon( String path)
	{URL im = b1.class.getResource(path);
		if(im!=null) {
			return new ImageIcon(im);
		}
		else
		{
System.out.println("file notfount "+ path);
return null;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if("disable".equals(e.getActionCommand()))
		{
			b2.setEnabled(false);
			b1.setEnabled(false);
			b3.setEnabled(true);
			
		}
		else
		{
			b2.setEnabled(true);
			b1.setEnabled(true);
			b3.setEnabled(false);
			
		}
		
	}
}
