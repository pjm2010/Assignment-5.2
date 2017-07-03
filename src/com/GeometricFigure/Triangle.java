package com.GeometricFigure;

public class Triangle extends Figure {

	int height=3;
	int base=4;
	int hypo=5;
	double area=0;
	double perimeter=0;
	
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area=base*height/2;
		System.out.println("The area of the tringle is "+area);	
		
		
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		perimeter=height+base+hypo;
		System.out.println("The perimeter of the triangle is "+perimeter);	
		
	}

	
	
}
