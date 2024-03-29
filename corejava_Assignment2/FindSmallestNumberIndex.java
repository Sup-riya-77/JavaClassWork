package com.prodapt.march29.Assignment;
import java.util.Scanner;
public class FindSmallestNumberIndex {
	int smallestIndex;
	int smallest;
	int index;
    public int findSmallestIndex(int[] arr)
    {   
    	if(index==arr.length) 
    		return smallestIndex;
    	else
    	{
    		if(arr[index]<smallest) 
    			{
    			smallest=arr[index];
    			smallestIndex=index;
    			}
    		index++;
    		findSmallestIndex(arr);
    		return smallestIndex;
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
		FindSmallestNumberIndex obj=new FindSmallestNumberIndex();
		obj.smallest=arr[0];
		try {
			int result=obj.findSmallestIndex(arr);
			System.out.println("smallest element in array is at index  "+result);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		

	}


}

