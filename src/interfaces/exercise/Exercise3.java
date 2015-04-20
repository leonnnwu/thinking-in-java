package interfaces.exercise;

abstract class Base {
	protected abstract void print();
	public Base() {
		print();
	}
}

class Sub extends Base {
	private int i = 1;
	
	@Override
	protected void print() {
		System.out.println("Sub.i = " + i);
	}
}

public class Exercise3 {
	
	public static void main(String[] args) {
		Sub s = new Sub();
		s.print();
	}

}
