import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class listdialog  extends JDialog implements ActionListener{
static listdialog dialog;
static String value="";
public JList list;
	public static String showdialog(Component framecomp,Component locationcomp, String labeltext,String title,String []possiblevalues,
			String initialvalue,String longvalue)
	{
		Frame frame = JOptionPane.getFrameForComponent(framecomp);
		 dialog= new listdialog(frame,locationcomp,labeltext,title,possiblevalues,initialvalue,longvalue);
		 dialog.setVisible(true);
		 return value;
	}
	
	
   public void setvalue(String newvalue)
   {
	   value=newvalue;
	   list.setSelectedValue(value, true);
   }
   
   public listdialog(Frame frame,Component locationcomp,String labeltext,String title,Object[] data, String initialvalue,String longvalue)
	{
	   super(frame,title,true);
	   JButton cancel=new JButton("Cancel");
	   cancel.addActionListener(this);
	   
	   JButton set=new JButton("Set");
	   set.setActionCommand("Set");
	   set.addActionListener(this);
	   getRootPane().setDefaultButton(set);
	   
	   list=new JList(data)
			   {
		   public int getScrollableUnitIncrement(Rectangle visiblerect, int orientation, int direction)
		   {
			   
			   int row;
			   if(orientation==SwingConstants.VERTICAL && direction <0 && (row=getFirstVisibleIndex())!=-1)
			   {
				   Rectangle r=getCellBounds(row,row);
				   if((r.y==visiblerect.y) && row!=0)
				   {
					   Point loc=r.getLocation();
					   loc.y--;
					   int previndex=locationToIndex(loc);
					   Rectangle prevR=getCellBounds(previndex,previndex);
					   
					   if(prevR==null || prevR.y>=r.y)
					   {
						   return 0;
					   }
					   return prevR.height;
					   
				   }
			   }
			   return super.getScrollableUnitIncrement(visiblerect, orientation, direction);
		   }
			   };
			   list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			   if(longvalue!=null)
			   {
				   list.setPrototypeCellValue(longvalue);
				   
			   }
			   list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
			   list.setVisibleRowCount(-1);
			   list.addMouseListener(new MouseAdapter()
					   {
				   public void mouseClicked(MouseEvent e)
				   {
					   if(e.getClickCount()==2)
					   {
						   set.doClick();
					   }
					   
				   }
				   
					   });
			   
			   JScrollPane listscroller= new JScrollPane(list);
			   listscroller.setPreferredSize(new Dimension(250,85));
			   listscroller.setAlignmentX(LEFT_ALIGNMENT);
			   
			   JPanel listpane= new JPanel();
			   listpane.setLayout(new BoxLayout(listpane,BoxLayout.PAGE_AXIS));
			   JLabel label= new JLabel(labeltext);
			   label.setLabelFor(list);
			   listpane.add(label);
			   listpane.add(Box.createRigidArea(new Dimension(0,5)));
			   listpane.add(listscroller);
			   listpane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
			   
			   JPanel buttonpanel= new JPanel();
			   buttonpanel.setLayout(new BoxLayout(buttonpanel,BoxLayout.LINE_AXIS));
			   buttonpanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
			   buttonpanel.add(Box.createHorizontalGlue());
			   buttonpanel.add(cancel);
			   buttonpanel.add(Box.createRigidArea(new Dimension(10,0)));
			   buttonpanel.add(set);
			   
			 Container contentpane= getContentPane();
			 contentpane.add(listpane,BorderLayout.CENTER);
			 contentpane.add(buttonpanel,BorderLayout.PAGE_END);
			 setvalue(initialvalue);
			 pack();
			 setLocationRelativeTo(locationcomp);
			   
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Set".equals(e.getActionCommand()))
		{
			listdialog.value=(String)list.getSelectedValue();
		}
		listdialog.dialog.setVisible(false);
		
	}

}
