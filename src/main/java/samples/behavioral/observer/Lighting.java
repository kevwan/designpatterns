package samples.behavioral.observer;

public class Lighting implements EngineListener
{
	public void onEngineStart()
	{
		System.out.println("Lights on!");
	}

	public void onEngineStop()
	{
		System.out.println("Lights off!");
	}
}
