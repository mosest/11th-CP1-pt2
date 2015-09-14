//Tara Moses
//Assignment 5.1: Is It a Palindrome?
//July 11, 2013

import java.util.Scanner;
import java.io.File;

public class Palindrome
{
	//tests whether a string is the same forwards and backwards.
	//also it ignores punctuation, so 
	//"Straw? No, too stupid a fad. I put soot on warts."
	//is a palindrome too :D
	public static boolean isPalindrome(String str)
	{
		String forwardStr="";
		String backwardStr="";
		String alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i=0;i<str.length();i++)
		{
			String currentChar=str.substring(i,i+1);
			if (alphabet.contains(currentChar)) forwardStr+=currentChar;
		}
		
		for (int i=0;i<forwardStr.length();i++)
		{
			backwardStr+=forwardStr.substring(forwardStr.length()-i-1,forwardStr.length()-i);
		}
		
		if (forwardStr.equalsIgnoreCase(backwardStr)) return true;
		else return false;
	}
	
	public static void main(String[] args) throws Exception
	{	
		Scanner scan=new Scanner(System.in);
		int palindromeCount=0;
		int wordCount=0;
		
		System.out.println("-----5.1: PALINDROME-----\n");
		System.out.println("Now scanning through dictionary.txt...\n");
		
		Thread.sleep(1000);
		
		Scanner filescan=new Scanner(new File("dictionary.txt"));
		
		while (filescan.hasNext())
		{
			String str=filescan.nextLine();
			if (isPalindrome(str))
			{
				System.out.println(str+" is a palindrome.");
				palindromeCount++;
			}
			wordCount++;
		}
		System.out.println("\n"+palindromeCount+" palindromes found out of "+wordCount+" total words");
		double percentPals=palindromeCount*1.0/wordCount*100;
		System.out.printf("%1.2f",percentPals);
		System.out.println("% of the words in this file were palindromes.\n");
	}
}
