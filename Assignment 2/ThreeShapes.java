//Tara Moses
//Assignment 2.5: Three Shapes with Turtle
//June 18, 2013

import java.awt.Color;

public class ThreeShapes
{
	public static void clearScreen(Turtle t)
	{
		t.clear();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Turtle t=new Turtle();
		t.hide();
		t.speed(0);
		double x=0;
		double y=0;
		
		t.onKey("clearScreen","c");
		
		System.out.println("-----2.5: THREE SHAPES-----");
		System.out.println("\nLeft-click the canvas to draw a square.");
		System.out.println("Middle-click the canvas to draw a circle.");
		System.out.println("Right-click the canvas to draw a triangle.");
		System.out.println("Press 'c' to clear the canvas.");
		
		while (true)
		{
			if (t.mouseButton1())
			{
				x=t.mouseX();
				y=t.mouseY();
				
				x=t.canvasX(x);
				y=t.canvasY(y);
				
				t.penColor("pink");
				t.setDirection(0.0);
				t.up();
				t.setPosition(x,y);
				t.down();
				for (int i=0;i<4;i++)
				{
					t.forward(50.0);
					t.right(90.0);
				}
				Thread.sleep(100);
			}
			else if (t.mouseButton2())
			{
				x=t.mouseX();
				y=t.mouseY();
				
				x=t.canvasX(x);
				y=t.canvasY(y);
				
				t.penColor("olive");
				t.setDirection(0.0);
				t.up();
				t.setPosition(x,y);
				t.down();
				for (int i=0;i<360;i++)
				{
					t.forward(0.5);
					t.right(1.0);
				}
				Thread.sleep(100);
			}
			else if (t.mouseButton3())
			{
				x=t.mouseX();
				y=t.mouseY();
				
				x=t.canvasX(x);
				y=t.canvasY(y);
				
				t.penColor("light blue");
				t.setDirection(0.0);
				t.up();
				t.setPosition(x,y);
				t.down();
				for (int i=0;i<3;i++)
				{
					t.forward(50.0);
					t.right(120.0);
				}
				Thread.sleep(100);
			}
		}
	}
}
