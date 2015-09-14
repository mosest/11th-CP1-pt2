//Tara Moses
//Assignment 2.2: Madlib
//June 17, 2013

import java.util.Scanner;

public class Madlib
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-----2.2: MADLIB-----");
		System.out.print("What's your name? ");
		String name=scan.nextLine();
		System.out.println(name+", give me words in order to construct a madlib.\n");
		
		System.out.print("Noun: ");
		String noun1=scan.nextLine();
		System.out.print("Place: ");
		String place=scan.nextLine();
		System.out.print("Past-tense verb: ");
		String pastVerb1=scan.nextLine();
		System.out.print("Verb ending in -ing: ");
		String infinitiveVerb=scan.nextLine();
		System.out.print("Noun that rhymes with place given above: ");
		String noun2=scan.nextLine();
		System.out.print("Past-tense verb: ");
		String pastVerb2=scan.nextLine();
		System.out.print("Feeling: ");
		String feeling=scan.nextLine();
		System.out.print("Noun that rhymes with feeling given above: ");
		String noun3=scan.nextLine();
		System.out.print("Noun: ");
		String noun4=scan.nextLine();
		System.out.print("Past-tense verb that rhymes with place given above: ");
		String pastVerb3=scan.nextLine();
		
		/*
		System.out.println("\nThere once was a/an "+noun1+" from "+place);
		System.out.println("Who "+pastVerb1+" he was "+infinitiveVerb+" his "+noun2+".");
		System.out.println("He "+pastVerb2+" with "+feeling);
		System.out.println("In the middle of the "+noun3);
		System.out.println("To find that his "+noun4+" had "+pastVerb3+"!\n");
		*/
		
		String actualPoem="\nWritten by "+name+": \n\nThere once was a/an "+noun1+" from "+place+"\n"+"Who "+pastVerb1+" he was "+infinitiveVerb+" his "+noun2+".\nHe "+pastVerb2+" with "+feeling+"\nIn the middle of the "+noun3+"\nTo find that his "+noun4+" had "+pastVerb3+"!\n\n";
		System.out.print(actualPoem);
	}
}
