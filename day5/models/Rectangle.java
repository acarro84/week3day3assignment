package com.skillstorm.week3.day5.models;

public class Rectangle extends Shape {
	final private int  NUMBER_OF_SIDES = 4;
	private double height;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(String name, int NUMBER_OF_SIDES, double height, double width) {
		this.name = name;
		this.height = height;
		this.width = width;
		
	}
	public int getNUMBER_OF_SIDES() {
		return NUMBER_OF_SIDES;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "This Rectangle is named " + name + " and has 4 sides with an area of " + getArea() + " and perimeter of" + getPerimeter();
	}
	public double calculateArea(double height, double width) {
		double area = height * width;
		return area;
	}
	public double calculatePerimeter(double height, double width) {
		double perimeter = 2*(height + width);
		return perimeter;
	}
	
}
