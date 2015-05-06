package typeinfo.pets;

import java.util.ArrayList;

public class Pets {
	
	public static final PetCreator CREATOR = new LiteralPetCreator();
	public static Pet randomPet() {
		return CREATOR.randomPet();
	}
	
	public static Pet[] createArray(int size) {
		return CREATOR.createArrayPets(size);
	}
	
	public static ArrayList<Pet> arrayList(int size) {
		return CREATOR.arrayList(size);
	}

}
