package interfaces.exercise;

import interfaces.exercise.ex5.BaseInterface;

public class Exercise5 implements BaseInterface{

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		Exercise5 exercise5 = new Exercise5();
		exercise5.m1();
		exercise5.m2();
		exercise5.m3();
	}
}
