package innnerclasses.exercises.ex6.p2;

import innnerclasses.exercises.ex6.Exercise6Interface;

public class Ex6Base {
	protected class Ex6BaseInner implements Exercise6Interface {
		public Ex6BaseInner() {}
		public void methodOne() {
			System.out.println("Ex6Base.Ex6BaseInner + methodOne");
		}
	}

}
