
public class Driver {

	public static void main(String[] args) {
		GameLogic game = new GameLogic(new ConsoleInputOutput());
		game.play();
	}

}