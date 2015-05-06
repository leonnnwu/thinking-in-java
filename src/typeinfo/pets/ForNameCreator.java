package typeinfo.pets;

import java.util.ArrayList;
import java.util.List;


public class ForNameCreator extends PetCreator {
	
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	
	private static String[] typeNamesStrings = {
		"typeinfo.pets.Mutt",
		"typeinfo.pets.Pug",
		"typeinfo.pets.EgyptianMau",
		"typeinfo.pets.Manx",
		"typeinfo.pets.Cymric",
		"typeinfo.pets.Rat",
		"typeinfo.pets.Mouse",
		"typeinfo.pets.Hamster",
		"typeinfo.pets.Gerbil"
	};
	
	@SuppressWarnings("unchecked")
	private static void loader() {
		for(String name: typeNamesStrings)
			try {
				types.add((Class<? extends Pet>) Class.forName(name));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	static {loader();}
	
	public List<Class<? extends Pet>> types() {
		return types;
	}

}
