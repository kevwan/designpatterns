package samples.creational.abstractfactory;

public class FitFactory implements HondaFactory
{
	public Chassis createChassis()
	{
		return new FitChassis();
	}

	public Door createDoor()
	{
		return new FitDoor();
	}
}
