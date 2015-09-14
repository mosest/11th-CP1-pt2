//Tara Moses
//Assignment 3.4: Dice Roll
//June 20, 2013

public class DiceRoll
{
	public static void main(String[] args)
	{
		System.out.println("-----3.4: DICE ROLL-----\n");
		int roll1=0;
		int roll2=0;
		int roll3=0;
		int roll4=0;
		int sum=0;
		int count=0;
		
		while (sum!=21)
		{
			roll1=(int)(6*Math.random()+1);
			roll2=(int)(6*Math.random()+1);
			roll3=(int)(6*Math.random()+1);
			roll4=(int)(6*Math.random()+1);
			sum=roll1+roll2+roll3+roll4;
			count++;
			
			System.out.println(count+": "+roll1+" + "+roll2+" + "+roll3+" + "+roll4+" = "+sum);
		}
		System.out.println("\nIt took "+count+" rolls in order to total 21.\n");
	}
}
