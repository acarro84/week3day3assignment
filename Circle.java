package com.skillstorm.week3;

public class Circle {

	String circleNum;
	double radius;

	public Circle() {

	}

	public Circle(String circleNum, double radius) {
		this.circleNum = circleNum;
		this.radius = radius;

	}

	@Override
	public String toString() {
		return "name = " + this.circleNum + " radius = " + this.radius;
	}

	public double calculateAreaOfCircle() {
//		Circle areaOfCircle = new Circle();
		double a = Math.PI * Math.pow(radius, 2);
		return a;

	}

	public double calculateDiameter() {
//		Circle diameterOfCircle = new Circle();
		double a = radius * 2;
		return a;
	}

	public double calculateCircumference() {
		double a = 2 * Math.PI * radius;
		return a;
	}

}
