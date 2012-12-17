package samples.behavioral.observer;

import java.util.ArrayList;
import java.util.Collection;

public class ControlSystem
{
	private final Collection<EngineListener> listeners = new ArrayList<EngineListener>();

	public void addListener(EngineListener listener)
	{
		listeners.add(listener);
	}

	public void startEngine()
	{
		for (EngineListener listener : listeners)
		{
			listener.onEngineStart();
		}
	}

	public void stopEngine()
	{
		for (EngineListener listener : listeners)
		{
			listener.onEngineStop();
		}
	}
}
