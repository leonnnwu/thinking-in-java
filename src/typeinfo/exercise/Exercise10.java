package typeinfo.exercise;

public class Exercise10 {

	public static void main(String[] args) {
		char[] c = new char[10];
		
		System.out.println("Superclass of char[] c: " + c.getClass().getSuperclass());
		System.out.println("char[] c instance of Object: " + (c instanceof Object));
		
	}

}
