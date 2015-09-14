//Tara Moses
//Assignment 4.2: Pig Latin
//June 24, 2013

import java.util.Scanner;
import java.io.*;

public class Piglatin
{
	public static String translateWord(String word)
	{
		String firstPart="";
		String restOfWord="";
		String ending="";
		int vowelIndex=0;
		String vowel="";
		String newWord="";
		String vowels="aeiouy";
		String punctuation=",.?!";
		
		word=word.toLowerCase().trim();
		
		for (int i=0;i<word.length();i++)
		{
			if (vowels.contains(word.substring(i,i+1)))
			{
				vowelIndex=i;
				vowel=word.substring(i,i+1);
				break;
			}
		}
		
		//take care of words starting with vowels
		if (vowelIndex==0) ending="way";
		else ending="ay";
		
		//take care of words with "qu"
		if (word.substring(vowelIndex,vowelIndex+1).equals("u") && word.substring(vowelIndex-1,vowelIndex).equals("q"))
		{
			firstPart=word.substring(0,vowelIndex+1);
			restOfWord=word.substring(vowelIndex+1,word.length());
		}
		else
		{
			firstPart=word.substring(0,vowelIndex);
			restOfWord=word.substring(vowelIndex,word.length());
		}
		
		//take care of punctuation
		if (punctuation.contains(word.substring(word.length()-1)))
		{
			ending=ending+restOfWord.substring(restOfWord.length()-1);
			restOfWord=restOfWord.substring(0,restOfWord.length()-1);
		}
		
		newWord=restOfWord+"-"+firstPart+ending;
		
		return newWord;
	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String sentence="";
		String newSentence="";
		
		System.out.println("-----4.2: PIG LATIN-----\n");
		System.out.print("Would you like to (1) enter a sentence, or (2) read from a file? ");
		int choice=scan.nextInt();
		scan.nextLine();
		
		if (choice==1)
		{
			System.out.println("\nEnter a sentence to be translated: ");
			sentence=scan.nextLine();
			
			int numOfWords=sentence.length()-sentence.replaceAll(" ","").length()+1;
			
			String[] words=sentence.split(" ");
			
			for (int i=0;i<numOfWords;i++)
			{
				newSentence=newSentence+" "+translateWord(words[i]);
			}
			
			newSentence=newSentence.trim().substring(0,1).toUpperCase()+newSentence.substring(2,newSentence.length());
			
			System.out.println("\nNEW SENTENCE: "+newSentence+"\n");
		}
		else if (choice==2)
		{
			System.out.print("File name: ");
			String filename=scan.nextLine();
			
			Scanner filescan=new Scanner(new File(filename));
			
			while (filescan.hasNext())
			{
				sentence=filescan.nextLine();
				String[] words=sentence.split(" ");
				
				int numOfWords=sentence.length()-sentence.replaceAll(" ","").length()+1;
				
				for (int i=0;i<numOfWords;i++)
				{
					newSentence=newSentence+" "+translateWord(words[i]);
				}
				
				newSentence=newSentence.trim().substring(0,1).toUpperCase()+newSentence.substring(2,newSentence.length());
			}
			
			System.out.println("\nNEW FILE: "+newSentence+"\n");
		}
		else
		{
			System.out.println("You must enter either 1 or 2. Restart.");
		}
	}
}
