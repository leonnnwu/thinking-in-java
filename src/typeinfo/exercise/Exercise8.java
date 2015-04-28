package typeinfo.exercise;

class A {
	int i; String s;
}

class B extends A {
	int j; float f;
}

class C extends B {
	int k; B b;
}

public class Exercise8 {

	public static void Hierarchy(Object o) throws InstantiationException, IllegalAccessException {
//		if (o.getClass().getSuperclass() != null) {
//			System.out.println(o.getClass() + " is a subclass of "
//					+ o.getClass().getSuperclass());
//			try {
//				Hierarchy(o.getClass().getSuperclass().newInstance());
//			} catch (InstantiationException e) {
//				System.out.println("Unable to instantiate obj");
//			} catch (IllegalAccessException e) {
//				System.out.println("Unable to access");
//			}
//		}
		
		while(o.getClass().getSuperclass() != null) {
			System.out.println(o.getClass().getSimpleName());
			Object[] fields = o.getClass().getDeclaredFields( );
			for(Object object : fields) {
				System.out.println(object);
			}
			o = o.getClass().getSuperclass().newInstance();
		}
	}

	public static void main(String[] args) {
		try {
			Hierarchy(new C());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
