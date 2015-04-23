package innnerclasses.exercises;

interface Cycle {
	void run();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {

	private Unicycle() {
	};

	public void run() {
		System.out.println(this + " run");
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

	public static CycleFactory factory = new CycleFactory() {

		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle {

	private Bicycle() {
	};

	public void run() {
		System.out.println(this + " run");
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

	public static CycleFactory factory = new CycleFactory() {

		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}

class Tricycle implements Cycle {
	private Tricycle(){};
	
	public void run() {
		System.out.println(this + " run");
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

	public static CycleFactory factory = new CycleFactory() {

		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}

public class Exercise16 {
	
	public static void runCycle(CycleFactory factory) {
		factory.getCycle().run();
	}

	public static void main(String[] args) {
		runCycle(Unicycle.factory);
		runCycle(Bicycle.factory);
		runCycle(Tricycle.factory);
	}

}
