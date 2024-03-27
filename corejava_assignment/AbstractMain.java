package com.prodapt.march_20.assignment;

public class AbstractMain {

	
		public static void main(String[] args) {
			AbstractSearch1 obj1=new IntegerSearch1(1);
			AbstractSearch1 obj2=new IntegerSearch1(7);
			AbstractSearch1 obj3=new IntegerSearch1(3);
			AbstractSearch1 obj4=new IntegerSearch1(4);
			AbstractSearch1 obj5=new IntegerSearch1(5);
			AbstractSearch1 obj6=new IntegerSearch1(1);
			
			Object[] obj_list= new Object[5];
			 obj_list[0]=obj1;
			 obj_list[1]=obj2;
			 obj_list[2]=obj3;
			 obj_list[3]=obj4;
			 obj_list[4]=obj5;
			 IntegerSearch1 test=new IntegerSearch1();
			 System.out.println(test.search(obj_list,obj2));	
			 System.out.println(test.search(obj_list,obj6));
			 System.out.println("****************************************************");
			 AbstractSearch1 sobj1=new StringSearch1("Supriya");
			 AbstractSearch1 sobj2=new StringSearch1("Surya");
			 AbstractSearch1 sobj3=new StringSearch1("Minnie");
			 Object[] obj_list_string= new Object[3];
			 obj_list_string[0]=sobj1;
			 obj_list_string[1]=sobj2;
			 obj_list_string[2]=sobj3;
			 StringSearch1 tests=new StringSearch1();
			 System.out.println(tests.search(obj_list_string,sobj2));	
		 }

	}


