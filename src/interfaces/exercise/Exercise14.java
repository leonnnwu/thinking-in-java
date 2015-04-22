package interfaces.exercise;

import sun.tools.jar.resources.jar;

interface One {
	void oneOne();
	void oneTwo();
}

interface Two {
	void twoOne();
	void twoTwo();
}

interface Three {
	void threeOne();
	void threeTwo();
}

interface Four extends One, Two, Three {
	void four();
}

class A {
	private int i = 0;
	public void a() {};
}

abstract class C {
	private int i = 0;
	abstract void c();
}

class B extends C implements Four {
	
	private int i = 0;

	@Override
	public void oneOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oneTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void twoOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void twoTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void threeOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void threeTwo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void four() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void c() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exercise14 {
	
	public static void m1(One one) {
		one.oneOne();
	}
	
	public static void m2(Two one) {
		one.twoOne();
	}
	
	public static void m3(Three one) {
		one.threeOne();
	}
	
	public static void m4(Four one) {
		one.four();
	}
	

	public static void main(String[] args) {
		B b = new B();
		m1(b);
		m2(b);
		m3(b);
		m4(b);
	}

}
