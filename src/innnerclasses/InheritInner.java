package innnerclasses;

class WithInner {
	class Inner {}
}

public class InheritInner extends WithInner.Inner{
	//! InheritInner() {} // Won’t compile
	public InheritInner(WithInner withInner) {
		withInner.super();
	}
	
	public static void main(String[] args) {
		WithInner withInner = new WithInner();
		InheritInner ii = new InheritInner(withInner);
	}
	
	
}
