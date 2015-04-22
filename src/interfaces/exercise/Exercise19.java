package interfaces.exercise;

interface BetTool{
	void tossing();
}

interface BetToolFactory {
	BetTool getBetTool();
}

class Coin implements BetTool {
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void tossing() {
		System.out.println(this + " tossing!");
	}
	
}

class Dice implements BetTool {
	public String toString() {
		return this.getClass().getSimpleName();
	}

	@Override
	public void tossing() {
		System.out.println(this + " tossing!");
	}
}

class CoinFactory implements BetToolFactory {

	@Override
	public BetTool getBetTool() {
		return new Coin();
	}
	
}

class DiceFactory implements BetToolFactory {
	public BetTool getBetTool() {
		return new Dice();
	}
}

public class Exercise19 {
	
	public static void tossing(BetToolFactory factory) {
		factory.getBetTool().tossing();
	}

	public static void main(String[] args) {
		tossing(new CoinFactory());
		tossing(new DiceFactory());
	}

}
