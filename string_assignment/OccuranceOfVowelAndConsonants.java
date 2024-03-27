package com.prodapt.march25.assignment;

import java.util.Scanner;

public class OccuranceOfVowelAndConsonants {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scan.nextLine();
	    scan.close();
	    System.out.println("String is : "+string);
		int vowelCount = 0;
		int consonantCount = 0;
		String str=string.toUpperCase();
		for(int index=0; index<str.length(); index++)
		{
			if(str.charAt(index)=='A'|| str.charAt(index)=='E'|| str.charAt(index)=='I'|| str.charAt(index)=='O' ||str.charAt(index)=='U')
			{
				vowelCount++;
			}
			else if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
			{
				consonantCount++;
			}
		}
		System.out.println("No.of Vowels " + vowelCount);
		char[] vowels={'A','E','I','O','U'};
		for(int i=0;i<vowels.length;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==vowels[i])
				{
					count++;
				}
			}
			if(count>0) System.out.println(vowels[i]+" - "+count);
		}
		System.out.println("No.of Consonants " + consonantCount);
		char[] consonants={'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		for(int i=0;i<consonants.length;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==consonants[i])
				{
					count++;
				}
			}
			if(count>0) System.out.println(consonants[i]+" - "+count);
		}
	}
 
}
 




