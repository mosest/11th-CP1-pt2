//Tara Moses
//Assignment 2.1: Hello, World!
//June 17, 2013

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String greeting="";
		
		System.out.println("-----2.1: HELLO WORLD-----");
		System.out.print("Is it (1) morning, (2) afternoon, or (3) night? (1/2/3): ");
		int timeOfDay=scan.nextInt();
		
		if (timeOfDay==1)
		{
			greeting="Good morning";
		}
		else if (timeOfDay==2)
		{
			greeting="Good afternoon";
		}
		else if (timeOfDay==3)
		{
			greeting="Good evening";
		}
		else
		{
			greeting="Hello";
		}
		
		System.out.println("\n"+greeting+", world! My name is Tara. :3\n");
	}
}
