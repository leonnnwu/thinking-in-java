package polymorphism.biking;

class Cycle {
	
	private String name = "Cycle";
	public static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}
	
	public String toString() {
		return this.name;
	}
	
	public int wheels() {
		return 0;
	}
	
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	
	public String toString() {
		return this.name;
	}
	
	public int wheels() {
		return 1;
	}
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	
	public String toString() {
		return this.name;
	}
	
	public int wheels() {
		return 2;
	}
	
}

class Tricycle extends Cycle {
	private String name = "Tricyle";
	
	public String toString() {
		return this.name;
	}
	
	public int wheels() {
		return 3;
	}
}

public class Biking {
	
	public static void ride(Cycle c) {
		Cycle.travel(c);
		System.out.println("Number of wheels: " + c.wheels());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle unicycle = new Unicycle();
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
		
		ride(unicycle);
		ride(bicycle);
		ride(tricycle);
	}

}
