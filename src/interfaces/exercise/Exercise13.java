package interfaces.exercise;

interface CanOne {
	void one();
}

interface CanTwo extends CanOne{
	void two();
}

interface CanThree extends CanTwo{
	void three();
}

interface CanFour extends CanTwo, CanThree {
	void four();
}

class Can implements CanFour {

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void four() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exercise13 {

	public static void main(String[] args) {
		Can can = new Can();
		((CanOne)can).one();
		((CanTwo)can).two();
		((CanThree)can).three();
	}

}
