package com.prodapt.march25.assignment;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.nextLine();
	    scan.close();
	    int vowels=0;
	    int consonants=0;
	    System.out.println("String is : "+str);
	    for(int index=0;index<str.length();index++)
	    {
	    	if(str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'
	    			||str.charAt(index)=='u'||str.charAt(index)=='A'||str.charAt(index)=='E'||str.charAt(index)=='I'
	    			||str.charAt(index)=='O'||str.charAt(index)=='U') vowels++;
	    	else consonants++;
	    }
	    System.out.println("Vowels: "+vowels);
	    System.out.println("Consonants: "+consonants);
        
	}

}
