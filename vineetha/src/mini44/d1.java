package mini44;

import java.awt.AWTEvent;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.plaf.LayerUI;

public class d1 {
public static void main(String[] args) {
	
	JFrame f= new JFrame("designing");	
	LayerUI<JPanel>layer=new Blurlayer();
	JPanel panel=createpanel();
	JLayer<JPanel>jlayer= new JLayer<JPanel>( panel,layer);
	f.add(jlayer);
	f.setSize(300,200);
	f.setVisible(true);
	
}

public static JPanel createpanel()
{
	JPanel p= new JPanel();
	
	ButtonGroup g= new ButtonGroup();
	JRadioButton radiobutton;
	
	p.add(radiobutton=new JRadioButton("chicken",true));
	g.add(radiobutton);
	
	p.add(radiobutton=new JRadioButton("fish"));
	g.add(radiobutton);
	
	p.add(radiobutton=new JRadioButton("vegetables"));
	g.add(radiobutton);
	
	p.add(new JCheckBox("sauces"));
	p.add(new JCheckBox("pickles"));
	p.add(new JCheckBox("jam"));
	
	p.add(new JLabel("any special items"));
	p.add(new JTextField(25));
	
	JButton b= new JButton("place order");
	p.add(b);
	
	return p;
	}
}

class Blurlayer extends LayerUI<JPanel>
{
	BufferedImageOp moperation;
	BufferedImage moffscreenimage;
	
	public Blurlayer()
	{
		float ninth=1.0f/9.0f;
		float[] blur= {
			ninth,ninth,ninth,
			ninth,ninth,ninth,
			ninth,ninth,ninth,
		};
		moperation= new ConvolveOp(new Kernel(3,3,blur),ConvolveOp.EDGE_NO_OP,null);
	}
	

	
	public void paint(Graphics g,JComponent c)
	{
		int w=c.getWidth();
		int h=c.getHeight();
		
		if(w==0 || h==0)
		{
			return;
		}
		// image is of wrong size
		if(moffscreenimage==null|| moffscreenimage.getWidth()!=w || moffscreenimage.getHeight()!=h)
		{
			moffscreenimage=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		}
		
		Graphics2D ig2=moffscreenimage.createGraphics();
		ig2.setClip(g.getClip());
		super.paint(ig2, c);
		ig2.dispose();
		Graphics2D g2=(Graphics2D)g;
		g2.drawImage(moffscreenimage, moperation, 0, 0);
	
	}
	
	
}
