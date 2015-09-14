//Tara Moses
//Assignment 2.3: Wheel Counter
//June 18, 2013

import java.util.Scanner;

public class Wheels
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----2.3: WHEEL COUNTER-----");
		System.out.print("How many cars? ");
		int numCars=scan.nextInt();
		System.out.print("How many tricycles? ");
		int numTri=scan.nextInt();
		System.out.print("How many bicycles? ");
		int numBi=scan.nextInt();
		System.out.print("How many unicycles? ");
		int numUni=scan.nextInt();
		
		int numWheels=numCars*4+numTri*3+numBi*2+numUni*1;
		
		System.out.println("\nYou have "+numWheels+" wheel(s) total.\n");
	}
}
