package com.skillstorm.week3;

public class TestCircleCalculations {

	public static void main(String[] args) {
		 Circle circle1 = new Circle("Circle 1", (double) 8);
		 Circle circle2 = new Circle("Circle 2", (double) 5.2);
		 Circle circle3 = new Circle("Circle 3", (double) 1);
		 
		 
		
		 System.out.println("The area of circle1 is " + circle1.calculateAreaOfCircle() );
		 System.out.println("The diameter of circle2 is " + circle2.calculateDiameter() );
		 System.out.println("The circumference of circle3 is " + circle3.calculateCircumference());
	}

}
