package com.prodapt.march_20.assignment;
import java.util.Scanner;
public class IntegerArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int array_size;
		System.out.print("enter the Size of arraay:");
		array_size=scan.nextInt();
		int arr[]=new int[array_size];
		System.out.println("enter the Elements of arraay:");
		for(int i=0;i<array_size;i++)
		{
			arr[i]=scan.nextInt();
		}
		/***System.out.println("Elements of array:");
		for(int i=0;i<array_size;i++)
		{
			System.out.println(arr[i]);
		} ***/
		System.out.println("Enter the number you want to search:");
		int num=scan.nextInt();
		for(int i=0;i<array_size;i++)
		{
			if(arr[i]==num) System.out.println(num+" found at index "+i);
		}
		
		
		scan.close();
	}

}
