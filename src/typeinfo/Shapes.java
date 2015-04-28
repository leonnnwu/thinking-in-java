package typeinfo;

import java.util.Arrays;
import java.util.List;



abstract class Shape {
	boolean flag = false;
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	public String toString() {
		return (flag ? "H" : "Unh") + "ighlighted " +"Circle";
	}
}

class Square extends Shape {
	public String toString() {
		return (flag ? "H" : "Unh") + "ighlighted " + "Square";
	}
}

class Triangle extends Shape {
	public String toString() {
		return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
	}
}

class Rhomboid extends Shape {
	public String toString() {
		return (flag ? "H" : "Unh") + "ighlighted " + "Rhomboid";
	}
}

public class Shapes {
	
	public static void rotate(Shape shape) {
		if(shape instanceof Circle) {
			System.out.println("It is Circle and can't rotate!");
		}
	}
	
	public static void setFlag(Shape s) {
		if(s instanceof Triangle) {
			s.flag = true;
		}
	}

	public static void main(String[] args) {
		// Upcasting
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		
		// Downcasting
		for(Shape shape : shapeList) {
			setFlag(shape);
			shape.draw();
		}
			
		
		Rhomboid r = new Rhomboid();
		((Shape) r).draw();
		
		// inconvertible types:
		// ((Circle)r).draw();
		
		// Upcast
		Shape shape = r;
		shape.draw();
		if(shape instanceof Rhomboid) {
			System.out.println("It is a Rhomboid");
		}
		
		Shape c = new Circle();
		rotate(c);
	}
	
}
