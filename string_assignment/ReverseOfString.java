package com.prodapt.march25.assignment;
import java.util.Scanner;
public class ReverseOfString {
      public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scan.nextLine();
	    scan.close();
	    System.out.println("String is : "+string);
	    int len = string.length();
	    char[] a = string.toCharArray();
	    char[]b=new char[len];
	    for(int index=0;index<len;index++)
	    {
	    	b[index]=a[len-index-1];
	    }
	    for(int index=0;index<len;index++)
	    {
	    System.out.print(b[index]);
	    }
	    System.out.println();
        String revString=new String(b);
        System.out.println("Reverse String : "+revString);
        
	}

}
