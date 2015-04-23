package innnerclasses.exercises;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

// Multiple extends
interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destroy() {

	}

	@Override
	public void menace() {

	}

	@Override
	public void kill() {

	}

	@Override
	public void drinkBlood() {

	}

}

public class Exercise14 {
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}
	
	public DangerousMonster monsterMaker() {
		return new DangerousMonster() {
			
			@Override
			public void menace() {
				System.out.println("DangerousMonster Menace");
			}
			
			@Override
			public void destroy() {
				System.out.println("DangerousMonster destroy");
			}
		};
	}
	
	public Vampire vampireMaker() {
		return new Vampire() {
			
			@Override
			public void kill() {
				System.out.println("Vampire kill");				
			}
			
			@Override
			public void menace() {
				System.out.println("Vampire menace");				
			}
			
			@Override
			public void destroy() {
				System.out.println("Vampire destroy");								
			}
			
			@Override
			public void drinkBlood() {
				System.out.println("Vampire drinkBlood");												
			}
		};
	}

	public static void main(String[] args) {
		Exercise14 exercise14 = new Exercise14();
		v(exercise14.monsterMaker());
	}

}
