package mini44;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;


public class inputverification extends JPanel {

	//defaul
	static double defaultamount=100000.0;
	static double defaultrate=6.0;
	static int defaultperiod=20;
	
	//labels 
	public JLabel amountlabel;
	public JLabel ratelabel;
	public JLabel numperiodslabel;
	public JLabel paymentlabel;
	
	// string for the lables
	
	static String amountstring="loan amount (30,000-1,00,000)";
	static String ratestring="AP (>=0%)";
	static String numperiodsstring="Year(2-40)";
	static String paymentstring="Montly payment:";
	
	//textfield for entering data
	
JTextField amountfield;
JTextField ratefield;
JTextField numperiodsfield;
JTextField paymentfield;

//Formats to format values

private NumberFormat moneyformat;
private NumberFormat percentformat;
private DecimalFormat decimalformat;
private DecimalFormat paymentformat;
private NumberFormat integerformat;

//userdefined class
myverifier verifier= new myverifier();

//constructor
public inputverification()
{
	super(new BorderLayout());
	  setUpFormats();//calling for setting the formats 
	double payment=computepayment(defaultamount,defaultrate,defaultperiod);
	
	amountlabel=new JLabel(amountstring);
	ratelabel= new JLabel(ratestring);
	numperiodslabel= new JLabel(numperiodsstring);
	paymentlabel=new JLabel(paymentstring);
	
	//textfields
	amountfield= new JTextField(moneyformat.format(defaultamount),10);
	amountfield.setInputVerifier(verifier);
	
	ratefield= new JTextField(percentformat.format(defaultrate),10);
	ratefield.setInputVerifier(verifier);
	
	numperiodsfield= new JTextField(decimalformat.format(defaultperiod),10);
	numperiodsfield.setInputVerifier(verifier);
	
	paymentfield= new JTextField(paymentformat.format(payment),10);
    paymentfield.setInputVerifier(verifier);
    
   paymentfield.setFocusable(false);
   paymentfield.setForeground(Color.GREEN);
   
  amountfield.addActionListener(verifier);
  ratefield.addActionListener(verifier);
  numperiodsfield.addActionListener(verifier);
  
  amountlabel.setLabelFor(amountfield);
  ratelabel.setLabelFor(ratefield);
  numperiodslabel.setLabelFor(numperiodsfield);
  paymentlabel.setLabelFor(paymentfield);
  
  //labelpanel
  
  JPanel labelpane= new JPanel(new GridLayout(0,1));
  labelpane.add(amountlabel);
  labelpane.add(ratelabel);
  labelpane.add(numperiodslabel);
  labelpane.add(paymentlabel);
  
  
  //field
  JPanel fieldpane= new JPanel(new GridLayout(0,1));
  fieldpane.add(amountfield);
  fieldpane.add(ratefield);
  fieldpane.add(numperiodsfield);
  fieldpane.add(paymentfield);
  
  setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
  add(labelpane,BorderLayout.CENTER);
  add(fieldpane,BorderLayout.LINE_END);
	}
	
class myverifier extends InputVerifier implements ActionListener{

	double minamount=30000.0;
	double maxamount=100000.0;
	double minrate=0.0;
	int minperiod=2;
	int maxperiod=40;
	String message=null;
	
