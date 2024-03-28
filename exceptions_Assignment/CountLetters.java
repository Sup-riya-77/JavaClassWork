package com.prodapt.march28.exceptionsAssignment;
import java.util.Scanner;
public class CountLetters {

	public static void main(String[] args) {
		int[] counts=new int[26];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a single word(letters only,please):");
		String word=scan.nextLine();
		word=word.toUpperCase();
		try {
		for(int i=0;i<word.length();i++)
		{
		counts[word.charAt(i)-'A']++;
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Not a letter.\nexception encountered : "+e);
		}
		for(int i=0;i<counts.length;i++)
		{
			if(counts[i]!=0)
				System.out.println((char)(i+'A')+" : "+ counts[i]);
		}
		scan.close();

	}

}
