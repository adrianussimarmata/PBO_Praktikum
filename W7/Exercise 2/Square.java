package com.Exercise2;

public class Square extends Rectangle{

	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
	}
	
	public String toString() {
		return "Square[" + super.toString() + ", width=" + super.getWidth() + ", length=" + super.getLength() + "]";
	}
}
