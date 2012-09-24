package samples.behavioral.memento;

public class GameOriginator
{
	private int level = 0;

	public StateMemento getCurrentState()
	{
		return new StateMemento(level);
	}

	public void play()
	{
		++level;
	}

	public void printCurrentState()
	{
		System.out.println("Current state: " + level);
	}

	public void restoreState(StateMemento state)
	{
		this.level = state.getLevel();
	}
}
