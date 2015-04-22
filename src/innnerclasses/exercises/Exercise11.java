package innnerclasses.exercises;

import innnerclasses.exercises.ex6.Ex9Interface;

class Test {
	private class Inner implements Ex9Interface {

		@Override
		public void methodOne() {
			System.out.println("Private Inner");
		}
		
	}
	
	public Ex9Interface getInner() {
		return new Inner();
	}
}

public class Exercise11 {
	
	public static void main(String[] args) {
		Test t = new Test();
		t.getInner().methodOne();
		// Error: cannot find symbol: class Inner:
		//(Inner)t.getInner().methodOne();
	}

}
