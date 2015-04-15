package polymorphism.biking;

class Cycle {
	
	private String name = "Cycle";
	public static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}
	
	public String toString() {
		return this.name;
	}
	
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	
	public String toString() {
		return this.name;
	}
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	
	public String toString() {
		return this.name;
	}
	
}

class Tricycle extends Cycle {
	private String name = "Tricyle";
	
	public String toString() {
		return this.name;
	}
}

public class Biking {
	
	public static void ride(Cycle c) {
		Cycle.travel(c);
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
