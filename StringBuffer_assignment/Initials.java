package com.prodapt.march26.StringBuffer.Quiz;
import java.util.Scanner;
public class Initials {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scan.nextLine();
	    scan.close();
	    System.out.println("String is : "+string);
	    System.out.print(string.charAt(0));
	    for(int index=0;index<string.length();index++)
	    {
	    	if(string.charAt(index)==' ') System.out.print(string.charAt(index+1));
	    	else continue;
	    }

	}

}
