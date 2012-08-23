package samples.creational.abstractfactory;

import samples.commons.Chassis;
import samples.commons.Door;

public interface HondaFactory
{
	Chassis createChassis();
	Door createDoor();
}
