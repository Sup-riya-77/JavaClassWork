package com.prodapt.march_20.assignment;

public class QuadTest {

	public static void main(String[] args) {
		Quadrilateral sq=new Square(2);
		Quadrilateral rec=new Rectangle(2,4);
		System.out.println(sq.area());
		System.out.println(rec.area());

	}

}
