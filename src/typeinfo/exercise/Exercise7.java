package typeinfo.exercise;

import com.sun.tools.javac.resources.compiler;

class Candy {
	static {
		System.out.println("Loading Candy");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}

public class Exercise7 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: sweetName");
			System.exit(0);
		}
		
		Class c = null;
		try {
			c = Class.forName("typeinfo.exercise." + args[0]);
			System.out.println("Enjoy your " + args[0]);
		} catch(ClassNotFoundException e) {
			System.out.println("Couldn't find " + args[0]);
		}
	}

}
