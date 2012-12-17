package samples.behavioral.observer;

public class Client
{
	public static void main(String[] args)
	{
		ControlSystem system = new ControlSystem();
		system.addListener(new Lighting());
		system.addListener(new DashboardDisplay());
		system.startEngine();
		system.stopEngine();
	}
}
