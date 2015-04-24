package innnerclasses.exercises;

interface Ex21Interface {
	String f();
	String g();
	
	class Inner {
		static void testIn(Ex21Interface ex21Interface) {
			System.out.println(ex21Interface.f() + ex21Interface.g());
		}
	}
}

public class Exercise21 implements Ex21Interface{

	public static void main(String[] args) {
		Exercise21 xEx21Interface = new Exercise21();
		Ex21Interface.Inner.testIn(xEx21Interface);
	}

	@Override
	public String f() {
		return "hello ";
	}

	@Override
	public String g() {
		return "world!";
	}

}
