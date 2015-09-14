//Tara Moses
//Assignment 5.3: Investment
//July 19, 2013

import java.util.Scanner;

public class Investment
{
	//method calculates the future value of an investment
	public static double calculate(double initial, double rate, int years)
	{
		return initial*Math.pow(1+rate,years);
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----5.3: INVESTMENT-----\n");
		System.out.print("How much, in $USD, would you like to invest? ");
		double initial=scan.nextDouble();
		System.out.print("For how many years? ");
		int years=scan.nextInt();
		System.out.print("What is the investment rate (please enter as a decimal)? ");
		double rate=scan.nextDouble();
		
		double futureValue=calculate(initial,rate,years);
		
		System.out.printf("\nIn "+years+" years, you will have $%.2f.\n\n",futureValue);
	}
}
