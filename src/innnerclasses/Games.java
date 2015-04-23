package innnerclasses;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checker implements Game {
	
	private Checker() {};
	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			return new Checker();
		}
	};
	
}

class Chess implements Game {
	
	private Chess() {};
	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			return new Chess();
		}
	};
	
}

public class Games {
	
	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		while(game.move())
			;
	}

	public static void main(String[] args) {
		playGame(Checker.factory);
		playGame(Chess.factory);
	}

}
