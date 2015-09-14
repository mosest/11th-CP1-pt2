//Tara Moses
//Assignment 3.3: Starburst
//June 20, 2013

import java.util.Scanner;

public class Starburst
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----3.3: STARBURST-----");
		System.out.print("Number of lines: ");
		int numLines=scan.nextInt();
		System.out.print("Radius: ");
		int radius=scan.nextInt();		
		System.out.println();
		
		Turtle t=new Turtle();
		t.speed(0);
		t.hide();
		double angle=360.0/numLines;
		
		for (int i=0;i<numLines;i++)
		{
			t.forward(radius);
			t.right(180.0);
			t.forward(radius);
			t.right(180.0+angle);
		}
	}
}
