package innnerclasses.exercises;

import innnerclasses.exercises.ex6.Ex9Interface;

public class Exercise10 {
	
	public Ex9Interface say() {
		if (true) {
			class Inner implements Ex9Interface {
				public void methodOne() {
					System.out.println("Inner");
				}
			}
			return new Inner();
		}
		
		return null;
		
	}

	public static void main(String[] args) {
		Exercise10 exercise10 = new Exercise10();
		exercise10.say().methodOne();
	}

}
