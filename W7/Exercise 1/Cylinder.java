package com.Exercise1;

public class Cylinder extends Circle{

	private double height;
	
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea()*height;
	}
	
	@Override
	public double getArea() {		
		double area = super.getArea();
		return 2*Math.PI*super.getRadius()*height + 2*area;
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}	
}