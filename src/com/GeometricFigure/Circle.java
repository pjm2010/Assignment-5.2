package com.GeometricFigure;

public class Circle extends Figure {


	double radius=super.dim1=34; //Used the property of the paremnt in the child
	double pie=3.14;
	double area=0;
	double perimeter=0;
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		area=pie*radius*radius;
		System.out.println("The area of the circle is "+area);	
		
	}
	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		perimeter=2*pie*radius;
		System.out.println("The perimeter of the circle is "+perimeter);	
		}
	
}
