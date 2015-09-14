//Tara Moses
//Assignment 6.3: Bounce the Ball
//August 14, 2013

import java.util.Scanner;

public class BounceBall
{
	public static void main(String[] args)
	{
		Ball ball=new Ball();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----6.3: BOUNCE THE BALL-----");
		
		while (true)
		{
			System.out.print("\nWould you like to: \n(1) pop\n(2) patch\n(3) inflate\n(4) deflate\n(5) check the pressure\n(6) bounce the ball? ");
			int choice=scan.nextInt();
			
			if (choice==1) ball.pop();
			else if (choice==2) ball.patch();
			else if (choice==3) ball.inflate();
			else if (choice==4) ball.deflate();
			else if (choice==5) ball.checkPressure();
			else if (choice==6) ball.bounce();
			else
			{
				System.out.println("Goodbye!\n");
				break;
			}
		}
	}
}
