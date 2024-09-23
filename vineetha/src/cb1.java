import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cb1  extends JPanel implements ActionListener{

	String currentpattern;
	JLabel result;
	
	public cb1()
	{
		setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
		String p[]= {
				"dd MMMM yyyy",
				"dd.MM.yy",
				"MM/dd/yy",
				"yyyy.MM.dd G 'at' hh:mm:ss z",
				"EEE,MMM d,''yy",
				"h:mm a",
				"H:mm:ss:SSS",
				"K:mm a,z",
				"yyyy.MMMM.dd.GGG hh:mm aaa"};
		
		currentpattern=p[0];
		
		JLabel pl1= new JLabel("Enter the pattern string");

		JLabel pl2= new JLabel("select one from the list");
		
		JComboBox pl= new JComboBox(p);
		pl.setEditable(true);
		pl.addActionListener(this);
		
		JLabel resultl=new JLabel("current date or time ",JLabel.LEADING);
		 result = new JLabel(" ");
		result.setBackground(Color.BLUE);
		
		//result.setBorder(BorderFactory.createC);
		JPanel n= new JPanel();
		n.setLayout(new BoxLayout(n,BoxLayout.PAGE_AXIS));
		n.add(pl1);
		n.add(pl2);
		pl.setAlignmentX(Component.LEFT_ALIGNMENT);
		n.add(pl);
		
		//result
		JPanel rn= new JPanel(new GridLayout(0,10));
		rn.add(resultl);
		rn.add(result);
		
		n.setAlignmentX(Component.LEFT_ALIGNMENT);
		rn.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		add(n);
		add(rn);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb=(JComboBox)e.getSource();
		String selected=(String)cb.getSelectedItem();
		currentpattern=selected;
		f();
		
	}
	//dd:MM>>YY

	public void f()
	{
		Date today= new Date();
		SimpleDateFormat f= new SimpleDateFormat(currentpattern);
		String ds = f.format(today);
		result.setText(ds);
	}
	
	public static void main(String[] args) {
		
		JFrame f= new JFrame();	
		cb1 ob = new cb1();
		f.setContentPane(ob);
		f.pack();
		f.setVisible(true);
	}
	
}
