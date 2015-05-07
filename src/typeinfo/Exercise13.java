package typeinfo;


import java.util.ArrayList;
import java.util.List;

import typeinfo.pets.TypeCounter;

public class Exercise13 {

	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Part.class);
		List<Part> partList = new ArrayList<Part>();
		for (int i = 0; i < 20; i++) {
			partList.add(Part.createRandom());
		}
		
		for (Part part : partList) {
			System.out.print(part.getClass().getSimpleName() + " ");
			counter.count(part);
		}
		System.out.println();
		System.out.println(counter);
	}

}
