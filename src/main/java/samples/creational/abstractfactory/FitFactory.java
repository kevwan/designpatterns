package samples.creational.abstractfactory;

import samples.commons.Chassis;
import samples.commons.Door;

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
