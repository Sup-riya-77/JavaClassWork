package com.prodapt.march25.assignment;
import java.util.Scanner;
public class PermutationsOfString {
	 public static String swapString(String a, int i, int j) {  
	        char[] b =a.toCharArray();  
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
	        return String.valueOf(b);  
	    }  
     public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scan.nextLine();
	    scan.close();
	    System.out.println("String is : "+string);
	    int len = string.length();  
        System.out.println("All the permutations of the string are: ");  
        generatePermutation(string, 0, len);  
	}
  
     public static void generatePermutation(String str, int start, int end)  
     {  
         
         if (start == end-1)  
             System.out.println(str);  
         else  
         {  
             for (int i = start; i < end; i++)  
             {  
                 str = swapString(str,start,i);  
                 generatePermutation(str,start+1,end);    
                 str = swapString(str,start,i);  
             }  
         }  
     }  
 }  

