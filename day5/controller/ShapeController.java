package com.skillstorm.week3.day5.controller;
import com.skillstorm.week3.day5.models.Rectangle;
import com.skillstorm.week3.day5.models.Shape;

public class ShapeController {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		System.out.println("Rect1 has an area of " + rect1.calculateArea(2, 4));
		System.out.println("Rect1 has a perimeter of " + rect1.calculatePerimeter(2, 4));
		System.out.println(rect1);
		Rectangle rect2 = new Rectangle();
		Shape[] rectangles = {rect1, rect2};
		rect1.setName("rect1");
		rect1.setHeight(2);
		rect1.setWidth(4);
		rect1.setArea(rect1.calculateArea(2, 4));
		rect2.setName("rect2");
		rect2.setHeight(17);
		rect2.setWidth(14);
		rect2.setPerimeter(rect2.calculatePerimeter(17, 14));
		System.out.println(rect1);
		System.out.println(rect2);
	}

}
