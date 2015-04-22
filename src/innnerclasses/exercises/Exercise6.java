package innnerclasses.exercises;

import innnerclasses.exercises.ex6.Exercise6Interface;
import innnerclasses.exercises.ex6.p2.Ex6Base;

public class Exercise6 extends Ex6Base{
	
	Exercise6Interface getExercise6Interface() {
		return this.new Ex6BaseInner();
	}
	
	public static void main(String[] args) {
		Exercise6 exercise6 = new Exercise6();
		exercise6.getExercise6Interface().methodOne();
	}

}
