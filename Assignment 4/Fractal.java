//Tara Moses
//Assignment 4.3: SRSRS Fractal
//June 25, 2013

import java.util.Scanner;

public class Fractal
{
	//method replaces all instances of "s" in a string with "slsrsls"
	public static String modString(String str)
	{
		String newStr="";
		for (int i=0;i<str.length();i++)
		{
			if (str.substring(i,i+1).equalsIgnoreCase("s")) newStr=newStr+"slsrsls";
			else newStr=newStr+str.substring(i,i+1);
		}
		return newStr;
	}
	
	//method draws a fractal using string as instructions
	public static void drawString(String str)
	{
		Turtle t=new Turtle();
		t.hide();
		t.speed(0);
		
		for (int i=0;i<str.length();i++)
		{
			if (str.substring(i,i+1).equalsIgnoreCase("s")) t.forward(10);
			else if (str.substring(i,i+1).equalsIgnoreCase("r")) t.right(120);
			else if (str.substring(i,i+1).equalsIgnoreCase("l")) t.left(60);
		}
		t.zoomFit();
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----4.3: SRSRS FRACTAL-----\n");
		System.out.print("Order of fractal: ");
		int order=scan.nextInt();
		
		String fractal="srsrs";
		for (int i=0;i<order;i++)
		{
			fractal=modString(fractal);
		}
		drawString(fractal);
	}
}
