package mini;

import java.util.Scanner;

public class am {
public static void main(String[] args) {
	int balance=4000;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the withdraw money");
	int withdrawamount=s.nextInt();
	
	System.out.println("Enter the deposit money");
	int depositamount=s.nextInt();
	display(balance);
	
	
	if(withdrawamount>0)
	{
		balance=amountwithdrawing(balance,withdrawamount);
		
	}
	
	else if(depositamount>0)
	{
		balance=amountdepositing(balance,depositamount);
	}
}

// withdraw
public static int amountwithdrawing(int balance, int withdrawamount)
{
	System.out.println("withdraw action ");
	System.out.println("wthdrawing money : "+ withdrawamount);
	if(balance>=withdrawamount)
	{
		balance=balance-withdrawamount;
		System.out.println("collect ur money and the card");
		display(balance);
		
	}
	else
	{
		System.out.println("insufficient balance");
		System.out.println();
	}
	return balance;
	}
//deposit
public static int amountdepositing(int balance, int depositamount)
{
	System.out.println("deposit action ");
	System.out.println("depositing money : "+ depositamount);
	
		balance=balance+depositamount;
		System.out.println("amount deposited");
		display(balance);
	
	return balance;
	}

public static void display(int balance)
{
	System.out.println("current balance : "+ balance);
	System.out.println();
	}

}

