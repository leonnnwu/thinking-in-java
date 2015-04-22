package innnerclasses.exercises;


public class Exercise8 {
	
	class Inner {
		private String word = "Inner String";
	}
	

	public static void main(String[] args) {
		Exercise8 exercise8 = new Exercise8();
		Inner inner = exercise8.new Inner();
		System.out.println(inner.word);
	}

}
