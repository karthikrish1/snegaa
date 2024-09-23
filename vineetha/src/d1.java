import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class d1 extends JPanel implements MouseListener {
	Dimension area;
	Vector<Rectangle> circles;
	Color colors[]= {Color.RED,Color.blue,Color.GREEN,Color.orange,Color.CYAN,Color.MAGENTA,Color.DARK_GRAY,Color.YELLOW};
	int color_n=colors.length;
	DrawingPane dp;
	public d1()
	{
		super(new BorderLayout());
		 area= new Dimension(0,0);
		 // draw some graphics
		  circles= new Vector<Rectangle>();
		  JLabel leftl= new JLabel("click left mouse button to create  a circle");
		  JLabel rightl= new JLabel("click right mouse button to clear the circle");
		  JPanel insp= new JPanel(new GridLayout(0,1));
		  insp.setFocusable(true);
		  insp.add(leftl);
		  insp.add(rightl);
		   // create the drawing are
		 dp = new DrawingPane();// userdefined class 
		 dp.setBackground(Color.WHITE);
		 dp.addMouseListener(this);
		 
		 JScrollPane s= new JScrollPane(dp);
		 s.setPreferredSize(new Dimension(200,200));
		 
		 add(insp,BorderLayout.PAGE_START);
		  add(s,BorderLayout.CENTER);
		
	}
	
	class DrawingPane extends JPanel{
		public void paintComponent(Graphics g)
		{super.paintComponent(g);
			Rectangle rect;
			for(int i=0;i<circles.size();i++)
			{
				rect=circles.elementAt(i);
				g.setColor(colors[(i%color_n)]);
				g.fillOval(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		int W=100;
		int H=100;
		boolean changed=false;
		if(SwingUtilities.isRightMouseButton(e))
		{
			circles.removeAllElements();
			area.width=0;
			area.height=0;
			changed=true;
		}
		else
		{
			int x=e.getX()-W/2;
			int y=e.getY()-H/2;
			if(x<0)x=0;
			if(y<0)y=0;
			Rectangle rect=new Rectangle(x,y,W,H);
			circles.addElement(rect);
			dp.scrollRectToVisible(rect);
			
			int this_width=(x+W+2);
			if(this_width >area.width);
			{
			area.width=this_width;
			changed=true;
			}
			int this_height=(y+H+2);
			if(this_height >area.height);
			{
			area.height=this_height;
			changed=true;
			}
		}
		
		if(changed)
		{
			dp.setPreferredSize(area);
			dp.revalidate();
		}
		
		dp.repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	
	public static void main(String[] args) {
		JFrame j= new JFrame();
		d1 ob= new d1();
		j.setContentPane(ob);
		j.pack();
		j.setVisible(true);
	}
}
