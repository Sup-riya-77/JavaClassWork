package com.prodapt.march28.exceptionsAssignment;
public class MathUtils {
	 
	public static int factorial(int n) throws IllegalArgumentException {
		int fac = 1;
		if(n<0 || n>16)
		{
			throw new IllegalArgumentException();
		}
		for (int i = n; i > 0; i--)
			fac = fac * i;
		return fac;
	}
}