//Tara Moses
//Assignment 5.5: Birthdays
//July 19, 2013

public class Birthdays
{
	//checks whether a birthday is already in the array
	public static boolean isUsed(int birthday, int[] array)
	{
		for (int i=0;i<array.length;i++)
		{
			if (array[i]==birthday) return true;
		}
		return false;
	}
	
	public static String getMonthAndDay(int day)
	{
		if (1<=day && day<=31) return "January "+day;
		if (32<=day && day<=59) return "February "+(day-31);
		if (60<=day && day<=90) return "March "+(day-59);
		if (91<=day && day<=120) return "April "+(day-90);
		if (121<=day && day<=151) return "May "+(day-120);
		if (152<=day && day<=181) return "June "+(day-151);
		if (182<=day && day<=212) return "July "+(day-181);
		if (213<=day && day<=243) return "August "+(day-212);
		if (244<=day && day<=273) return "September "+(day-243);
		if (274<=day && day<=304) return "October "+(day-273);
		if (305<=day && day<=334) return "November "+(day-304);
		return "December "+(day-334);
	}
	
	public static void main(String[] args)
	{
		int newInt=0;
		int[] usedBirthdays=new int[365];
		int tries=0;
		
		System.out.println("-----5.5: BIRTHDAYS-----\n");
		
		for (int i=0;i<365;i++)
		{
			newInt=(int)(Math.random()*366+1);
			System.out.println(getMonthAndDay(newInt));
			if (isUsed(newInt,usedBirthdays)) break;
			usedBirthdays[i]=newInt;
			tries=i;
		}
		System.out.println("\nAfter "+tries+" tries, "+getMonthAndDay(newInt)+" is the duplicate birthday!");
	}
}
