import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class sd {

	public JMenuBar cb()
	{
		JMenuBar mb= new JMenuBar();
		mb.setLayout(new BoxLayout(mb,BoxLayout.PAGE_AXIS));
		mb.add(cm("ONE"));
		mb.add(cm("TWO"));
		mb.add(cm("THREE"));
		mb.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.blue));
		return mb;
		
	}
	
	public JMenu cm(String title)
	{
		JMenu m= new JMenu(title);
		m.add("Menu item 1 in "+ title);
		m.add("Menu item 2 in "+ title);
		m.add("Menu item 3 in "+ title);
		
		JMenu submenu= new JMenu("Submenu");
		submenu.add("submenu item #1");
		submenu.add("submenu item #2");
		m.add(submenu);
		return m;
		
	}
	
	public static void main(String[] args) {
		JFrame f= new JFrame();
		sd ob= new sd();
		Container c = f.getContentPane();
		c.setBackground(Color.white);
		c.add(ob.cb(),BorderLayout.LINE_START);
		f.setSize(300,200);
		f.setVisible(true);
	}
}

