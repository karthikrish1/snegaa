import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

public class dynamictreed extends JPanel implements ActionListener{
   int newnodesuffix=1;
	dynamictree treep;
	public dynamictreed()
	{
		super(new BorderLayout());
		treep = new dynamictree();
		populatetree(treep);
		
		JButton addb= new JButton("Add");
		addb.setActionCommand("add");
		addb.addActionListener(this);
		
		JButton removeb= new JButton("Remove");
		removeb.setActionCommand("remove");
		removeb.addActionListener(this);
		
		JButton clearb= new JButton("Clear");
		clearb.setActionCommand("clear");
		clearb.addActionListener(this);
		
		treep.setPreferredSize(new Dimension(300,200));
		add(treep,BorderLayout.CENTER);
		
		JPanel p= new JPanel(new GridLayout(0,3));
		p.add(addb);
		p.add(removeb);
		p.add(clearb);
		add(p,BorderLayout.SOUTH);
	}
	
	
	public void populatetree(dynamictree treepanel)
	{
		String p1= new String("parent1");
		String p2= new String("parent2");
		String c1= new String("child1");
		String c2= new String("child2");
		
		DefaultMutableTreeNode n1,n2;
		
		// adding 
		n1=treepanel.addObject(p1);
	    n2=treepanel.addObject(p2);
		
	    // adding child to the parent
		treepanel.addObject(n1,c1,true);
		treepanel.addObject(n1,c2,true);
		
		treepanel.addObject(n2,c1,true);
		treepanel.addObject(n2,c2,true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command=e.getActionCommand();
		if("add".equals(command))
		{
			treep.addObject("New  Node "+ newnodesuffix++);
		}
		
		else if("remove".equals(command))
		{
			treep.removecurrentnode();
		}
		
		else if("clear".equals(command))
		{
			treep.clear();
		}
		
	}
	
public static void main(String[] args) {
		
		JFrame j= new JFrame();
		j.add(new dynamictreed());
		
		j.pack();
		j.setVisible(true);
	}

}
