//Tara Moses
//Assignment 5.2: Go Random Direction
//July 19, 2013

public class GoRandomDirection
{
	//sets turtle in a random direction, 
	//then moves him forward 10 pixels
	public static void goRandomDirection(Turtle t)
	{
		double randomAngle=(Math.random()*360.0);
		t.right(randomAngle);
		t.forward(10);
	}
	
	public static void main(String[] args) throws Exception
	{
		Turtle t=new Turtle();
		t.setCanvasSize(500,500);
		
		System.out.println("-----5.2: GO RANDOM DIRECTION-----\n");
		
		while (true)
		{
			goRandomDirection(t);
			Thread.sleep(0);
			
			double x=t.getX();
			double y=t.getY();
			double canvasX=250;
			double canvasY=250;
			if (Math.abs(x)>canvasX || Math.abs(y)>canvasY) 
			{
				t.up();
				t.home();
				t.down();
			}
		}
	}
}
