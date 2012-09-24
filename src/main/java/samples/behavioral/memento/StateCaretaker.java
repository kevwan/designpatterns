package samples.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class StateCaretaker
{
	private final List<StateMemento> states = new ArrayList<StateMemento>();

	public void addState(StateMemento state)
	{
		states.add(state);
	}

	public StateMemento getState(int index)
	{
		return states.get(index);
	}
}
