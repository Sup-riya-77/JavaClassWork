package com.prodapt.march26.StringBuffer.Quiz;

public class StringBuffQuiz {

	public static void main(String[] args) {
		System.out.println("QUESTION 1");
		System.out.println("--------------------------------------------------");
		StringBuffer strbuf=new StringBuffer("12345678912345678912345678");
		System.out.println("strbuf.length(): "+strbuf.length());
		System.out.println("strbuf.capacity(): "+strbuf.capacity());
		System.out.println("--------------------------------------------------");
		System.out.println("QUESTION 2");
		System.out.println("--------------------------------------------------");
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf('b'));
		System.out.println("--------------------------------------------------");
		System.out.println("QUESTION 3");
		System.out.println("--------------------------------------------------");
		String s="Was it a car or a cat I saw?".substring(9, 12);
		System.out.println(s);
		System.out.println("--------------------------------------------------");
		System.out.println("QUESTION 4");
		System.out.println("--------------------------------------------------");
		String original = "software";
        StringBuffer result = new StringBuffer("hi");
        int index = original.indexOf('a');
        result.setCharAt(0, original.charAt(0));
        System.out.println(result);
        result.setCharAt(1, original.charAt(original.length()-1));
        System.out.println(result);
        result.insert(1, original.charAt(4));
        System.out.println(result);
        result.append(original.substring(1,4));
        System.out.println(result);
        result.insert(3, (original.substring(index, index+2) + " "));
        System.out.println(result);
		
		

	}

}
