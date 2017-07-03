package com.GeometricFigure;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Displaying the area and parameter of the circle 
		System.out.println("*****************************************************************************");
		Figure fig=new Circle(); //The child object created with the parent variable 
		fig.findArea();
		fig.findPerimeter();
		System.out.println("*****************************************************************************");
		
		//Displaying the area and parameter of the triangle 
		Figure fig1=new Triangle();
		fig1.findArea();
		fig1.findPerimeter();
		System.out.println("*****************************************************************************");
		
		//Displaying the area and parameter of the rectangle 
		Figure fig2=new Rectangle();
		fig2.findArea();
		fig2.findPerimeter();
		System.out.println("*****************************************************************************");
		
		
	}

}
