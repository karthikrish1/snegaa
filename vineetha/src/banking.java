

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class banking extends JPanel implements PropertyChangeListener {

	JLabel pl,al,rl,payl;
	double amount=200000;
	double rate=0.08;
	int numberof=30;
	JFormattedTextField amountfield,ratefield,numberfield,paymentfield;
	NumberFormat amountdisplayformat,amounteditformat,percentdisplayformat, percenteditformat,paymentformat;
	
	public banking()
	{
		setup();
		double payment=compute(amount,rate,numberof);
		 al= new JLabel("Loan amount");
		 rl= new JLabel("%");
		 pl= new JLabel("years");
		payl= new JLabel("monthly pay");
		 amountfield= new JFormattedTextField(
				new DefaultFormatterFactory(new NumberFormatter(amountdisplayformat),
						new NumberFormatter(amounteditformat)));
		 amountfield.setValue(amount);
		 amountfield.setColumns(10);
		 amountfield.addPropertyChangeListener("value",this);
		
		 NumberFormatter percenteditformatter=new NumberFormatter(percenteditformat)
		 {
			 public String ValueToString(Object o) throws ParseException
			 {
				 Number number=(Number)o;
				 if(number!=null)
				 {
					 double d=number.doubleValue()*100.0;
					 number= new Double(d);
					 
				 }
				 
				 return super.valueToString(number);
			 }
			 
			 
			 public Object StringToValue(String s) throws ParseException
			 {
				 Number number=(Number)super.stringToValue(s);
				 if(number!=null)
				 {
					 double d=number.doubleValue()/100.0;
					 number= new Double(d);
					 
				 }
				 return number;
			 }
		 };
		
		 ratefield=new JFormattedTextField(new DefaultFormatterFactory(
				 new NumberFormatter(percentdisplayformat),
				 new NumberFormatter(percentdisplayformat),percenteditformatter
				 ) {});
		
		ratefield.setValue(new Double(rate));
		ratefield.setColumns(10);
		ratefield.addPropertyChangeListener("value",this);
		
		numberfield= new JFormattedTextField();
		numberfield.setValue(new Integer(numberof));
		numberfield.setColumns(10);
		numberfield.addPropertyChangeListener("value",this);
		
		paymentfield= new JFormattedTextField(paymentformat);
		paymentfield.setValue(new Double(payment));
		paymentfield.setColumns(10);
		paymentfield.setEditable(false);
		paymentfield.setBackground(Color.blue);
		
		al.setLabelFor(amountfield);
		rl.setLabelFor(ratefield);
		pl.setLabelFor(numberfield);
		payl.setLabelFor(paymentfield);
		
		
		JPanel p= new JPanel(new GridLayout(0,1));
		p.add(al);
		p.add(rl);
		p.add(pl);
		p.add(payl);
		
		JPanel pt= new JPanel(new GridLayout(0,1));
		pt.add(amountfield);
		pt.add(ratefield);
		pt.add(numberfield);
		pt.add(paymentfield);
		// label: left
		// fields on right
		
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		add(p,BorderLayout.CENTER);
		add(pt,BorderLayout.LINE_END);
	
		
	}
	
	public double compute(double amount, double rate, int n)
	{
		double I,partial,denominator,answer;
		n*=12;
		if(rate>0.001)
		{
			I=rate/12.0;  // one month interest
			partial=Math.pow(1+I, (0.0-n));
			denominator=(1-partial)/I;
		}
		else
		{
			denominator=n;
		}
		answer=(1*amount)/denominator;
		return answer;
		
		
	}
	
	public void setup()
	{
		amountdisplayformat=NumberFormat.getCurrencyInstance();
		amountdisplayformat.setMaximumFractionDigits(0);
		amounteditformat=NumberFormat.getNumberInstance();
		percentdisplayformat=NumberFormat.getPercentInstance();
		percentdisplayformat.setMaximumFractionDigits(2);
		percenteditformat=NumberFormat.getNumberInstance();
		percenteditformat.setMaximumFractionDigits(2);
		paymentformat=NumberFormat.getCurrencyInstance();
	}
	
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
		Object source = evt.getSource();
		if(source==amountfield)
		{
			amount=((Number)amountfield.getValue()).doubleValue();
		}
		
		else if(source==ratefield)
		{
			rate=((Number)ratefield.getValue()).doubleValue();
		}
		
		else if(source==numberfield)
		{
			numberof=((Number)numberfield.getValue()).intValue();
			
		}
		
		double payment = compute(amount,rate,numberof);
		paymentfield.setValue(new Double(payment));
	}

	
public static void main(String[] args) {
		
		JFrame j= new JFrame();
		j.add(new banking());
		
		j.pack();
		j.setVisible(true);
	}
	
	
}
