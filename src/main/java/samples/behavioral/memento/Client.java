package samples.behavioral.memento;

public class Client
{
	public static void main(String[] args)
	{
		StateCaretaker caretaker = new StateCaretaker();
		GameOriginator game = new GameOriginator();
		game.play();
		game.printCurrentState();
		caretaker.addState(game.getCurrentState());
		game.play();
		game.printCurrentState();
		game.play();
		game.printCurrentState();
		game.restoreState(caretaker.getState(0));
		game.printCurrentState();
	}
}
