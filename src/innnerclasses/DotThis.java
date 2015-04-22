package innnerclasses;

public class DotThis {
	
	void f() {
		System.out.println("DotThis.f()");
	}
	
	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	
	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dThis = new DotThis();
		DotThis.Inner dtiInner = dThis.inner();
		dtiInner.outer().f();
	}

}
