package innnerclasses;

public class Parcel1 {
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String labelString;
		public Destination(String whereTo) {
			labelString = whereTo;
		}
		String readLabel() {
			return labelString;
		}
	}
	
	//Using inner classes looks just like
	//using any other class, within Parcel1:
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}

}
