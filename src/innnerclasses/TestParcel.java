package innnerclasses;

public class TestParcel {

	public static void main(String[] args) {
		Parcel4 parcel4 = new Parcel4();
		Contents c = parcel4.contents();
		Destination destination = parcel4.destination("San Jose");
		// Illegal -- Can't access private class;
		//Parcel4.PContents pc = parcel4.new PContents();
	}

}
