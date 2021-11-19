package com.StudiKasus1;

abstract public class Shape {

	private String shapeName;
	
	public Shape(String s) {
		shapeName = s;
	}
	
	public String toString() {
		return shapeName;
	}
	
	abstract double area();
}
