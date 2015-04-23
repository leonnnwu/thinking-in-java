package innnerclasses.exercises;

class One{
	private String s;
	public One(String s) {
		this.s = s;
	}
	public String showString() {
		return s;
	}
}

public class Exercise15 {
	
	public One getOne(String s) {
		return new One(s) {
			
		};
	}

	public static void main(String[] args) {
		Exercise15 exercise15 = new Exercise15();
		One one = exercise15.getOne("Ex15");
		System.out.println(one.showString());
	}

}
