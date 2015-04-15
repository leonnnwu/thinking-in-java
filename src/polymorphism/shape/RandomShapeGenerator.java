package polymorphism.shape;

import java.util.Random;

public class RandomShapeGenerator {
	
	private Random random = new Random(47);
	
	public Shape next() {
		switch (random.nextInt(4)) {
		default:
		case 0:
			return new Rectangle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		case 3:
			return new Circle();
		}
	}

}
