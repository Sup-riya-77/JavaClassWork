package com.prodapt.march_20.assignment;

public class Rectangle extends Quadrilateral {

	@Override
	public int area() {
		return(height*base);
	}
	public Rectangle(int b,int h )
	{   this.base=b;
		this.height=h;
		
	}

}
