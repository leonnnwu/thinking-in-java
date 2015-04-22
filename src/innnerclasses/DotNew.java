package innnerclasses;

public class DotNew {
	public class Inner{}
	public static void main(String[] args) {
		DotNew dNew = new DotNew();
		DotNew.Inner dInner = dNew.new Inner();
	}

}
