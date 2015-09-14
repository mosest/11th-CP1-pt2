//Tara Moses
//Assignment 4.4: HiLo Game
//June 27, 2013

import java.util.Scanner;

public class HiLo
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int guess;
		int randomNum=randomNum=(int)(50*Math.random());
		String again="n";
		
		System.out.println("-----4.4: HILO GAME-----\n");
		System.out.println("I'm thinking of a number between 0 and 50. What is it?");
		do
		{
			System.out.print("\nGuess a number: ");
			guess=scan.nextInt();
			
			if (guess<randomNum) System.out.println("Too low. Try again.");
			else if (guess>randomNum) System.out.println("Too high. Try again.");
			else if (guess==randomNum)
			{
				System.out.print("\nCorrect! The number was "+randomNum+". Play again? (y/n): ");
				again=scan.next();
				
				if (again.equalsIgnoreCase("y")) randomNum=(int)(50*Math.random());
				else if (again.equalsIgnoreCase("n")) break;
				else
				{
					System.out.println("...I'll take that as a 'no.'");
					break;
				}
			}
		}
		while (guess!=randomNum);
		
	}
}
