package typeinfo;

import java.util.Arrays;
import java.util.List;



abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape {
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape {
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape {
	public String toString() {
		return "Rhomboid";
	}
}

public class Shapes {

	public static void main(String[] args) {
		// Upcasting
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
		
		// Downcasting
		for(Shape shape : shapeList)
			shape.draw();
		
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
	}
	
}
