package com.StudiKasus1;

public class Rectangle extends Shape{

	private double width;
	private double length;
	
	public Rectangle(double w, double l) {
		super("Rectangle");
		width = w;
		length = l;
	}
	
	public double area() {
		return length * width;
	}
	
	public String toString() {
		return super.toString() + " of width " + width + " and length " + length;
	}
}
