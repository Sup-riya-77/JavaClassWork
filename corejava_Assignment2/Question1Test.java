package com.prodapt.march29.Assignment;

public class Question1Test

{
	public static void main(String[] args)
	{
		
	Question1 instanceA = new Question1();
	Question1 instanceB = new Question1();
	instanceA.a = 8; //A.a=8
    instanceB.b = instanceA.x; //B.b=6
    instanceA.x++;//A.x=7
    instanceB.a = 10;//B.a=10
    instanceB.c = 90; //B.c=90
    instanceB.x++;//B.x=8
    System.out.println("InstanceA:");
    System.out.println("a : "+instanceA.a); 
    System.out.println("b : "+instanceA.b);
    System.out.println("c : "+instanceA.c);
    System.out.println("x : "+instanceA.x);
    
    System.out.println("InstanceB:");
    System.out.println("a : "+instanceB.a);
    System.out.println("b : "+instanceB.b);
    System.out.println("c : "+instanceB.c);
    System.out.println("x : "+instanceB.x);
    
    /* output
    x : 6
    InstanceA:
    a : 8
    b : 0
    c : 2
    x : 8
    InstanceB:
    a : 10
    b : 6
    c : 90
    x : 8
    */

    
    

}

}