package com.Exercise2;

public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("Shape");
		System.out.println("-----");
		
		Shape s1 = new Shape();
		System.out.println(s1.toString());

		Shape s2 = new Shape("blue", false);
		System.out.println(s2.toString() + "\n");
		
		System.out.println("\nCircle");
		System.out.println("------");
		
		Circle c1 = new Circle();
		System.out.println("Circle:"
				+ " radius=" + c1.getRadius()
				+ ", area=" + c1.getArea()
				+ ", perimeter=" + c1.getPerimeter());
		System.out.println(c1.toString() + "\n");
		
		Circle c2 = new Circle(2.0);
		System.out.println("Circle:"
				+ " radius=" + c2.getRadius()
				+ ", area=" + c2.getArea()
				+ ", perimeter=" + c2.getPerimeter());
		System.out.println(c2.toString() + "\n");
		
		Circle c3 = new Circle(2.0, "red", false);
		System.out.println("Circle:"
				+ " radius=" + c3.getRadius()
				+ ", area=" + c3.getArea()
				+ ", perimeter=" + c3.getPerimeter());
		System.out.println(c3.toString() + "\n");
		
		System.out.println("\nRectangle");
		System.out.println("---------");
		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle:"
				+ " width=" + r1.getWidth()
				+ ", length=" + r1.getLength()
				+ ", area=" + r1.getArea()
				+ ", perimeter=" + r1.getPerimeter());
		System.out.println(r1.toString() + "\n");
		
		Rectangle r2 = new Rectangle(4.0, 5.0);
		System.out.println("Rectangle:"
				+ " width=" + r2.getWidth()
				+ ", length=" + r2.getLength()
				+ ", area=" + r2.getArea()
				+ ", perimeter=" + r2.getPerimeter());
		System.out.println(r2.toString() + "\n");
		
		Rectangle r3 = new Rectangle(4.0, 5.0, "black", true);
		System.out.println("Rectangle:"
				+ " width=" + r3.getWidth()
				+ ", length=" + r3.getLength()
				+ ", area=" + r3.getArea()
				+ ", perimeter=" + r3.getPerimeter());
		System.out.println(r3.toString() + "\n");
		
		System.out.println("\nSquare");
		System.out.println("------");
		
		Square sq1 = new Square();
		System.out.println("Square:"
				+ " side=" + sq1.getSide()
				+ ", area=" + sq1.getArea()
				+ ", perimeter=" + sq1.getPerimeter());
		System.out.println(sq1.toString() + "\n");
		
		Square sq2 = new Square(2.0);
		System.out.println("Square:"
				+ " side=" + sq2.getSide()
				+ ", area=" + sq2.getArea()
				+ ", perimeter=" + sq2.getPerimeter());
		System.out.println(sq2.toString() + "\n");
		
		Square sq3 = new Square(5.0, "purple", false);
		System.out.println("Square:"
				+ " side=" + sq3.getSide()
				+ ", area=" + sq3.getArea()
				+ ", perimeter=" + sq3.getPerimeter());
		System.out.println(sq3.toString() + "\n");
	}
}
