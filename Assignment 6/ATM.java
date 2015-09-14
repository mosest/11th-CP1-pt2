//Tara Moses
//Assignment 6.2: ATM
//August 14, 2013

import java.util.Scanner;

public class ATM
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);			//i'm gonna pop some tags
		BankAccount myAccount=new BankAccount(20);		//only got $20 in my pocket
		
		System.out.println("-----6.2: ATM-----\n");
		
		while (true)
		{
			System.out.print("Would you like to (1) deposit or (2) withdraw money, or (3) end? ");
			int choice=scan.nextInt();
			
			if (choice==1)
			{
				System.out.print("\namount to deposit>> ");
				double depositAmount=scan.nextDouble();
				myAccount.deposit(depositAmount);
				if (depositAmount<0) depositAmount=-1*depositAmount;
				System.out.printf("$%1.2f",depositAmount);
				System.out.print(" deposited. Account balance: $");
				System.out.printf("%.2f\n\n",myAccount.amount);
			}
			else if (choice==2)
			{
				System.out.print("\namount to withdraw>> ");
				double withdrawAmount=scan.nextDouble();
				double previousAmount=myAccount.amount;
				myAccount.withdraw(withdrawAmount);
				if (withdrawAmount>myAccount.amount) withdrawAmount=previousAmount;
				System.out.printf("$%1.2f",withdrawAmount);
				System.out.print(" withdrawn. Account balance: $");
				System.out.printf("%.2f\n\n",myAccount.amount);
			}
			else
			{
				System.out.println("Goodbye.\n");
				break;
			}
		}
	}
}
