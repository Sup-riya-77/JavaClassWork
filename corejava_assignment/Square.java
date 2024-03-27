package com.prodapt.march_20.assignment;

public class Square extends Quadrilateral{
	
	@Override
	public int area() {
		return(height*base);
	}
	public Square(int side)
	{   this.base=side;
		this.height=side;
		
	}
	
	

}
