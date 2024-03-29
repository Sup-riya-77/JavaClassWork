package com.prodapt.march29.Assignment;
import java.util.Arrays;
import java.util.Random;
public class MyIntArrayUtil {

	public static void main(String[] args) {
		Random r=new Random();
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(0,99);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}

	}

}
