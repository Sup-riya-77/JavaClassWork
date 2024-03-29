package com.prodapt.march29.Assignment;
import java.util.Scanner;
public class FindSmallestNumber {
	int smallest;
	int index;
    public int findSmallest(int[] arr)
    {   
    	if(index==arr.length) 
    		return smallest;
    	else
    	{
    		if(arr[index]<smallest) smallest=arr[index];
    		index++;
    		findSmallest(arr);
    		return smallest;
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
		FindSmallestNumber obj=new FindSmallestNumber();
		obj.smallest=arr[0];
		try {
			int result=obj.findSmallest(arr);
			System.out.println("smallest element in array is "+result);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		

	}


}
