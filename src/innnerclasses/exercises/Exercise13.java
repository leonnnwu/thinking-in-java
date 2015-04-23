package innnerclasses.exercises;

interface Inner13 {
	void methodOne();
}

public class Exercise13 {
	public Inner13 think() {
		return new Inner13() {
			
			@Override
			public void methodOne() {
				System.out.println("Anonymous Inner class");
			}
		};
	}

	public static void main(String[] args) {
		Exercise13 exercise13 = new Exercise13();
		Inner13 inner13 = exercise13.think();
		inner13.methodOne();
	}

}
