package com.prodapt.march_20.assignment;

public class IntegerSearch extends AbstractSearch {
	
	    public static void main(String[] args) {
		int arrList[]= {1,2,3,4,5,6};
		IntegerSearch obj1=new IntegerSearch();
		System.out.println(obj1.search(arrList,2));
		
	    }
	@Override
	public boolean search(int[] obj_list, int obj) {
		int found=0;
	    for(int i=0;i<obj_list.length;i++)
	    {
	    	if(obj_list[i]==obj) found++;
	    }
	    if(found>0) return true;
	    else return false;
	}
	

}
