package com.prodapt.march_20.assignment;

public class IntegerSearch1 extends AbstractSearch1 {
	
	 int num;
	 int getNum() {
			return num;
		}
	 public void setNum(int num) {
			this.num = num;
		}

	 public IntegerSearch1() {
		 
	 }
	 public IntegerSearch1(int num) {
		super();
		this.num = num;
	}
	 
	 public boolean search(Object[] obj_list, Object obj) {
		 int found=0;
		    for(int i=0;i<obj_list.length;i++)
		    { 
		    	if(obj_list[i].equals(obj)) found++;
		    }
		    if(found>0) return true;
		    else return false;
		
		}
}

	

