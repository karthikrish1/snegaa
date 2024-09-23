import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class fc2 extends JPanel implements ActionListener {

	JTextArea l;
	 JFileChooser jf;
	 JButton open,save;
	public fc2()
	{
		super(new BorderLayout());
		 l= new JTextArea(5,20);
		 l.setMargin(new Insets(5,5,5,5));
		 l.setEditable(false);
		 JScrollPane js= new JScrollPane(l);
		 jf=new JFileChooser();
		 open=new JButton("open file");
		 open.addActionListener(this);
		  save=new JButton("save file");
		  save.addActionListener(this);
		  
		  JPanel bp=new JPanel();
		  bp.add(open);
		  bp.add(save);
		  
		  add(bp,BorderLayout.PAGE_START);
		  add(js,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==open)
		{
			int returnvalue=jf.showOpenDialog(fc2.this);
			if(returnvalue==JFileChooser.APPROVE_OPTION)
			{
				File f=jf.getSelectedFile();
				l.append("Opening : "+ f.getName()+"\n");
			}
			else
			{
				l.append("open command cancelled by the user" +"\n" );
				
			}
			l.setCaretPosition(l.getDocument().getLength());
			
		}
		
		else if(e.getSource()==save)
		{
			int returnvalue=jf.showSaveDialog(fc2.this);
			if(returnvalue==JFileChooser.APPROVE_OPTION)
			{
			File f=	jf.getSelectedFile();
			l.append("saving the file" + f.getName()+ "\n");
			}
			else
			{
				l.append("save command cancelled by the user" +"\n" );
			}
			
			l.setCaretPosition(l.getDocument().getLength());
		}
		
	}
	
	public static void main(String[] args) {
		JFrame f= new JFrame();
		fc2 ob = new fc2();
		f.setContentPane(ob);
		f.setSize(300,200);
		f.pack();
		f.setVisible(true);
	}
}
