//Tara Moses
//Assignment 2.6: Rotated Square
//June 18, 2013

import java.util.Scanner;

public class RotatedSquare
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----2.6: ROTATED SQUARE-----");
		System.out.print("Side length in pixels: ");
		double length=scan.nextDouble();
		System.out.print("Angle in degrees: ");
		double angle=scan.nextDouble();
		
		Turtle t=new Turtle();
		
		t.dot();
		t.right(angle);
		t.up();
		t.left(90);
		t.forward(length/2.0);
		t.left(90.0);
		t.forward(length/2.0);		
		t.down();	
		t.setDirection(0.0);
		t.right(angle);	
		for (int i=0;i<4;i++)
		{
			t.forward(length);
			t.right(90.0);
		}
	}
}
