package samples.structural.facade;

public class CarFacade
{
	private static class CarFacadeHolder
	{
		private static final CarFacade INSTANCE = new CarFacade();
	}

	private final Light light = new Light();
	private final AirConditioner conditioner = new AirConditioner();
	private final Engine engine = new Engine();

	public static CarFacade get()
	{
		return CarFacadeHolder.INSTANCE;
	}

	private CarFacade()
	{
	}

	public void stop()
	{
		light.turnOff();
		conditioner.turnOff();
		engine.turnOff();
	}

	public void start()
	{
		light.turnOn();
		conditioner.turnOn();
		engine.turnOn();
	}
}