	public boolean shouldYieldFocus(JComponent input)
	{
		boolean inputok=verify(input);
		try {
			makeitpretty(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			updatepayment();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(inputok)
		{
			return true;
		}
		
		// message box
		message+=".\nPlease try again:";
		JOptionPane.showMessageDialog(null, message,"Invalid value",JOptionPane.WARNING_MESSAGE);
		//reintsll the verifier
		input.setInputVerifier(this);
		Toolkit.getDefaultToolkit().beep();
		return false;
	}
	
	public void updatepayment() 
	{
		double amount=defaultamount;
		double rate=defaultrate;
		int numperiods=defaultperiod;
		double payment=0.0;
		
		try {
			amount=moneyformat.parse(amountfield.getText()).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rate=percentformat.parse(ratefield.getText()).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			numperiods=decimalformat.parse(numperiodsfield.getText()).intValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		payment=computepayment(amount,rate,numperiods);
		paymentfield.setText(paymentformat.format(payment));
		
	}
	
	public boolean verify(JComponent input)
	{
		
			
				return checkfield(input,false);
			
		
		}
	
	
	public void makeitpretty(JComponent input) throws ParseException
	{
		checkfield(input,true);
	}
	
	
	public boolean checkfield(JComponent input, boolean changeit) 
	{
		if(input==amountfield)
		{
			return checkamountfield(changeit);
		}
		
		else if(input==ratefield)
		{
			return checkratefield(changeit);
			
		}
		else if(input==numperiodsfield)
		{
			return checknumperiodsfield(changeit);
			
		}
		else
		{
			return true;
		}
		
		
	}
	
	public boolean checkamountfield(boolean change) 
	{
		boolean wasvalid=true;
		double amount=defaultamount;
		
		try {
			amount=moneyformat.parse(amountfield.getText()).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("invalid money format");
			return false;
		}
		
		if((amount<minamount)|| (amount>maxamount))
		{
			wasvalid=false;
			if(amount<minamount)
			{
				message="Loan amount was <"+integerformat.format(minamount);
			}
			else
			{
				message="Loan amount was >"+integerformat.format(maxamount);
			}
		}
		
	if(change)
		{
			amountfield.setText(moneyformat.format(amount));
			amountfield.selectAll();
		}
		
		return wasvalid;
	}
	public boolean checkratefield(boolean change)
	{
		boolean wasvalid=true;
		double rate=defaultrate;
		try {
			rate=percentformat.parse(ratefield.getText()).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		if(rate<minrate)
		{
			wasvalid=false;
			message="Value should be >"+minrate;
		}
		if(change)
		{
			ratefield.setText(percentformat.format(rate));
			ratefield.selectAll();
		}
		return wasvalid;
		
	}
	public boolean checknumperiodsfield(boolean change) 
	{
		boolean wasvalid=true;
		int numperiods=defaultperiod;
		try {
			numperiods=decimalformat.parse(numperiodsfield.getText()).intValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		if(numperiods<minperiod)
		{
			wasvalid=false;
			message="value is <"+ integerformat.format(minperiod);
			}
		else if(numperiods>maxperiod)
		{
			wasvalid=false;
			message="value is >"+ integerformat.format(maxperiod);
		}
		if(change)
		{
			numperiodsfield.setText(decimalformat.format(numperiods));
			numperiodsfield.selectAll();
		}
		return wasvalid;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField source=(JTextField)e.getSource();
		shouldYieldFocus(source);
		source.selectAll();
		
	}

	}

public static void main(String[] args) {
	
	
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UIManager.put("swing.boldMetal", false);
		JFrame f= new JFrame();
		JComponent ob= new inputverification();
		f.setContentPane(ob);
		f.pack();
		f.setVisible(true);
	
}

public double computepayment(double loanAmt,double rate,int numPeriods)
{
	
double I,partial1,denominator,answer;
numPeriods*=12;// 

if(rate>0.01)
{
	I=rate/100.0/12.0;
	partial1=Math.pow((1+I), (0.0-numPeriods));
	denominator=(1-partial1)/I;
	}

else
{
	denominator=numPeriods;
}

answer=(-1*loanAmt)/denominator;
return answer;
}

public void setUpFormats()
{
	moneyformat=NumberFormat.getNumberInstance();
	percentformat=NumberFormat.getNumberInstance();
	percentformat.setMinimumFractionDigits(3);
	
	decimalformat=(DecimalFormat)NumberFormat.getNumberInstance();
	decimalformat.setParseIntegerOnly(true);
	
	paymentformat=(DecimalFormat)NumberFormat.getNumberInstance();
	paymentformat.setMaximumFractionDigits(2);
	paymentformat.setNegativePrefix("(");
	paymentformat.setNegativeSuffix(")");
	integerformat=NumberFormat.getIntegerInstance();


}
}
