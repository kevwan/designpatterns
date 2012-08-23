package samples.creational.abstractfactory;

import samples.commons.Chassis;
import samples.commons.Door;

public class CrvFactory implements HondaFactory
{
	public Chassis createChassis()
	{
		return new CrvChassis();
	}

	public Door createDoor()
	{
		return new CrvDoor();
	}
}
