package com.prodapt.march25.assignment;
import java.util.Scanner;
public class ReverseStringRecurssion {
	void reverseString(String string)   
	{   
	if ((string==null)||(string.length() <= 1))   
	System.out.println(string);   
	else  
	{   
	System.out.print(string.charAt(string.length()-1));   
	reverseString(string.substring(0,string.length()-1));   
	}   
	}
    public static void main(String[] args)   
          {   
    	Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scan.nextLine();
	    scan.close();
	    System.out.println("String is : "+string);
        ReverseStringRecurssion reverseString = new ReverseStringRecurssion();   
        reverseString.reverseString(string);   
         }      
}  