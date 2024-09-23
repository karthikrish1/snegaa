import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class enrollment extends JPanel implements ListSelectionListener {

	DefaultListModel lm;
	 JList list;
	 JButton hb;
	 JButton fb;
	 JTextField employee;
	public enrollment()
	{
	super(new BorderLayout());
	 lm = new DefaultListModel();
	 lm.addElement("dhivya");
	 lm.addElement("vinitha");
	 lm.addElement("java");
	 lm.addElement("python");
	 
	 list = new JList(lm);
	 list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	 list.setSelectedIndex(0);
	 list.addListSelectionListener(this);
	 list.setVisibleRowCount(10);
	 JScrollPane lsp= new JScrollPane(list);
	 
	 hb= new JButton("HIRE");
	HireListener hl= new HireListener(hb);
	hb.setActionCommand("HIRE");
	hb.addActionListener(hl);
	hb.setEnabled(false);
	
	 fb= new JButton("FIRE");
	fb.setActionCommand("FIRE");
	fb.addActionListener(new FireListener());
	
	 employee= new JTextField(12);
	 employee.addActionListener(hl);
	 employee.getDocument().addDocumentListener(hl);
	 String name=lm.getElementAt(list.getSelectedIndex()).toString();
	 
	 //creation of panel
	 
	 JPanel bp=new JPanel();
	 bp.setLayout(new BoxLayout(bp,BoxLayout.LINE_AXIS));
	 bp.add(fb);
	 bp.add(Box.createHorizontalStrut(5));
	 bp.add(new JSeparator(SwingConstants.VERTICAL));
	 bp.add(Box.createHorizontalStrut(5));
	 bp.add(employee);
	 bp.add(hb);
	 bp.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	 
	 add(lsp,BorderLayout.CENTER);
	 add(bp,BorderLayout.PAGE_END);
	}
	
	
	class FireListener implements ActionListener
	{
		
		//valid selection is there 

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int index=list.getSelectedIndex();
			lm.remove(index);
			int size=lm.getSize();
			
			// no element is left, disabling the fire button
			
			if(size==0)
			{
				fb.setEnabled(false);
			}
			else
			{
				if( index==lm.getSize())
						{
					index--;
						}
			
			
			list.setSelectedIndex(index);
			list.ensureIndexIsVisible(index);
		}
		}
		
	}
	
	class HireListener implements ActionListener,DocumentListener{

		
		boolean alreadyenabled=false;
		JButton button;
		
		public HireListener(JButton button)
		{
			this.button=button;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String name=employee.getText();
			
			// user not typing a unique name
			
			if(name.equals("") || alreadyInList(name))
			{
				Toolkit.getDefaultToolkit().beep();
				employee.requestFocusInWindow();
				employee.selectAll();
				return;
			}
			
			int index=list.getSelectedIndex();
			if(index==-1)
			{
				index=0;
			}
			else
			{
				index++;
			}
			
			lm.insertElementAt(employee.getText(), index);
			employee.requestFocusInWindow();
			employee.setText("");
			
			list.setSelectedIndex(index);
			list.ensureIndexIsVisible(index);
			
		}

		
		@Override
		public void insertUpdate(DocumentEvent e) {
			enableButton();
			
		}

		
		@Override
		public void removeUpdate(DocumentEvent e) {
			handleEmptyTexField(e);
			
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			if(!handleEmptyTexField(e))
			{
				enableButton();
			}
			
		}
		
	
	
	
	

		private boolean handleEmptyTexField(DocumentEvent e) {
			if(e.getDocument().getLength()<=0)
			{
				button.setEnabled(false);
				alreadyenabled=false;
				return true;
			}
			
			return false;
		}
		
		private boolean alreadyInList(String name) {
			// TODO Auto-generated method stub
			return lm.contains(name);
		}
	
		private void enableButton() {
			if(!alreadyenabled)
			{
				button.setEnabled(true);
			}
			
		}
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting()==false)
			
			if(list.getSelectedIndex()==-1)
		{
			fb.setEnabled(false);
		}
		else
		{
			fb.setEnabled(true);
		}
		
	}
	public static void main(String[] args) {
		
		JFrame j= new JFrame();
		
		enrollment ob = new enrollment();
		j.setContentPane(ob);
		
		j.pack();
		j.setVisible(true);
	}
}
