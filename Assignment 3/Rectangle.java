//Tara Moses
//Assignment 3.2: Rectangle
//June 20, 2013

import java.util.Scanner;

public class Rectangle
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----3.2: RECTANGLE-----");
		System.out.print("Height: ");
		int height=scan.nextInt();
		System.out.print("Width: ");
		int width=scan.nextInt();
		System.out.print("Character: ");
		String character=scan.next();
		
		System.out.println();		
		for (int i=0;i<height;i++)
		{
			for (int j=0;j<width;j++)
			{
				System.out.print(character);
			}
			System.out.println();
		}
		System.out.println();
	}
}
