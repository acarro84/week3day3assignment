package com.skillstorm.week3.day5.models;

public class Shape {
	protected String name;
	private double area;
	private double perimeter;
	
	public Shape() {
		this.name = "Shape";
		this.setArea(0);
		this.setPerimeter(0);
	}
	public Shape(String name, double area, double perimeter) {
		this.name = name;
		this.setArea(area);
		this.setPerimeter(perimeter);
	}
	@Override
	public String toString() {
		return "This Shape is named " + name + "and has an area of " + area + "and perimter of" + perimeter;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}
