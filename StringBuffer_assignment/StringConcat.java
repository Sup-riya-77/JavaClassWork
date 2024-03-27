package com.prodapt.march26.StringBuffer.Quiz;

public class StringConcat {

	public static void main(String[] args) {
		
		String hi = "Hi, ";
        String mom = "mom.";
        //way 1
        System.out.println(hi.concat(mom));
        //way2
        String str=hi+mom;
        System.out.println(str);
        //way3
        StringBuffer strbuf=new StringBuffer();
        strbuf.append(hi);
        strbuf.append(mom);
        System.out.println(strbuf);

	}

}
