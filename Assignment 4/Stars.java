//Tara Moses
//Assignment 4.5: Draw Stars
//June 27, 2013

import java.awt.Color;

public class Stars
{
	public static void drawStar(Turtle t, double x, double y, double size, double angle, String color)
	{
		t.right(angle);
		t.penColor(color);
		t.up();
		t.setPosition(x,y);
		t.down();
		
		for (int i=0;i<5;i++)
		{
			t.forward(size);
			t.left(72.0);
			t.forward(size);
			t.right(144.0);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		Turtle t=new Turtle();
		t.hide();
		t.bgcolor("black");
		double x;
		double y;
		double size;
		double randomAngle;
		int colorNum;
		String color;
		
		System.out.println("-----4.5: STARS-----\n");
		System.out.println("Click anywhere on the canvas to draw a star.\n");
		
		while (true)
		{
			if (t.mouseButton1())
			{
				x=t.canvasX(t.mouseX());
				y=t.canvasY(t.mouseY());
				size=20.0*Math.random()+10.0;
				randomAngle=360.0*Math.random();
				
				//get a random color
				colorNum=(int)(6*Math.random());
				if (colorNum==0) color="light blue";
				else if (colorNum==1) color="green";
				else if (colorNum==2) color="pink";
				else if (colorNum==3) color="white";
				else if (colorNum==4) color="orange";
				else if (colorNum==5) color="yellow";
				else color="purple";
				
				drawStar(t,x,y,size,randomAngle,color);
			}
			Thread.sleep(50);
		}
	}
}
