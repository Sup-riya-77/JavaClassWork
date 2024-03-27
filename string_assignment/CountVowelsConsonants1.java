package com.prodapt.march25.assignment;

public class CountVowelsConsonants1 {

	public static void main(String[] args) {
		String name="SUPRIYA";;
		char[] vowels= {'A','E','I','O','U'};
		int vowelCounter=0;
		int consonantCounter=0;
		int count=0;
	    for(int index=0;index<name.length();index++)
	    {
	    	for(int j=0;j<vowels.length;j++)
	    	{   
	    		count=0;
	    		if(name.charAt(index)==vowels[j])
	    			{ 
	    			vowelCounter++;
	    			count=1;
	    			break;
	    			}
	    		
	    	}
	    	if(count==0) consonantCounter++;
	    }
	    System.out.println("Vowels: "+vowelCounter);
	    System.out.println("Consonants: "+consonantCounter);
   }

}
