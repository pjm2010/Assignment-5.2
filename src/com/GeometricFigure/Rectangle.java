package com.GeometricFigure;

public class Rectangle extends Figure {

	double length=super.dim1=34;
	double breadth=super.dim1;
	double area=0;
	double perimeter=0;
	
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area=length*breadth;
		System.out.println("The area of the rectangle is "+area);			
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		perimeter=2*(length+breadth);
		System.out.println("The perimeter of the rectangle is "+perimeter);	
		
		}
	

	
	
}
