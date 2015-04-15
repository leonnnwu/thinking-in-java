package polymorphism.shape;

public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
	
	@Override
	public void exercise3() {
		System.out.println("Exercise3 - Triangle");
	}
}
