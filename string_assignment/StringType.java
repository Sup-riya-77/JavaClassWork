package com.prodapt.march25.assignment;
import java.util.Scanner;
public class StringType {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.nextLine();
	    scan.close();
	    int digit=0;
	    int alpha=0;
	    System.out.println("String is : "+str);
	    for(int index=0;index<str.length();index++)
	    {
	       if(Character.isDigit(str.charAt(index))) digit++;
	       else if (Character.isAlphabetic(str.charAt(index))) alpha++;
	       
	    }
	   if(digit==str.length())System.out.println("It contains only Digits");
	   else if (alpha==str.length())System.out.println("It contains only Alphabets");
	   else System.out.println("It contains both Digits and alphabets");
 }

}
