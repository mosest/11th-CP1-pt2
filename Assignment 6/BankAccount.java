//Tara Moses
//Class for Assignment 6.2: BankAccount
//August 14, 2013

public class BankAccount
{
	double amount;
	
	public BankAccount(double amount)
	{
		this.amount=amount;
	}
	 
	public void deposit(double amountToGive)
	{
		 if (amountToGive>=0) amount=amount+amountToGive;
		 else amount=amount-amountToGive;
	}
	
	public void withdraw(double amountToTake)
	{
		if (amount>=amountToTake) amount=amount-amountToTake;
		else amount=0;
	}
}
