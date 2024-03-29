package com.prodapt.march28.exceptionsAssignment;
import java.util.Scanner;

public class Factorials {
 
	public static void main(String[] args) {
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
 
		while (keepGoing.equals("y") || keepGoing.equals("Y")) {
			System.out.println("Enter an Integer: ");
			int val = scan.nextInt();
			try {
			System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
			}
			catch(IllegalArgumentException e)
			{   
				 System.out.println(e.getMessage());
				
			}
			System.out.println("Another factorial? ()y/n ");
			keepGoing = scan.next();
			
		}
		scan.close();
	}
 
}
