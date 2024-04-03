package collection.genericAssignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FriendFinder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//b
		FriendshipCriteria <String,Integer> friend1=new FriendshipCriteria <String,Integer>();
		friend1.setT("Supriya");
		friend1.setS(22);
		System.out.println(friend1);
		FriendshipCriteria <String,Integer> friend2=new FriendshipCriteria <String,Integer>();
		friend2.setT("Srikanth");
		friend2.setS(22);
		System.out.println(friend2);
		FriendshipCriteria <String,Integer> friend3=new FriendshipCriteria <String,Integer>();
		friend3.setT("Suriya");
		friend3.setS(21);
		System.out.println(friend3);
		
		List<FriendshipCriteria<String,Integer>> lists1=new ArrayList<FriendshipCriteria<String,Integer>>();
		lists1.add(friend1);
		lists1.add(friend2);
		lists1.add(friend3);
		System.out.println("enter the target age : ");
		Integer targetAge=scan.nextInt();
		for(FriendshipCriteria<String,Integer> list:lists1)
		{
			if(list.getS()==targetAge)
			{
				System.out.println("target age is same as age of friend "+list.getT());
			}
		}
		System.out.println("**********************************8");
		//c
		FriendshipCriteria <String,String> friend4=new FriendshipCriteria <String,String>();
		friend4.setT("Supriya");
		friend4.setS("hyd");
		System.out.println(friend4);
		FriendshipCriteria <String,String> friend5=new FriendshipCriteria <String,String>();
		friend5.setT("Srikanth");
		friend5.setS("ptc");
		System.out.println(friend5);
		FriendshipCriteria <String,String> friend6=new FriendshipCriteria <String,String>();
		friend6.setT("Suriya");
		friend6.setS("hyd");
		System.out.println(friend4);
		List<FriendshipCriteria<String,String>> lists2=new ArrayList<FriendshipCriteria<String,String>>();
		lists2.add(friend4);
		lists2.add(friend5);
		lists2.add(friend6);
		System.out.println("Enter target location : ");
		String targetLocation=scan.next();
		for(FriendshipCriteria<String,String> list:lists2)
		{
			if(targetLocation.equalsIgnoreCase(list.getS()))
			{
				System.out.println("your nearest friend is "+list.getT());
			}
		}
		scan.close();
	}

}
