import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class listdialogrunner {

	static JFrame frame;
	
	static String[] names= {"Ottto","Albino","Milo","Nemo","Oreo","Disco"};
	
	public static JPanel createui()
	{
		JLabel intro= new JLabel("The choosen name: ");
		JLabel name= new JLabel(names[1]);
		intro.setLabelFor(name);
		name.setFont(getafont());
		
		JButton button= new JButton("pick a name");
		button.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						String selectedname=listdialog.showdialog(frame, button, "Baby names ending with o", "name chooser", names, name.getText(), "Albino ");
						name.setText(selectedname);
						
					}});
		
		JPanel panel= new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
		intro.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		name.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		button.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		panel.add(intro);
		panel.add(Box.createVerticalStrut(5));
		panel.add(name);
		
		panel.add(Box.createRigidArea(new Dimension(150,10)));
		panel.add(button);
		return panel;
	}
	
	public static Font getafont()
	{
		String[] desiredfonts= {"French Script","FrenchScript","Script"};
		//getting all installed fonts'
		String[] existing=null;
		String fontname=null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		if(ge!=null)
		{
			existing=ge.getAvailableFontFamilyNames();
		}
		
		if((existing!=null) && desiredfonts!=null)
		{
			int i=0;
			while(fontname==null && i<desiredfonts.length)
			{
				 int j=0;
				 // look for a font that starts with desiredfont[i]
				 while(fontname==null && j<existing.length)
				 {
					 if(existing[j].startsWith(desiredfonts[i]))
					 {
						 Font f= new Font(existing[j],Font.PLAIN,1);
						 if(f.canDisplay('A'))
						 {
							 fontname=existing[j];
							 System.out.println("font is "+ fontname);
						 }
					 }
					 j++;// existing
				 }
				 
				 i++;//desired 
			}
		}
		
		if(fontname!=null)
		{
			return new Font(fontname,Font.PLAIN,35);
		}
		else
		{
			return new Font("Serif",Font.BOLD,35);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		JFrame j= new JFrame("NAMING THE BABY");
		JComponent ob=createui();
		j.setContentPane(ob);
		
		j.pack();
		j.setVisible(true);
	}
	
	
}
