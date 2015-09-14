//Tara Moses
//Assignment 3.5: Dots
//June 20, 2013

public class Dots
{
	public static void main(String[] args)
	{
		Turtle t=new Turtle();
		t.hide();
		t.speed(0);
		double x=0;
		double y=0;
		int greenCount=0;
		int totalCount=0;
		
		System.out.println("-----3.5: DOTS-----");
		for (int i=0;i<5000;i++)
		{
			x=400.0*Math.random()-200.0;
			y=400*Math.random()-200.0;
			t.up();
			t.setPosition(x,y);
			t.down();
			if (t.distance(0,0)<=200.0)
			{
				t.penColor("green");
				greenCount++;
			}
			else
			{
				t.penColor("red");
			}
			totalCount++;
			t.dot();
		}
		System.out.println("There are "+greenCount+" green dots. There are "+totalCount+" dots total.");
		double pi=(greenCount*1.0/totalCount)*4.0;
		System.out.println("Pi = about "+pi+".");
	}
}
