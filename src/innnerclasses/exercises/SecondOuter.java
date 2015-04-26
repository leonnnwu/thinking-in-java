package innnerclasses.exercises;

class FirstOuter {
	public class FirstInner {
		public FirstInner(String s) {
			System.out.println("FirstOuter.FirstInner() " + s);
		}
	}
}

public class SecondOuter {
	public class SecondInner extends FirstOuter.FirstInner {

		public SecondInner(FirstOuter firstOuter) {
			firstOuter.super("hello");
			System.out.println("SecondOuter.SecondInner()");
		}
		
	}
	
	public static void main(String[] args) {
		FirstOuter fOuter = new FirstOuter();
		SecondOuter sOuter = new SecondOuter();
		SecondInner siInner = sOuter.new SecondInner(fOuter);
	}
}
