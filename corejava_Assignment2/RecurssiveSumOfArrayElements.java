package com.prodapt.march29.Assignment;
import java.util.Scanner;
public class RecurssiveSumOfArrayElements {
	int sum=0;
	int index=0;
    public int calculateSum(int[] arr)
    {   
    	if(index==arr.length) 
    		return sum;
    	else
    	{
    		sum+=arr[index];
    		index++;
    		calculateSum(arr);
    		return sum;
    	}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		RecurssiveSumOfArrayElements obj=new RecurssiveSumOfArrayElements();
		try {
			int result=obj.calculateSum(arr);
			System.out.println("sum of array elements is "+result);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		

	}

}
