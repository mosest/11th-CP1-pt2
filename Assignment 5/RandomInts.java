//Tara Moses
//Assignment 5.4: Random Integers
//July 19, 2013

public class RandomInts
{
	public static void main(String[] args)
	{
		System.out.println("-----5.4: RANDOM INTEGERS-----\n");
		
		int sum=0;
		int min=43;
		int max=0;
		int[] nums=new int[100];
		
		for (int i=0;i<100;i++)
		{
			int newInt=(int)(Math.random()*33+10);
			nums[i]=newInt;
			System.out.println(newInt);
			sum+=newInt;
			min=Math.min(min,newInt);
			max=Math.max(max,newInt);
		}
		
		double average=sum*1.0/100;
		
		System.out.println("\nAverage: "+average);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min+"\n");
	}
}
