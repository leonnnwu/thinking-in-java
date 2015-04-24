package innnerclasses.exercises;

interface Ex20In {
	class Nested {
		public Nested() {
			System.out.println("Nested()");
		}
		public void hi() {
			System.out.println("hi");
		}
	}
}

public class Exercise20 implements Ex20In{

	public static void main(String[] args) {
		Ex20In.Nested iNested = new Ex20In.Nested();
		iNested.hi();
	}

}
