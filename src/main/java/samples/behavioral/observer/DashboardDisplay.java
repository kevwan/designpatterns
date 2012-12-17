package samples.behavioral.observer;

public class DashboardDisplay implements EngineListener
{
	public void onEngineStart()
	{
		System.out.println("Dashboard display on!");
	}

	public void onEngineStop()
	{
		System.out.println("Dashboard display off!");
	}
}
