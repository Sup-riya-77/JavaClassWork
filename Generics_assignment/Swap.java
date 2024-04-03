package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swap {
	
	public static <T> T[] swap(T [] list, int firstPos, int secondPos)
	{
		try {
		T temp;
		temp=list[firstPos];
		list[firstPos]=list[secondPos];
		list[secondPos]=temp;
		return list;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter the positions with in range 5");
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(33);
		list1.add(37);
		list1.add(73);
		list1.add(77);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(99);
		list2.add(97);
		list2.add(93);
		list2.add(37);
		List<String> list3=new ArrayList<String>();
		list3.add("Supriya");
		list3.add("Suriya");
		list3.add("Swetha");
		list3.add("Swathi");
		List<Float> list4=new ArrayList<Float>();
		list4.add(99.12f);
		list4.add(97.23f);
		list4.add(93.235f);
		list4.add(37.67f);
		
		List<Double> list5=new ArrayList<Double>();
		list5.add(33.89d);
		list5.add(37.83d);
		list5.add(73.09d);
		list5.add(77.55d);
		
	
		@SuppressWarnings("rawtypes")
		List[] list=new List[5];
		list[0]=list1;
		list[1]=list2;
		list[2]=list3;
		list[3]=list4;
		list[4]=list5;
		
		for(int index=0;index<list.length;index++)
		{
			System.out.println(list[index]);
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first position : ");
		int firstPos=scan.nextInt();
		System.out.println("enter the Second position : ");
		int secondPos=scan.nextInt();
		
		if(swap(list,firstPos,secondPos)!=null)
		{
			System.out.println("After Swaping");
		for(int index=0;index<list.length;index++)
		{
			System.out.println(list[index]);
		}
		}
		scan.close();
	}

}
