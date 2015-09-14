//Tara Moses
//Class for Assignment 6.3: Ball
//August 14, 2013

import java.util.Scanner;

public class Ball
{
	int psi=25;
	boolean isPopped=false;
	static int maxPsi=50;
	
	public Ball()
	{
		this.psi=psi;
		this.isPopped=isPopped;
		this.maxPsi=maxPsi;
	}
	
	public void pop()
	{
		if (isPopped) System.out.println("\nThe ball is already popped!\n");
		isPopped=true;
		psi=0;
	}
	
	public void patch()
	{
		if (!isPopped) System.out.println("\nThe ball wasn't popped, but thanks!\n");
		isPopped=false;
	}
	
	public void inflate()
	{
		if (isPopped) System.out.println("\nYou can't inflate the ball; it's popped.\n");
		else if (psi>maxPsi)
		{
			psi=0;
			isPopped=true;
			System.out.println("\nThe ball popped! Psshhh...\n");
		}
		else psi=psi+5;
	} 
	
	public void deflate()
	{
		if (psi==0) System.out.println("\nThe ball can't deflate any more.\n");
		else psi=psi-5;
	}
	
	public void checkPressure()
	{
		System.out.println("\nThe pressure is "+psi+" psi.\n");
	}
	
	public void bounce()
	{
		if (isPopped || psi==0) System.out.println("\nThe ball can't bounce; it has no air.\n");
		else
		{
			System.out.println("\nThe ball bounced "+psi/5+" ft!\n");
			psi=psi-5;
		}
	}
}
