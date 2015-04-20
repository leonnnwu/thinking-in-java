package interfaces.exercise;

abstract class Base {
	
}

class Sub extends Base{
	protected void print() {
		System.out.println("Sub");
	}
}

abstract class Base2 {
	abstract void print();
}

class Sub2 extends Base2 {
	
	@Override
	protected void print() {
		System.out.println("Sub2");
	}
}



public class Exercise4 {
	
	public static void testPrint(Base b) {
		((Sub)b).print();
	}
	
	public static void testPrint2(Base2 b) {
		b.print();
	}
	
	public static void main(String[] args) {
		Sub s = new Sub();
		testPrint(s);
		Sub2 s2 = new Sub2();
		testPrint2(s2);
	}

}
