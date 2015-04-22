package innnerclasses.exercises;

import innnerclasses.exercises.ex6.Ex9Interface;

public class Exercise9 {
	
	public Ex9Interface say() {
		class Inner implements Ex9Interface {
			public void methodOne() {
				System.out.println("Inner");
			}
		}
		
		return new Inner();
	}

	public static void main(String[] args) {
		Exercise9 exercise9 = new Exercise9();
		exercise9.say().methodOne();
	}

}
