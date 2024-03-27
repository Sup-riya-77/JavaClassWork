package com.prodapt.march26.StringBuffer.Quiz;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    
    static boolean areAnagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2)
            return false;
        Arrays.sort(str1);
        //System.out.println(str1);
        Arrays.sort(str2);
        //System.out.println(str2);
       
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
    public static void main(String args[])
    {
    	Scanner scan=new Scanner(System.in);
		System.out.println("Enter String1 :");
		String string1=scan.nextLine();
		System.out.println("Enter String2 :");
		String string2=scan.nextLine();
        String string3 = new String();
        String string4 = new String();
		for(int i=0;i<string1.length();i++)
		{
			if(Character.isAlphabetic(string1.charAt(i)) || Character.isDigit(string1.charAt(i))) 
				string3=string3+string1.charAt(i);
			else continue;
		}
		for(int i=0;i<string2.length()-1;i++)
		{
			if(Character.isAlphabetic(string1.charAt(i))|| Character.isDigit(string1.charAt(i)))
				string4=string4+string1.charAt(i);
			else continue;
		}
		char[] str1=string3.toCharArray();
		char[] str2=string4.toCharArray();
		if (areAnagram(str1, str2))
	            System.out.println("The two strings are anagram of each other");
	       else
	            System.out.println("The two strings are not anagram of each other");
        scan.close();
    }
}