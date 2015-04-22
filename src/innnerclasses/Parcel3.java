package innnerclasses;

public class Parcel3 {
	
	class Contents {
		private int i =  11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String labelString;
		Destination(String whereTo) { labelString = whereTo; }
        String readLabel() { return labelString; }
	}

	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Parcel3.Contents pcContents = p.new Contents();
		Parcel3.Destination pDestination = p.new Destination("San Jose");
	}

}
