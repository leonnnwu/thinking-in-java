package innnerclasses.exercises;

public class Exercise1 {
	
	public Exercise1() {
		System.out.println("Exercise1 class");
	}
	
	class Inner {
		
		public Inner() {
			System.out.println("Inner Class");
		}
		
	}
	
	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		Exercise1 exercise1 = new Exercise1();
		Inner inner = exercise1.getInner();
	}

}
