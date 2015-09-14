//Tara Moses
//Assignment 2.4: BMI Calculator
//June 18, 2013

import java.util.Scanner;

public class BMI
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String warning="";
		
		System.out.println("-----2.4: BMI CALCULATOR-----");
		System.out.print("Name: ");
		String name=scan.nextLine();
		System.out.print("Feet part of your height: ");
		int feetHeight=scan.nextInt();
		System.out.print("Inch part of your height: ");
		int inchHeight=scan.nextInt();
		System.out.print("Weight in pounds: ");
		int weight=scan.nextInt();
		
		double bmi=(weight*703.0)/((feetHeight*12.0+inchHeight)*(feetHeight*12.0+inchHeight));
		
		if (bmi<18.5)
		{
			warning="You're underweight.";
		}
		else if (bmi>=18.5 && bmi<25)
		{
			warning="You're healthy.";
		}
		else if (bmi>=25 && bmi<30)
		{
			warning="You're overweight.";
		}
		else if (bmi>=30)
		{
			warning="You're obese.";
		}
		else
		{
			warning="Have a good day.";
		}
		
		System.out.println("\n"+name+", your BMI is "+bmi+". "+warning+"\n");
	}
}
