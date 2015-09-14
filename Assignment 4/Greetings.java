//Tara Moses
//Assignment 4.1: Greetings
//June 24, 2013

import java.util.Scanner;

public class Greetings
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);		
		String newName="";
		String firstLetter1="";
		String restOfName1="";
		String firstLetter2="";
		String restOfName2="";
		String firstName="";
		String secondName="";
		
		System.out.println("-----4.1: GREETINGS-----\n");
		System.out.print("What is your name? ");
		String name=scan.nextLine();
		
		if (name.contains(" "))
		{
			int indexOfSpace=name.indexOf(" ");
			firstName=name.substring(0,indexOfSpace);
			secondName=name.substring(indexOfSpace+1,name.length());
			
			firstLetter1=firstName.substring(0,1);
			restOfName1=firstName.substring(1,firstName.length());
			firstLetter2=secondName.substring(0,1);
			restOfName2=secondName.substring(1,secondName.length());
			
			firstLetter1=firstLetter1.toUpperCase();
			restOfName1=restOfName1.toLowerCase();
			firstLetter2=firstLetter2.toUpperCase();
			restOfName2=restOfName2.toLowerCase();
			
			newName=firstLetter1+restOfName1+" "+firstLetter2+restOfName2;
		}
		else
		{
			firstLetter1=name.substring(0,1);
			restOfName1=name.substring(1,name.length());
			
			firstLetter1=firstLetter1.toUpperCase();
			restOfName1=restOfName1.toLowerCase();
			newName=firstLetter1+restOfName1;
		}

		System.out.println(newName+", it's nice to meet you.");
	}
}
