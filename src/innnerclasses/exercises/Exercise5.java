package innnerclasses.exercises;

class Outter {
	class Inner{
		public Inner() {
			System.out.println("Exercise5 Inner");
		}
	}
}

public class Exercise5 {
	
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Inner ouInner = outter.new Inner();
	}

}
