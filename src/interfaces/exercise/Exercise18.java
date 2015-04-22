package interfaces.exercise;

interface Cycle {
	void run();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void run() {
		System.out.println(this + " run");
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Bicycle implements Cycle {
	public void run() {
		System.out.println(this + " run");
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class Tricycle implements Cycle {
	public void run() {
		System.out.println(this + " run");
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
	
}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
	
}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}
	
}



public class Exercise18 {
	
	public static void runCycle(CycleFactory factory) {
		Cycle cycle = factory.getCycle();
		cycle.run();
	}

	public static void main(String[] args) {
		runCycle(new UnicycleFactory());
		runCycle(new BicycleFactory());
		runCycle(new TricycleFactory());
	}

}
