//Tara Moses
//Assignment 6.1: Bulletproof Calculator
//August 13, 2013

import java.util.Scanner;

public class Calculator
{
	public static int findOp(String str, String operators)
	{
		for (int i=0;i<str.length();i++)
		{
			if (operators.contains(str.substring(i,i+1))) return i;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String allOps="+-/*^";
		String op="";
		String[] nums=new String[2];
		int firstNum=0;
		int secondNum=0;
		
		System.out.println("-----6.1: BULLETPROOF CALCULATOR-----\n");
		System.out.println("Please input only positive integers.\n");
		
		while (true)
		{
			System.out.print("expression>>  ");
			String userInput=scan.nextLine();
			
			int opIndex=findOp(userInput,allOps);
			
			try
			{
				op=userInput.substring(opIndex,opIndex+1);
				nums=userInput.split("\\"+op);
			}
			catch (Exception e)
			{
				System.out.println("ERROR: No operator. Try again.\n");
				continue;
			}
			
			try
			{
				firstNum=Integer.parseInt(nums[0]);
			}
			catch (Exception e)
			{
				System.out.println("ERROR: "+nums[0]+" is not a number. Try again.\n");
				continue;
			}
			
			try
			{
				secondNum=Integer.parseInt(nums[1]);
				break;
			}
			catch (Exception e)
			{
				System.out.println("ERROR: "+nums[1]+" is not a number. Try again.\n");
				continue;
			}
		}
		
		System.out.print("\n"+firstNum+op+secondNum+"=");
		
		int sum=firstNum+secondNum;
		
		if (op.equals("+")) System.out.println(sum);
		else if (op.equals("-")) System.out.println(firstNum-secondNum);
		else if (op.equals("/")) System.out.println(firstNum*1.0/secondNum);
		else if (op.equals("*")) System.out.println(firstNum*secondNum);		
		else System.out.println(Math.pow(firstNum,secondNum));
		
		System.out.println();
	}
}
