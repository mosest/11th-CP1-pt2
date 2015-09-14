//Tara Moses
//Assignment 5.6: Turtle Steps on Dots
//July 19, 2013

import java.awt.Color;

public class Dots
{
	//returns true if turtle is touching a dot
	public static boolean touchesDot(int[] dotX, int[] dotY, int[] dotSize, Turtle t)
	{
		for (int i=0;i<20;i++)
		{
			if (t.distance(dotX[i],dotY[i])<=dotSize[i]/2.0) return true;
		}
		return false;
	}
	
	//makes turtle go up on the canvas
	public static void goUp(Turtle t)
	{
		double direction = t.getDirection();
		while (direction!=90.0)
		{
			t.left(90.0);
			direction=t.getDirection();
		}
		t.forward(10);
	}
	
	//makes turtle go down on the canvas
	public static void goDown(Turtle t)
	{
		double direction = t.getDirection();
		while (direction!=270.0)
		{
			t.left(90.0);
			direction=t.getDirection();
		}
		t.forward(10);
	}
	
	//makes turtle go left on the canvas
	public static void goLeft(Turtle t)
	{
		double direction = t.getDirection();
		while (direction!=180.0)
		{
			t.left(90.0);
			direction=t.getDirection();
		}
		t.forward(10);
	}
	
	//makes turtle go right on the canvas
	public static void goRight(Turtle t)
	{
		double direction = t.getDirection();
		while (direction!=0.0)
		{
			t.left(90.0);
			direction=t.getDirection();
		}
		t.forward(10);
	}
	
	public static void main(String[] args)
	{
		Turtle t=new Turtle();
		int[] dotX=new int[20];
		int[] dotY=new int[20];
		int[] dotSize=new int[20];
		
		t.onKey("goUp", "w");
		t.onKey("goDown", "s");
		t.onKey("goLeft", "a");
		t.onKey("goRight", "d");
		
		System.out.println("-----5.6: DOTS-----\n");
		System.out.println("Use the 'wsad' keys to navigate the turtle.");
		System.out.println("Don't touch the light-blue land mines...or else.");
		
		for (int i=0;i<20;i++)  //draw 20 dots, save their coordinates and radii into arrays
		{
			int randomSize=(int)(Math.random()*35+15);
			int randomX=(int)(Math.random()*500-250);
			int randomY=(int)(Math.random()*500-250);
			
			dotX[i]=randomX;
			dotY[i]=randomY;
			dotSize[i]=randomSize;
			
			t.up();
			t.setPosition(dotX[i],dotY[i]);
			t.down();
			t.dot("sky blue",dotSize[i]);
		}
		t.up();
		t.home();
		t.down();
		while (true)
		{
			if (touchesDot(dotX,dotY,dotSize,t))
			{
				t.hide();
				t.up();
				System.out.println("\nYour turtle has stepped on a light-blue land mine. He is dead.\n");
				break;
			}
		}
	}
}
