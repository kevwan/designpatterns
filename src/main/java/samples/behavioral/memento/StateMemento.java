package samples.behavioral.memento;

public class StateMemento
{
	// might be more states
	private final int level;

	public StateMemento(int level)
	{
		this.level = level;
	}

	public int getLevel()
	{
		return level;
	}
}
