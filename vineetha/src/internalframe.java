import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class internalframe extends JFrame implements ActionListener {
	JDesktopPane desktop;
	public internalframe() throws PropertyVetoException
	{
		super("INTERNALFRAME");
		//making the big window
		int inset=100;
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(inset,inset,screensize.width-inset*2,screensize.height-inset*2);
		
		 desktop= new JDesktopPane();
		 createframe();
		 setContentPane(desktop);
		 setJMenuBar(createmenubar());
		 desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
	}
	
	public JMenuBar createmenubar()
	{
		JMenuBar menubar= new JMenuBar();
		
		JMenu menu= new JMenu("document");
		menu.setMnemonic(KeyEvent.VK_D);
		menubar.add(menu);
		
		JMenuItem menuitem=new JMenuItem("New");
		menuitem.setMnemonic(KeyEvent.VK_N);
		menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
		menuitem.setActionCommand("new");
		menuitem.addActionListener(this);
		menu.add(menuitem);
		
		JMenuItem menuitem1=new JMenuItem("Quit");
		menuitem1.setMnemonic(KeyEvent.VK_Q);
		menuitem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.ALT_MASK));
		menuitem1.setActionCommand("quit");
		menuitem1.addActionListener(this);
		menu.add(menuitem1);
		return menubar;
		
	}

	
	public void createframe() throws PropertyVetoException 
	{
		myinternalframe f= new myinternalframe();
		
		f.setVisible(true);
		desktop.add(f);
		f.setSelected(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("new".equals(e.getActionCommand()))
		{
			try {
				createframe();
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else
		{
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) throws PropertyVetoException {
		
		
		internalframe ob = new internalframe();
		ob.setVisible(true);
	}

}
