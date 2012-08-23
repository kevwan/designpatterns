package samples.creational.abstractfactory;

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
