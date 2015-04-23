package innnerclasses.exercises;

interface Inner12 {
	void modifyOuter();
}

public class Exercise12 {
	
	private String word;
	public Exercise12(String word) {
		this.word = word;
	}
	private void say() {
		System.out.println(word);
	}
	
	public Inner12 inner() {
		return new Inner12() {

			@Override
			public void modifyOuter() {
				word = "new wrod";
				say();
			}
			
		};
	}
	
	public void think() {
		Inner12 inner12 = inner();
		inner12.modifyOuter();
	}

	public static void main(String[] args) {
		Exercise12 exercise12 = new Exercise12("Old word!");
		exercise12.say();
		exercise12.think();
	}

}
