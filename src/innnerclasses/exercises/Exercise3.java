package innnerclasses.exercises;

public class Exercise3 {
	
	private String wordString;
	
	public Exercise3(String word) {
		this.wordString = word;
		System.out.println("Exercise1 class");
	}
	
	class Inner {
		
		public Inner() {
			System.out.println("Inner Class");
		}
		
		public String toString() {
			return wordString;
		}
		
	}
	
	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		Exercise3 exercise1 = new Exercise3("Hello World!");
		Inner inner = exercise1.getInner();
		System.out.println(inner.toString());
	}

}
