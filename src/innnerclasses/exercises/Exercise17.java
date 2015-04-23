package innnerclasses.exercises;

interface BetTool {
	void tossing();
}

interface BetToolFactory {
	BetTool getBetTool();
}

class Coin implements BetTool {

	private Coin() {
	};

	public String toString() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void tossing() {
		System.out.println(this + " tossing!");
	}

	public static BetToolFactory factory = new BetToolFactory() {

		@Override
		public BetTool getBetTool() {
			return new Coin();
		}
	};

}

class Dice implements BetTool {

	private Dice() {
	};

	public String toString() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void tossing() {
		System.out.println(this + " tossing!");
	}

	public static BetToolFactory factory = new BetToolFactory() {

		@Override
		public BetTool getBetTool() {
			return new Dice();
		}
	};
}

public class Exercise17 {
	
	public static void betTossing(BetToolFactory factory) {
		factory.getBetTool().tossing();
	}

	public static void main(String[] args) {
		betTossing(Coin.factory);
		betTossing(Dice.factory);

	}

}
