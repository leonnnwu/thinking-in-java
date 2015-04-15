package polymorphism.shape;

public class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Rectangle.erase()");
	}
	
	@Override
	public void exercise3() {
		System.out.println("Exercise3 - Triangle");
	}
}
