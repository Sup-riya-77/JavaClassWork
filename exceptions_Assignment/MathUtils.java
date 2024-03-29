package com.prodapt.march28.exceptionsAssignment;
public class MathUtils {
	 
	public static int factorial(int n) throws IllegalArgumentException {
		int fac = 1;
		if(n<0)
		{
			throw new IllegalArgumentException("Negative values are not allowed");
		}
		if(n>16)
		{
			throw new IllegalArgumentException("values above 16  are not allowed");
		}	
		for (int i = n; i > 0; i--)
			fac = fac * i;
		return fac;
	}
}
